<?php

	$con = null;
	$idMod = "";

	
						
	include ("Conexion.php");
						
	$c = new ConexionBD(); 
	$con = $c->conectarse();

	$user = "" ;
	$password = "";
	$id="";

	if(isset($_POST["User"])){
		$user = $_POST["User"];
	}

	//$_SESSION['username'] = $user;

	if (isset($_POST["Password"])) {
		$password = $_POST["Password"];
	}

	$_SESSION['password'] = $password;
	
	
	$tsql = "SELECT * from Registro where Usuario = '".$user."' and Password = '".$password."' ;";

	$stmt = sqlsrv_query($con,$tsql);
																
	if( $stmt === false ){
		echo "Error al ejecutar consulta.</br>";
		die( print_r( sqlsrv_errors(), true));
	}

	$found=sqlsrv_fetch_array($stmt);

	$id = $found['id_Usuario'];

	if($found==null){

	}else{

		session_start();

		$_SESSION['valid'] = true;
        $_SESSION['timeout'] = time();
        $_SESSION['username'] = $user;
        $_SESSION['idRegistro'] = $id;
	}

	sqlsrv_free_stmt($stmt);
	sqlsrv_close($con);

?>