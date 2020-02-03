<!DOCTYPE html>
<html>
<head>
	<title></title>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
</head>
<body>
	<h2>Comprueba tu correo, hemos enviado un correo con los datos</h2>
</body>
</html>
<?php
	
	$correo = "";
	$contra = "";
	$con = null;

	include ("Conexion.php");

	$c = new ConexionBD(); 
	$con = $c->conectarse();

	if(isset($_POST['correo'])){
		$correo = $_POST['correo'];
	}	
						
	$tsql = "SELECT * From Registro where Correo = '".$correo."'";


	$stmt = sqlsrv_query($con,$tsql);

	while( $row = sqlsrv_fetch_array( $stmt, SQLSRV_FETCH_ASSOC) ) {
      $contra = $row['Password'];
	}

	$mail = "Esta es tu contraseña con la que hicistes tu registro: ".$contra;
	//Titulo
	$titulo = "Recuperación de contraseña";
	//cabecera
	$headers = "MIME-Version: 1.0\r\n"; 
	$headers .= "Content-type: text/html; charset=iso-8859-1\r\n"; 
	//dirección del remitente 
	$headers .= "From:  \r\n";
	//Enviamos el mensaje a tu_dirección_email 
	$bool = mail($correo,$titulo,$mail,$headers);

?>