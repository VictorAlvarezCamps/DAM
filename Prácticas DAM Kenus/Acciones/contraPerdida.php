<!DOCTYPE html>
<html>
<head>
	<title>Recuperar contrase&ntilde;a</title>	
	<meta charset="utf-8">
	<link rel="stylesheet" href="css/default.css"/>	
	<link rel="stylesheet" href="css/normalize.css">
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css'>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
</head>
<body>
	<script>
		$(document).ready(function(){
			$('#Enviar').click(function(){
				if($('#correo').val()<= 0){
					alert('Introduce un correo para poder enviar los datos');
				}else{
					var regex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;

				    // Se utiliza la funcion test() nativa de JavaScript
				    if (regex.test($('#correo').val().trim())) {

				        alert('Correo validado');
				        $('#formulario').submit();

				    } else {

				        alert('La direccón de correo no es valida');
				    
				    }
				}
			});
		});
	</script>
	<form id="formulario" name="RecuperaContra" method="post" action="MailContra.php" style="margin-left: 45px;">
		<label for="correo"><h3><u>Introduce tu correo con el que te has registrado:</u></h3></label>
		<br>
		<input type="text" name="correo" id="correo">
		<br>
		<br>
		<input type="button" name="enviar" value="Enviar" id="Enviar">
	</form>

	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
	<script src='http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js'></script>
	<script src='http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore.js'></script>	
	<script src="js/index.js"></script>
</body>
</html>
