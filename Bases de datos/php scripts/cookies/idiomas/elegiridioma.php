<?php
	if($_REQUEST["radio"]=="Español")
		setcookie("idioma","Español",time()+60*60*24*365,"/");
	elseif($_REQUEST["radio"]=="Ingles")
		setcookie("idioma","Ingles",time()+60*60*24*365,"/");
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
<a href="pagina1.php">Volver</a>
</body>
</html>