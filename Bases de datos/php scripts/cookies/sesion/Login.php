<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="grabarsesion.php">
  <p>Inicio de sesión
</p>
  <p>
    <label for="Usuario">Usuario:</label>
    <input type="text" name="Usuario" id="Usuario" />
  </p>
  <p>
    <label for="Contraseña">Contraseña:</label>
    <input type="password" name="Contraseña" id="Contraseña" />
  </p>
  <p>
    <input type="submit" name="Enviar" id="Enviar" value="Enviar" />
    <input type="reset" name="Restablecer" id="Restablecer" value="Restablecer" />
  </p>
</form>
</body>
</html>