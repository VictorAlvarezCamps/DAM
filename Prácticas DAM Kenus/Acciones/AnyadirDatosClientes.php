<?php

	session_start();

	$con = null;
	$idMod = "";
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$nom = $_POST["Nombre"];
	$acc = $_POST["Accion"];
	$res = $_POST["Resolucion"];
	$fec = $_POST["Fecha"];
	$est = $_POST["Estado"];
	$idRegistro=$_SESSION['idRegistro'];

	$tsql = "INSERT into Acciones(id_Usuario,Nombre,Accion,Resolucion,Fecha,Estado) values ('".$idRegistro."','".$nom."','".$acc."','".$res."','".$fec."','".$est."') ;";

	$stmt = sqlsrv_query($con,$tsql);

	var_dump($tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
													
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>