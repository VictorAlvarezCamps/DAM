<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
<?php
	//Incluimos el script que conecta y selecciona la BD
	require ("usarGestion.php");
	
	$consulta="INSERT INTO proveedores (codigoproveedor,nombreproveedor,direccionproveedor,telefonoproveedor,ciudadproveedor,provinciaproveedor,emailproveedor) VALUES ();";
	
	echo ($consulta."<br>");
	
	//ejecuta consulta
	
	$hacerconsulta=mysql_query($consulta,$conectado);
	$numeroError=mysql_errno();
	$tipoError=mysql_error();
	echo("Numero de error: $numeroError <br>");
	echo("Descripcion error: $tipoError <br>");
	
	if ($hacerconsulta){
		echo ("Se ha grabado el registro");
		
	}else{
		echo ("No se ha grabado el registro");	
	}
?>
</body>
</html>