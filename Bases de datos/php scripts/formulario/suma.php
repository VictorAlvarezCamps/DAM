<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
	<?php
		$n1 = $_REQUEST["num1"];
		$n2 = $_REQUEST["num2"];
		
		$resultado = $n1 + $n2;
		echo("La suma de $n1 + $n2 es: $resultado");
		echo("<br>");
		echo("<p><a href='formulario.html'>Volver</a></p>");
	?>
</body>
</html>