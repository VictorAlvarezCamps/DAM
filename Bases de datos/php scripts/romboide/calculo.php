<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
	<?php
		$b= $_REQUEST["Base"];
		$a= $_REQUEST["Altura"];
		$r= $_REQUEST["radio"];

		if($r=="perimetro"){

		$perimetro=2$a+2$b;

		echo("El perimetro es: $perimetro <br>");

		}else{
			
		$area=$b*$a;
		
		echo("El área es: $area <br>");

		}

		echo("<p><a href='calculo.html'>Volver</a></p>");
	?>
</body>
</html>