<?php
	if($_REQUEST["radio"]=="Rojo")
		setcookie("color","#ff0000",time()+60*60*24*365,"/");
	elseif($_REQUEST["radio"]=="Verde")
		setcookie("color","#00ff00",time()+60*60*24*365,"/");
	elseif($_REQUEST["radio"]=="Azul")
		setcookie("color","#0000ff",time()+60*60*24*365,"/");
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
SE CREÓ LA COOKIE
<p>
<a href="colores.php">Volver</a>
</body>
</html>