<?php

	$con = null;
	$id = "";
	$CambiaHora = "";
	$fecha = "";
	$result5 = "";
	$HorasMinSegs = "";
	$FechaAnterior = "";
	$idAccion = "";

	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$tsql = "SELECT idAccion, play, pause from TiempoAcciones T1 
        where t1.play <= DATEADD(d, -1, SYSDATETIME()) and
		(NOT EXISTS 
		(select * FROM TiempoAcciones T2 WHERE (T2.Pause > T1.PLAY OR T2.STOP > T1.PLAY)AND t1.idAccion = t2.idAccion) and T1.PLAY IS NOT NULL)
 		OR
  		(NOT EXISTS
  		(SELECT * FROM TiempoAcciones T2 WHERE (T2.PLAY > T1.Pause OR T2.Stop > T1.Pause) and  t1.idAccion = t2.idAccion)and T1.Pause IS NOT NULL);";

	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}

	while($row = sqlsrv_fetch_array($stmt)){
		$fecha = $row['play'];		
		$id = $row['idAccion'];
		$res = serialize($fecha);
		
		$result2 = explode(";" , $res);

		$result3 = $result2[1];

		$result4 = explode("\"", $result3);


		foreach ($result4 as $Datos) {
			$result5 = substr($Datos, 0);

			if(strrpos($result5, " ")){
				$HorasMinSegs = substr($result5,strpos($result5, " "));
				$FechaMod = substr($result5, strpos($result5, "s"));
				$FechaAnterior = substr($FechaMod,0,10);
				$MesDia = substr($FechaAnterior, 5);
				$Anyo = substr($FechaAnterior, 0, 4);
				$Mes = substr($MesDia, 0, 2);
				$Dia = substr($MesDia, 3);
			}			

		}

		$CambiaHora = $Anyo."-".$Dia."-".$Mes." 20:00:00";

		
	}

	echo $CambiaHora;

	$tsql2 = "INSERT INTO TiempoAcciones (idAccion,Pause) values ('".$id."','".$CambiaHora."');";
		
	$stmt2 = sqlsrv_query($con,$tsql2);

	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>