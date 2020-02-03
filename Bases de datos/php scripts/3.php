<a http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Documento sín título</title>
<head>
</head>
	<body>
		<?php
			/*Para definir variables constantes*/
			define("PI",3,14159);
			define("IVA",0.21);

			echo("El número es".PI);
			$precio=PI*IVA;
			echo("El valor de precio es:".$precio);
			/*isset() Sirve para mostrar el contenido de una variable*/
			echo('el resultado de isset() con \$variable es'.isset($variable1));
			echo"<br>";
			/*Como isset() no sabe cuál es el contenido de la variable le diremos esta vez el contenido declarando la variable1 y volvemos a mostrar el contenido de la variable*/
			$variable1="Hola";
			echo('el resultado de isset() con \$variable es'.isset($variable1));
			/*Con unset() borraremos el contenido de la variable que queramos borrar*/
			unset($variable1);
			echo"<br>";
			/*Al haberla borrado con unset y volviendo a hacer un isset() vemos que el contenido de la variable1 esta vacio*/
			echo('el resultado de isset() con \$variable es'.isset($variable1));
			/*Con gettype obtenemos de que tipo es el contenido de la variable que tengamos declarada (String,int,float,...,etc)*/
			echo("<br>".gettype(variable1));
		?>
	</body>