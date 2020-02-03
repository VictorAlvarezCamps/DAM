<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<a href="Busqueda.php">Volver</a>
</body>
</html>
<?php

	$con = null;
	$id = "";
	$idMod = "";
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	if(isset($_POST['id'])){
		$id = $_POST["id"];
	}
	
	$idCliMod = explode(',', $id);

	foreach ($idCliMod as $id) {
		$idMod = $id;
	}

	$tsql = "INSERT into TiempoAcciones (idAccion,Pause) values ('".$idMod."',SYSDATETIME());";


	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}
													
	return $stmt;
	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>