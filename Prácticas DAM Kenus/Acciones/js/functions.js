var editando=false;

function transformarEnEditable(nodo){
//El nodo recibido es SPAN
	if (editando == false) {


		

		var nodoTd = nodo.parentNode; //Nodo Span
		var nodoTr = nodoTd.parentNode.parentNode; //Nodo TR
		var nodoContenedorForm = document.getElementById('contenedorForm'); //Nodo DIV
		var nodosEnTr = nodoTr.childNodes;


		var id = nodosEnTr[1].textContent;
		var Accion = nodosEnTr[3].textContent;
		var Resolucion = nodosEnTr[5].textContent;
		var Fecha = nodosEnTr[7].textContent;
		var Descripcion = nodosEnTr[9].textContent;
		var opciones = nodosEnTr[11].textContent;


		var nuevoCodigoHtml = '<td><input type="text" name="id" id="idAccion" value="'+id+'" size="1" disabled="disabled"></td>'+
		'<td><input type="text" name="Accion" id="Accion" value="'+Accion+'" size="30"</td>'+
		'<td><input type="text" name="Resolucion" id="Resolucion" value="'+Resolucion+'" size="30"</td>'+
		'<td><input type="text" name="Fecha" id="Fecha" value="'+Fecha+'" size="10"</td>'+
		'<td><input type="text" name="Descripcion" id="Descripcion" value="'+Descripcion+'" size="30"</td>';
		 
		nodoTr.innerHTML = nuevoCodigoHtml;
		 
		nodoContenedorForm.innerHTML = '<br>'+'<font style="margin-left:45px">'+'Pulse Guardar para guardar los cambios o cancelar para anularlos'+'</font>'+
		'<form name = "formulario" action="guardardatos.php" method="get" onsubmit="capturarEnvio()" onreset="anular()">'+
		'<br>'+'<input class="boton" type = "submit" value="Guardar" style="margin-left:45px"> <input class="boton" type="reset" value="Cancelar">';

		editando = "true";

	}else {

		alert ('Solo se puede editar una línea. Recargue la página para poder editar otra fila');

	}
}

function inspeccionar(obj){

  var msg = '';

  for (var property in obj){

    if (typeof obj[property] == 'function')

    {
      var inicio = obj[property].toString().indexOf('function');

      var fin = obj[property].toString().indexOf(')')+1;

      var propertyValue=obj[property].toString().substring(inicio,fin);

      msg +=(typeof obj[property])+' '+property+' : '+propertyValue+' ;\n';

    }

    else if (typeof obj[property] == 'unknown')

    {

      msg += 'unknown '+property+' : unknown ;\n';

    }

    else

    {

      msg +=(typeof obj[property])+' '+property+' : '+obj[property]+' ;\n';

    }

  }

  return msg;

}

 
function capturarEnvio(){
	
	var nodoContenedorForm = document.getElementById('contenedorForm'); //Nodo DIV
	nodoContenedorForm.innerHTML = '<br>'+'<font style="margin-left:45px">'+'Pulse Guardar para guardar los cambios o cancelar para anularlos'+'</font>'+'<br>'+
	'<form name = "formulario" action="guardardatos.php?id="'+document.querySelector('#idAccion').value+
	'&Accion="'+document.querySelector('#Accion').value+'"&Resolucion="'+document.querySelector('#Resolucion').value+'"&Fecha="'+document.querySelector('#Fecha').value+'"&Descripcion="'+document.querySelector('#Descripcion')+'"" method="get" onsubmit="capturarEnvio()" onreset="anular()">'+
	'<input type="hidden" name="id" value="'+document.querySelector('#idAccion').value+'" >'+
	'<input type="hidden" name="Accion" value="'+document.querySelector('#Accion').value+'">'+
	'<input type="hidden" name="Resolucion" value="'+document.querySelector('#Resolucion').value+'">'+
	'<input type="hidden" name="Fecha" value="'+document.querySelector('#Fecha').value+'">'+
	'<input type="hidden" name="Descripcion" value="'+document.querySelector('#Descripcion').value+'">'+
	'<input class="boton" type = "submit" value="Guardar" class="buttons" style="margin-left:45px"> <input class="boton" type="reset" value="Cancelar" class="buttons">';

	document.formulario.submit();

}
 
function anular(){
	window.location.reload();
}