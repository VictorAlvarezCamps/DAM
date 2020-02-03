<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
	<?php
		$c = isset($_REQUEST["Celsius"]);
		$f = isset($_REQUEST["Fahrenheit"]);
		$ng = isset($_REQUEST["numgrados"]);
		$ng1 = isset($_REQUEST["numgrados"]);
		$ng2 = isset($_REQUEST["numgrados"]);

		if($_REQUEST==$c){

		$ng1=(9/5)*$ng+32;

		echo("$ng °C Celsius són $ng1 grados Fahrenheit");			

		}else{		

			if($_REQUEST==$f){

				$ng2=($ng-32)/(9/5);

				echo("$ng °C Fahrenheit són $ng2 grados Celsius");

			}else{

				if($_REQUEST==NULL){

					echo("Completa los campos para poder calcular los grados");

				}

			}

		}

		echo("<p><a href='convertir.html'>Volver</a></p>");
	?>
</body>
</html>