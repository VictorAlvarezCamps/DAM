<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Ca�da libre</title>
</head>

<body>
	<p>
	  <?php
		define("a",9.78); //aceleraci�n de la gravedad
		$limite=$_REQUEST["limite"];

		if (is_numeric($limite)) {
   		$tiempo=1; 	 
   			while ($tiempo <= $limite){
			$distancia = 0.5 * a * $tiempo * $tiempo;
			echo ("La distancia en el seg:$tiempo es $distancia metros<br>");
			$tiempo++;
  	 		}
 		}
		else echo ("El l�mite no es num�rico");
		echo("<a href='caida-libre.php'>Volver al formulario</a>");
	?>
	</p>
	<h1>Ca�da libre de un cuerpo </h1>
	<form id="form1" name="form1" method="post" action="caida-libre.php">
	  <label>L�mite: 
	  <input type="text" name="limite" />
	  </label>
      <p>
        <label>
        <input type="submit" name="Submit" value="Enviar" />
        </label>
        <label>
        <input type="reset" name="Submit2" value="Restablecer" />
        </label>
      </p>
	</form>
</body>
</html>
