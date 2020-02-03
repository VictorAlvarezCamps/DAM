<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Discografica</title>
<script language="javascript">
function inicio(){
    window.location.href = "Index.php";
}
</script>
</head>

<body >
<h1>Discográficas</h1>
<br>
<button id="inicio" name="inicio" value="inicio" onclick="inicio();">Inicio</button>
<form nombre = "form" id="form" action="Introducir2.php" method="post">
<h2>Introduce una discografica</h2>
	<p>
	<label><strong>Nombre:</strong>
    <input name="nombre" type="text" id="nombre"/>
    </label>
    </p>
    <p>
    <label></label><strong>Email:</strong>
    <input name="email" type="text" id="email"/>
    </label>
  </p>
  <p>
	<label><strong>Año de fundación:</strong>
    <input name="anoFundacion" type="text" id="anoFundacion"/>
    </label>
    </p>
    <p>
    <label><strong>Pais:</strong>
    <input name="pais" type="text" id="pais"/>
    </label>
  </p>
   <p>
    <label><strong>Género:</strong>
    <select name="genero">
    <option value="Electro House">Electro House
    </option>
    <option value="Progressive House">Progressive House
    </option>
    <option value="Trance">Trance
    </option>
    </select>
  </p>
  <p>
    <label><strong>Descripción:</strong>
    </p>
    <p>
    <textarea name="descripcion" cols="50" rows="5"></textarea>
  </p>
  <input name="Enviar" type="submit" />
  </form>