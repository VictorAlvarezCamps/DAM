
<?php

	error_reporting(0);

	$con = null;
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();
?>

	<table id="EnMarcha" class="table" >
		<tr>
			<th><center>ID</center></th>
			<th><center>Nombre</center></th>
		</tr>
		<?php

		$play = "";
		$pausa = "";

		$resultado = TablaPlayPausa($con);
		while($row = sqlsrv_fetch_array($resultado)){
		?>		
			<tr class="fila" style="background-color: <?php 
				if($row[7] != null){ echo "lime"; }else{ echo "orange"; }
			?>" >
				<td><center><?php echo $row['Cod_Cli']?></center></td>
				<td><center><?php echo $row['Nombre']?></center></td>
			</tr>
		<?php
		}

		function TablaPlayPausa($con){

		$tsql = "SELECT C.*, T.PLAY, T.PAUSE from Clientes c left JOIN (select IDUSUARIO, play, PAUSE from TiempoClientes T1 where  
				(NOT EXISTS(SELECT * FROM TiempoClientes T2 WHERE (T2.Pause > T1.PLAY OR T2.STOP > T1.PLAY)	AND t1.idUsuario = t2.idUsuario) and T1.PLAY IS NOT NULL) OR (NOT EXISTS(SELECT * FROM TiempoClientes T2 WHERE (T2.PLAY > T1.Pause OR T2.Stop > T1.Pause) and  t1.idUsuario = t2.idUsuario)and T1.Pause IS NOT NULL)) t on c.Cod_Cli = t.idUsuario where T.Play IS NOT NULL or T.Pause IS NOT null;";

		$stmt = sqlsrv_query($con,$tsql);
																					
		if( $stmt === false ){
			echo "Error al ejecutar consulta.</br>";
			die( print_r( sqlsrv_errors(), true));
		}	
			

		return $stmt;
		sqlsrv_free_stmt($stmt);
		sqlsrv_close($con);

		}
		?>
	</table>