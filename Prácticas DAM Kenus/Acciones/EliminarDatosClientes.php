<?php

	session_start();

	$con = null;
	$idMod = "";
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();
	
	$id = $_POST["id"];
	$idRegistro=$_SESSION['idRegistro'];

	$idCliMod = explode(',', $id);

	foreach ($idCliMod as $id) {
		$idMod = $id;
	}

	$tsql = "DELETE FROM Acciones where id_Accion = ".$idMod." and id_Usuario = '".$idRegistro."';";

	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
													
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>