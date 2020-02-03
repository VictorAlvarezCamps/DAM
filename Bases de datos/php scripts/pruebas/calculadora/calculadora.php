<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
	<?php
		
		$num1=$_REQUEST["num1"];
		$num2=$_REQUEST["num2"];
		
		switch(operacion){
			
			case sumar:
			
			$resultado=$num1+$num2;
			echo("El resultado de $num1 + $num2 es : $resultado");
			break;
			
			case restar:
			
			$resultado=$num1-$num2;
			echo("El resultado de $num1 - $num2 es : $resultado");
			break;
			
			case multiplicar:
			
			$resultado=$num1*$num2;
			echo("El resultado de $num1 * $num2 es : $resultado");
			break;
			
			case dividir:	
			
			$resultado=$num1/$num2;
			echo("El resultado de $num1 / $num2 es : $resultado");
			break;
			
		}		

		echo("<p><a href='calculadora.html'>Volver</a></p>");
	?>
</body>
</html>