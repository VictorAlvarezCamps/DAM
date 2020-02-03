<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
<?php
	$servidor="localhost";
	$usuario="root";
	$clave="tonphp";
	
	$conectado = @mysql_connect ($servidor,$usuario,$clave);
	if($conectado){
		echo("Se ha conectado al servidor MySQL");	
	}else{
		die("No se ha podido conectar al servidor MySQL");	
	}
	
	$baseDeDatos="gestion";
	mysql_select_db($baseDeDatos,$conectado);
	
	
		
?>
</body>
</html>