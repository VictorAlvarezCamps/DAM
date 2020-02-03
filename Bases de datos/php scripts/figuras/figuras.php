<?php
		$op1=isset($_POST["opcion1"]);
		$op2=isset($_POST["opcion2"]);
		$op3=isset($_POST["opcion3"]);
		$p=isset($_POST["perimetro"]);
		$a=isset($_POST["apotema"]);
		$l=isset($_POST["lado"]);
		$d=isset($_POST["diagonalmenor"]);
		$D=isset($_POST["diagonalmayor"]);
        $r=isset($_POST["radio"]);
		
		if(isset($_REQUEST["radio"])){
		
			switch($r){
			
				case "opcion1":
					
					$area=($p*$a)/2;
					
					$perimetro=$l*5;
					
					echo("El &aacute;rea del pent&aacute;gono es: $area y el per&iacute;metro del pent&aacute;gono es $perimetro");
					
					break;
				
				case "opcion2":
				
					$area=($p*$a)/2;
					
					$perimetro=$l*6;
					
					echo("El &aacute;rea del hex&aacute;gono es: $area y el per&iacute;metro del hex&aacute;gono es $perimetro");
					
					break;
					
				case "opcion3":
				
					$area=($D*$d)/2;
						
					$perimetro=$a*4;
						
					echo("El &aacute;rea del rombo es: $area y el per&iacute;metro del rombo es $perimetro");
					
					break;
					
			}
			echo("<br>");
			echo("<p><a href='figuras.php'>Volver al formulario</a></p>");
		}else{
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cálculo con figuras geométricas</title>
</head>

<body>
<b><h1>C&aacute;lculo con figuras geom&eacute;tricas</h1></b>
<form id="form1" name="form1" method="post" action="figuras.php">
  <p>Elige una de las 3 figuras:
</p>
  <table width="200" border="1">
    <tr>
      <td><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Pentagono_regular.svg/220px-Pentagono_regular.svg.png"/></td>
      <td><img src="http://www.portaldapalavra.com.br/ilustracoes/HEXAGONO.jpg" width="207" height="214"/></td>
      <td><img src="http://avisitacionf.galeon.com/imagenes/figrom.gif" width="135" height="223"/></td>
    </tr>
    <tr>
      <td><center><input type="radio" name="radio" id="radio" value="opcion1" />
      <label for="opcion1"></label></center></td>
      <td><center><input type="radio" name="radio" id="radio" value="opcion2" />
      <label for="opcion2"></label></center></td>
      <td><center><input type="radio" name="radio" id="radio" value="opcion3" />
      <label for="opcion3"></label></center></td>
    </tr>
  </table>
  <p>
    <label>Perímetro:
    <input type="text" name="perimetro" id="perimetro"/>
    </label>
  </p>
  <p>
    <label>Apotema:
    <input type="text" name="apotema" id="apotema"/>
    </label>
  </p>
  <p>
    <label>Lado:
    <input type="text" name="lado" id="lado"/>
    </label>
  </p>
  <p>
    <label>Diagonal menor:
    <input type="text" name="diagonalmenor" id="diagonalmenor"/>
    </label>
  </p>
  <p>
    <label>Diagonal mayor:
    <input type="text" name="diagonalmayor" id="diagonalmayor"/>
    </label>
  </p>
  <p>
    <label for="Lado"></label>
    <label>
    <input type="submit" name="Submit" value="Enviar" />
    </label>
    <label>
    <input type="reset" name="Submit2" value="Restablecer" />
    </label>
  </p>
</form>
<p>&nbsp;</p>
<?php
}
?>
</body>
</html>
