<html>
<head>
<title>Kenus</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta charset="utf-8">	
	<link rel="stylesheet" href="css/default.css"/>	
	<link rel="stylesheet" href="css/normalize.css">
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css'>
</head>
<body>
<div id="container">
	<header class="cabecera">
		<div class="container">
			<div class="logo">
				<img src="./img/logo.png">
			</div>
			<div class="registro">
				<a href="registro.php" class="register">Registro</a>
				<a id="loginButton"><em>Login</em></a>
                <div style="clear:both"></div>
                <div id="loginBox">
                    <div id="loginForm">
                    	<table id="body">
                    		<tr>
                    			<td><label for="usuario">Usuario:</label></td>
                    			<td><input type="text" name="usuario" id="usuario" /></td>
                    		</tr>
                    		<tr>
                    			<td><label for="password">Password:</label></td>
                                <td><input type="password" name="password" id="password" /></td>
                    		</tr>
                    		<button id="login" class="loginUser">Entrar</button>
                            <span><a href="contraPerdida.php">Has olvidado tu contraseña?</a></span>
                    	</table>
                    </div>
                </div>
			</div>		
		</div>
	</header>
	<div id="banner">
		<h1>Este es el banner</h1>
	</div>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore.js'></script>	
<script src="js/login.js"></script>
<script src="js/index.js"></script>
</body>
</html>