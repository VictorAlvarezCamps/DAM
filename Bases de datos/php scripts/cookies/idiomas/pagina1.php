<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>
<?php
	if(isset($_COOKIE["idioma"]))
	{
		if($_COOKIE["idioma"]=="Español")
			header('Location:pagesp.html');
		elseif($_COOKIE["idioma"]=="Ingles")
			header('Location:pagen.html');	
	}else{
?>
<p>Selecciona el idioma de navegación</p>
<form id="form1" name="form1" method="post" action="elegiridioma.php">
  <p>
    <input type="radio" name="radio" id="Español" value="Español" />
    <label for="Español">Español</label>
  </p>
  <p>
    <input type="radio" name="radio" id="Ingles" value="Ingles" />
    <label for="Ingles">Inglés</label>
  </p>
  <p>
    <input type="submit" name="Enviar" id="Enviar" value="Crear cookie" />
  </p>
</form>
<p>&nbsp;</p>
<?php
	}
?>
</body>
</html>