<?php

	session_start();

	$con = null;
	$idMod = "";
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$id = $_POST["id"];
	$nom = $_POST["Nombre"];
	$acc = $_POST["Accion"];
	$res = $_POST["Resolucion"];
	$fec = $_POST["Fecha"];
	$est = $_POST["Estado"];
	$idRegistro=$_SESSION['idRegistro'];
	
	$tsql = "UPDATE Acciones set Nombre = '".$nom."', Accion = '".$acc."', Resolucion = '".$res."', Fecha = '".$fec."', Estado = '".$est."' where id_Accion = '".$id."' and id_Usuario = '".$idRegistro."';";

	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
													
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>
