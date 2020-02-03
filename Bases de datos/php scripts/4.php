<a http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Documento sín título</title>
<head>
</head>
	<body bgcolor="orange">
		<?php
			/*Arrays*/
			
			/*Declaramos la array nombres y le decimos que Pedro comience por la posicion 2 y Luis por la 7 y luego los mostramos por pantalla*/
			$nombres=array(2=>"Pedro","Juan",7=>"Luis",35);
			echo($nombres[2]."<br>");
			echo($nombres[3]."<br>");
			echo($nombres[7]."<br>");
			$nombre[8]=999;
			echo($nombres[8]."<br>");

			echo("<br>");
			echo("<br>");
			
			/*Declaramos la array amigo con los datos que queramos y los mostramos con los echo cada dato*/
			$amigo=array("nombre"=>"Pedro", "apellido"=>"Garcia", "telef"=>"61254785", "edad"=> 35);
			echo ($amigo["nombre"]."<br>");
			echo ($amigo["apellido"]."<br>");
			echo ($amigo["telef"]."<br>");
			echo ($amigo["edad"]."<br>");

			echo("<br>");
			echo("<br>");
			
			/*Array de arrays*/
			/*Declaramos la variable $amigos con una array como los anteriores casos y dentro de esta array podremos meter tantas arrays como datos queramos tener en nuestra variable*/
			$amigos=array(array("nombre"=>"Pedro", "apellido"=>"Garcia", "telef"=>"61254785", "edad"=> 35),
						array("nombre"=>"Juan", "apellido"=>"Gomez", "telef"=>"61574523", "edad"=> 25),
						array("nombre"=>"Toni", "apellido"=>"Fernando", "telef"=>"68421459", "edad"=> 45) );
			/*Podemos mostrar los datos de varias formas...por ejemplo de la siguiente forma cogemos especificamente un dato solo y lo mostramos*/
			echo($amigos[0]["edad"]."<br>");
			echo($amigos[2]["nombre"]."<br>");

			echo("<br>");
			echo("<br>");

			/*De la siguiente forma si queremos mostrar todos los datos de la array grande podemos hacerlo utilizando codigo html(insertando una tabla) y mostrandolo con echo*/
			/*Recuerda que para no confundir los datos entre php y html utiliza estas comillas para los datos de php -> "" y para los de html estas ''*/
			echo("<table width='200' border='1'>");
			echo("<tr>");
			echo("<th scope='col'>Nombre</th>");
			echo("<th scope='col'>Apellidos</th>"); 
			echo("<th scope='col'>Telefono</th>");
			echo("<th scope='col'>Edad</th>");
			echo("</tr>");
			echo("<tr>");
			echo("<td>".$amigos[0]["nombre"]."</td>");
			echo("<td>".$amigos[0]["apellido"]."</td>");
			echo("<td>".$amigos[0]["telef"]."</td>");
			echo("<td>".$amigos[0]["edad"]."</td>");
			echo("</tr>");
			echo("<tr>");
			echo("<td>".$amigos[1]["nombre"]."</td>");
			echo("<td>".$amigos[1]["apellido"]."</td>");
			echo("<td>".$amigos[1]["telef"]."</td>");
			echo("<td>".$amigos[1]["edad"]."</td>");
			echo("</tr>");
			echo("<tr>");
			echo("<td>".$amigos[2]["nombre"]."</td>");
			echo("<td>".$amigos[2]["apellido"]."</td>");
			echo("<td>".$amigos[2]["telef"]."</td>");
			echo("<td>".$amigos[2]["edad"]."</td>");
			echo("</tr>");
			echo("</table>");
			echo("<br>");
			echo("<br>");
			$totaldeamigos=count($amigos);
			echo("Tienes ".$totaldeamigos." amigos");
			echo("<br>");
			echo("<br>");
			
			/*Si queremos saber cuantos datos hay en total de dentro de una variable..con var_dump(variable1,variable2,...) podremos obtener este tipo de datos*/
			$v="pepe";
			var_dump($totaldeamigos, $v);
		?>
	</body>