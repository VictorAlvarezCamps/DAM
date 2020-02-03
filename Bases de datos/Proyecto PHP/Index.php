<!--David Alòs Bosch-->
<!--Victor Alvarez Camps-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Discografica</title>
<script language="javascript">
function editar(){
	document.getElementById("form").action="Editar.php";
	document.getElementById("form").submit();
}
function introducir(){
	window.location.href = "Introducir.php";
}
function eliminar(){
	document.getElementById("form").action="Eliminar.php";
	document.getElementById("form").submit();
}
function ver(){
	document.getElementById("form").action="Ver.php";
	document.getElementById("form").submit();
}
</script>
</head>

<body>
<h1>Discográficas</h1>
<br>
<button id="editar" name="editar" value="editar" onclick="editar();">Editar</button>
<button id="ver" name="ver" value="ver" onclick="ver();">Ver</button>
<button id="eliminar" name="eliminar" value="eliminar" onclick="eliminar();">Eliminar</button>
<button id="introducir" name="introducir" value="introducir" onclick="introducir();">Introducir</button>
<form nombre = "form" id="form" action="" method="post">
<br />
<br>
			<?php
			
			require("ConexionBD.php");
			
			require("CrearBD.php");
			
			$consulta="select * from Discografica;";
			
			$hacerConsulta=mysql_query($consulta,$conectado);			
			
			while ($columna = mysql_fetch_array($hacerConsulta)){
				
					echo ("<input name='discografica' type='radio' id ='radio' value='".$columna["nombreDiscografica"]."'>".$columna["nombreDiscografica"]."</input><br><br>");
				
			}
			?>
        </form>
</div>
</body>
</html>
