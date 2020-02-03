<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Pirámide</title>
</head>

<body>
	<?php
		$tam=$_REQUEST["tamaño"];
		for ($i = 0; $i < $tam; $i++) {
 			for ($j = 0; $j < $tam - $i - 1; $j++)
   				echo '&nbsp'; for ($j = 0; $j <= $i; $j++) 								                echo '<b>*</b>'; 
 				echo '<br />'; 
		}
		echo("<p><a href='piramide.html'>Volver</a></p>");
	?> 
</body>
</html>