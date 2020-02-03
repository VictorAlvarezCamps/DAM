<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8_bin"> 

<title>Documento sin t&iacute;tulo</title>
</head>

<body>
	<?php
	 $servidor="mysql://mycoach.cua8xanrei4u.us-west-2.rds.amazonas.com:3306/kukabuka";
	 //$servidor="127.0.0.1";
	 $usuario="kukabuka";
	 //$usuario="root";
	 $clave="kukabuka";
	 //$clave="tonphp";
	 
	 $conectado = @mysql_connect ($servidor,$usuario,$clave);
	 
	 mysql_select_db("kukabuka",$conectado);
	 
	?>
</body>
</html>
