<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<HTML>
	<HEAD>
		<TITLE>KUKABUKA</TITLE>
		<meta name="google-translate-customization" content="b2da37e47cf0d3ce-f3dce82887180d57-g8e0323bd85e63e43-10"></meta>
		<link rel="icon" type="image/png" href="/img/manxbc.ico" />
        
	</HEAD>
	<style>
	body {
	background-image:url(img/fondo-kuka.jpg);
	background-attachment: fixed;
	background-repeat: repeat;
	width: 100%;
	margin: auto;
	}
	.div1 {
		 float: left;
		 margin: 0 2px;
		 border-radius: 44px 44px 44px 44px; 
		 -moz-border-radius: 44px 44px 44px 44px;
		 -webkit-border-radius: 44px 44px 44px 44px;
		 border: 11px solid #000000;
	}
	ul.navbar li{
		list-style-type: none;
		padding: 80px;
		margin: 30px;
		position: static;
		top: 2em;
		left: 1em;
		width: 9em;
		display: inline;
	}
	ul.navbar li {
		background: none;
		margin: 0.5em 0;
		padding: 0.3em;
	}
	ul.navbar a {
		text-decoration: none;
	}
	a:link {
		color: blue 
	}
	a:visited {
		color: purple 
	}
	button.css3button {
		font-family: Arial, Helvetica, sans-serif;
		font-size: 13px;
		float: left;
		margin: 0 auto;
		color: #ff0000;
		padding: 5px 20px;
		background: -moz-linear-gradient(
			top,
			#000000 0%,
			#ff0000);
		background: -webkit-gradient(
			linear, left top, left bottom, 
			from(#000000),
			to(#ff0000));
		-moz-border-radius: 6px;
		-webkit-border-radius: 6px;
		border-radius: 6px;
		border: 1px solid #ff0000;
		-moz-box-shadow:
			0px 1px 22px rgba(255,0,0,0.5),
			inset 0px 0px 1px rgba(255,0,0,1);
		-webkit-box-shadow:
			0px 1px 22px rgba(255,0,0,0.5),
			inset 0px 0px 1px rgba(255,0,0,1);
		box-shadow:
			0px 1px 22px rgba(255,0,0,0.5),
			inset 0px 0px 1px rgba(255,0,0,1);
		text-shadow:
			0px -1px 0px rgba(000,000,000,0.7),
			0px 1px 0px rgba(255,255,255,0.3);
	}
	.enlace_verde a{
		color:#ffffff;
	}
	.div1 {
		 float: left;
		 margin: 0 2px;
		 border-radius: 44px 44px 44px 44px;
		 -moz-border-radius: 44px 44px 44px 44px;
		 -webkit-border-radius: 44px 44px 44px 44px;
		 border: 11px solid #000000;
	}
	</style>
<body>
<img src="img/logoKukabuka.png" height="120" width="120">
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	<img src="img/titulo.png" height="130" width="400">
	<div id="google_translate_element"></div><script type="text/javascript">
		function googleTranslateElementInit() {
  			new google.translate.TranslateElement({pageLanguage: 'es', layout: google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');
		}
		</script><script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	&nbsp;
	<ul class="navbar">
	  <li><button type="button" name="inicio" value="inicio" class="css3button"><span class="enlace_verde"><a href="inicio.html" target="_top">Inicio</a></button>
	  <li><button type="button" name="Integrantes" value="Integrantes" class="css3button" ><span class="enlace_verde"><a href="integrantes.html" target="_top">&iquest;Qui&eacute;nes somos?</a></button>
	  <li><button type="button" name="Idea" value="Idea" class="css3button"><span class="enlace_verde"><a href="idea.html" target="_top">La idea de Kukabuka</a></button>
	  <li><button type="button" name="porqueidea" value="porqueidea" class="css3button"><span class="enlace_verde"><a href="porquekuka.html" target="_top">&iquest;Por qu&eacute; Kukabuka?</a></button>
	  <li><button type="button" name="librovisita" value="librovisita" class="css3button"><span class="enlace_verde"><a href="librovisita.html" target="_top">Danos tu opini&oacute;n!</a></button>
	 <button type="button" name="enlacesinteres" value="enlacesinteres" class="css3button"><span class="enlace_verde"><a href="enlacesinteres.html" target="_top">Enlaces de inter&eacute;s</a></button>
	</ul>
<div class="div1" style="overflow: auto; width: 1100px; height: 650px; background-color:#F00000; border: 3px solid ;">
	<?php 
    	function recogeDato($campo){ 
        return isset($_REQUEST[$campo])?$_REQUEST[$campo]:'';
     }
      
     $nombre    = recogeDato('Nombre');
	 $apellido	= recogeDato('Apellidos');
	 $correo    = recogeDato('correo');
     $consulta  = recogeDato('opinion');
     $algunerror = FALSE;
     
    if($nombre==''){
         $algunerror = TRUE;
         echo "<p class=\"erroneo\">No has introducido tu nombre.</p>\n";
    }
	if($apellido==''){
         $algunerror = TRUE;
         echo "<p class=\"erroneo\">No has introducido tus apellidos</p>\n";
	}
	if($correo==''){
         $algunerror = TRUE;
         echo "<p class=\"erroneo\">No has introducido tu e-mail</p>\n";
	}
    if($consulta==''){
         $algunerror = TRUE;
         echo "<p class=\"erroneo\">El área de la opinión no puede quedarse vacío.</p>\n";
    }
     if ($algunerror){ 
         echo "<p>&nbsp;</p>\n";
         echo "<p>No se ha podido enviar el mensaje por los errores que se detallan arriba.</p>\n";
         echo "<p>Por favor, vuelve a rellenar el formulario.</p>\n";
         echo "<p class=\"centrado\"><a href=\"contacto.html\">Volver al formulario</a></p>\n";
      }else{
         $para="kukabukaapp@gmail.com";
         $asunto="Opinión usuario de kukabuka - consulta sobre ".$referente;
         $mensaje="Datos del formulario de contacto:\n".
         "Nombre: ".$nombre." \n".
		 "Apellido: ".$apellido." \n".
         "E-mail:  ".$correo."\n".
         "Opinion de la web: ".$consulta;
         mail($para, $asunto, $mensaje);
		 echo "<br>";
		 echo "<br>";
         echo "<p><center><font color='white'>Tu opini&oacute;n se ha enviado correctamente. Gracias por contactar con nosotros.</font></center></p>\n";
         echo "<p><center><font color='white'>Nos pondremos en contacto lo antes posible.</font><center></p>\n";
		 echo "<br>";
		 echo "<center><a href='inicio.html'><font color='black'><h1>Volver</h1></font></a></center>";
      }
    ?>
</div>
<p>&nbsp;</p>
	</div>
	<div class="div1" style="overflow: auto; width: 300px; height: 50px; background-color:#F00000; border: 3px solid ;">
	&nbsp;&nbsp;<font size="5" color="white"><B> Siguenos en:</B></FONT>
	&nbsp;
	&nbsp;
	&nbsp;
		<a href="https://www.facebook.com/profile.php?id=100009519152587" target="_blank"><img src="img/facebook_icon.png" height="40" width="40" alt="Facebook"></A>
		<a href="https://twitter.com/Kukabuka_" target="_blank"><img src="img/twitter-logo.png" height="40" width="40" alt="Twitter"></A>
	</div>
</body>
</html>