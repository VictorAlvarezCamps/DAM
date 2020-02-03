<?php
	$con = null;
	$idMod = "";
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$nom = $_POST["Nombre"];
	$user = $_POST["Usuario"];

	if(isset($_POST["contra"])){
		$pass = $_POST["contra"];
	}
	if(isset($_POST["email"])){
		$correo = $_POST["email"];
	}
	$tsql = "INSERT INTO Registro (Nombre,Usuario,Password,Correo) values ('".$nom."','".$user."','".$pass."','".$correo."')";


	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
													
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);
?>