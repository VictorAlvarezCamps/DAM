<?php
	$con = null;

	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$tsql = "SELECT C.*, T.PLAY, T.PAUSE from Clientes c
		left JOIN (select IDUSUARIO, play, PAUSE from TiempoClientes T1
		where  (NOT EXISTS(SELECT * FROM TiempoClientes T2 WHERE T2.Pause > T1.PLAY OR T2.STOP > T1.PLAY) and T1.PLAY IS NOT NULL) 
		OR (NOT EXISTS(SELECT * FROM TiempoClientes T2 WHERE T2.PLAY > T1.Pause OR T2.Stop > T1.Pause)and T1.Pause IS NOT NULL)) t on c.Cod_Cli = t.idUsuario;";


	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
												
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);
?>