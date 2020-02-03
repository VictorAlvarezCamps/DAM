<!DOCTYPE html>
<html>
<head>
	<title>Registro de Usuario</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
	
	<link rel="stylesheet" href="css/registro.css"/>	
	<link rel="stylesheet" href="css/normalize.css">
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css'>

</head>
<body>
	<br>
	<br>
	<form id="FormRegistro" name="registro" method="post">
		Nombre:
		<br>
		<input name="nombre" type="text" id="nombre" class="formRegistro">
		<br>
		Usuario:
		<br>
		<input name="usuario" type="text" id="usuario" class="formRegistro">
		<br>
		Password:
		<br>
		<input name="password" type="password" id="password" class="formRegistro">
		<br>
		E-mail:
		<br>
		<input name="correo" type="text" id="correo" class="formRegistro">
		<br>
		<br>
		<input name="enviar" type="button" id="enviar" value="Enviar">
		<input name="restablecer" type="reset" id="restablecer" value="Restablecer campos">
	</form>

	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
	<script src='http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore.js'></script>	
	<script src="js/index.js"></script>
</body>
</html>
<?php
	

?>