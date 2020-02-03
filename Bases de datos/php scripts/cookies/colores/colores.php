<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
<?php
	if(isset($_COOKIE["color"])) echo " bgcolor=\"$_COOKIE[color]\""
?>
<p>Selecciona el color:</p>
<form id="form1" name="form1" method="post" action="elegircolor.php">
  <p>
    <input type="radio" name="radio" id="Verde" value="Verde" />
    <label for="Español">Verde</label>
  </p>
  <p>
    <input type="radio" name="radio" id="Rojo" value="Rojo" />
    <label for="Ingles">Rojo</label>
  </p>
  <p>
    <input type="radio" name="radio" id="Azul" value="Azul" />
    <label for="Ingles">Azul</label>
  </p>
  <p>
    <input type="submit" name="Enviar" id="Enviar" value="Crear cookie" />
  </p>
</form>
<p>&nbsp;</p>
</body>
</html>