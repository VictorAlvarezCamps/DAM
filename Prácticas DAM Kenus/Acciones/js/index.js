var $TABLE = $('#table');
var $TABLE2 = $('#TablaAcciones');
var miJSON;
var $BTN_Anyadir = $('#BotonAnyadir');
var idRegistros = "";
var idRegistroEliminado = "";
var idTiempo = "";
var idPlay = "";
var mostrar = "";

//Tabla Acciones

$('#btnMod').click(function () {
    var fila = $('#BusquedaClientes tr:last td');
    var id = "";
    var nom = "";
    var acc = "";
    var res = "";
    var fec = "";
    var est = "";
    var ResultFila = {};

    fila.each(function (pos) {
      ResultFila[pos] = $(this).text();
      idAcc = ResultFila[0];
      nom = ResultFila[1];
      acc = ResultFila[2];
      res = ResultFila[3];
      fec = ResultFila[4];
      est = ResultFila[5];
    });

    $.ajax({
      method: "POST",
      url: "GuardarDatosClientes.php",
      data: { id: idAcc,Nombre: nom, Accion: acc, Resolucion: res, Fecha: fec, Estado: est}
    }).done(function(html){});
});

//Añadir


$BTN_Anyadir.click(function () {
  var f = $('tr:last td', $("#BusquedaClientes")).length;
  
  var tds = '<tr>';

  tds += '<td></td><td contenteditable="true"></td><td contenteditable="true"></td><td contenteditable="true"></td><td contenteditable="true"></td><td contenteditable="true"></td><td contenteditable="true"></td><td></td>';
  tds += '</tr>';

  $("#BusquedaClientes").append(tds);

    $('#btnAdd').click(function (){

        var fila = $('#BusquedaClientes tr:last td');
        var nom = "";
        var acc = "";
        var res = "";
        var fec = "";
        var est = "";
        var ResultFila = {};

        fila.each(function (pos) {
          ResultFila[pos] = $(this).text();
          nom = ResultFila[1];
          acc = ResultFila[2];
          res = ResultFila[3];
          fec = ResultFila[4];
          est = ResultFila[5];
        });

        $.ajax({
          method: "POST",
          url: "AnyadirDatosClientes.php",
          data: { id: idRegistros,Nombre: nom, Accion: acc, Resolucion: res, Fecha: fec, Estado: est}
        }).done(function(html){});

   });

});

//Eliminar

$('.table-remove').click(function(){

  $(this).parent('td').parent('tr').children().each(function(){
          if($(this).attr('class') == "idClientes"){
            if(idRegistroEliminado.indexOf($(this).text()+",")==-1){
              idRegistroEliminado+=$(this).text()+",";
            }
          }
  });

    if(idRegistroEliminado.length != 0){
      idRegistroEliminado = idRegistroEliminado.substring(0,idRegistroEliminado.length-1);
    }

    $.ajax({
          method: "POST",
          url: "EliminarDatosClientes.php",
          data: { id: idRegistroEliminado}
        }).done(function(html){});

});

//inspeccion de objetos HTML

function inspeccionar(obj)
{
  var msg = '';

  for (var property in obj)
  {
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
  alert(msg);
}

//REGISTRO Y LOGIN


$('#enviar').click(function (){
        var nombre = $("#nombre").val();
        var usuario = $("#usuario").val();
        var password = $("#password").val();
        var correo = $("#correo").val();
        
        $.ajax({
          method: "POST",
          url: "RegistroUsuario.php",
          data: {Nombre: nombre, Usuario: usuario, contra: password, email: correo}
      }).done(function(html){});

        window.location.replace("index.php");

        alert("Registro correcto");
});

$('.loginUser').click(function (){

    var User = "";

    var user = $('#usuario').val();
    var pass = $('#password').val();
    var result;
    var id = "";
    var ResultFila = {};

    if((user!="")&&(pass!="")){

          result = $.ajax({          
              method: "POST",
              url: "ConsultaLogin.php",
              data: {User: user, Password: pass}
            }).done(function(data) {

              if(data == "null"){
                alert("Login incorrecto");
              }else{

                window.location.replace("busqueda.php");

                alert("Login correcto");

                  $('.registro').hide();

                  mostrar = "si";
            
                  MostrarBienvenida(mostrar);

              }

            });
          
      

    }else{

      alert("Rellena los campos del login");
    }   
});

$('body').keyup(function(e) {
        if(e.keyCode == 13) {
          $('.loginUser').click();0
        }
});

$('.txtDesc').click(function(user){

  mostrar = "no";

  setTimeout(function(){
    unset($_SESSION["username"]);
    unset($_SESSION["password"]);
  },2500);
   window.location.replace("index.php");
   MostrarBienvenida(mostrar);

});

function MostrarBienvenida(mostrar){
  
  if(mostrar === "si"){

    $('#Bienvenida').show('slow');

  }else{

    if(mostrar === "no"){

        $('.registro').show('slow');
      
    }

  }

}

  $('.play').on('click', function () {


        $(this).parent('td').parent('tr').parent('tbody').children().each(function(){
           var imgOpciones = $(this).children(".imgOpciones");
              var disabledImgOcipones = imgOpciones.children(".play").attr("disabled");
                if(typeof disabledImgOcipones !== typeof undefined && disabledImgOcipones != "undefined"){
                  var idAPausar = $(this).children(".idClientes").children().html();
                
                  $.ajax({
                    method: "POST",
                    url: "pause.php",
                    data: {id: idAPausar}
                  }).done(function(html){});
                  imgOpciones.children(".pause").attr("disabled", "disabled").css('opacity',0.5);
                  imgOpciones.children(".play").removeAttr("disabled").css('opacity',1);
                }
        });

          
          $(this).parent('td').parent('tr').children().each(function(){
            if($(this).attr('class') == "idClientes"){
              if(idTiempo.indexOf($(this).text())==-1){
                idTiempo=$(this).text();
              }
            }
          


             if($(this).attr('class') == "imgOpciones"){
              $(this).children().each(function(){
                if($(this).attr('class') == "play"){
                  $(this).attr('disabled','disabled').css('opacity',0.5);           
                }
                if($(this).attr('class') == "pause"){
                  $(this).removeAttr('disabled').css('opacity',1);           
                }

              });
            }
          });

           $.ajax({
            method: "POST",
            url: "play.php",
            data: {id: idTiempo}
          }).done(function(html){});

   });

$('.pause').click(function(){


    $(this).parent('td').parent('tr').children().each(function(){
      if($(this).attr('class') == "idClientes"){
        if(idTiempo.indexOf($(this).text())==-1){
          idTiempo=$(this).text();
        }
      }

      if($(this).attr('class') == "imgOpciones"){
        $(this).children().each(function(){
          if($(this).attr('class') == "pause"){
            $(this).attr('disabled','disabled').css('opacity',0.5);           
          }
          if($(this).attr('class') == "play"){
            $(this).removeAttr('disabled').css('opacity',1);           
          }
        });
      }

    });

    $.ajax({
      method: "POST",
      url: "pause.php",
      data: {id: idTiempo}
    }).done(function(html){});

});

$('.stop').click(function(){


  $(this).parent('td').parent('tr').children().each(function(){
    if($(this).attr('class') == "idClientes"){
      if(idTiempo.indexOf($(this).text())==-1){
        idTiempo=$(this).text();
      }
    }
    if($(this).attr('class') == "imgOpciones"){
      $(this).children().each(function(){
        if($(this).attr('class') == "pause"){
          $(this).attr('disabled','disabled').css('opacity',0.5);           
        }
        if($(this).attr('class') == "play"){
          $(this).removeAttr('disabled').css('opacity',1);           
        }
      });
    }
  });


    $.ajax({
      method: "POST",
      url: "stop.php",
      data: {id: idTiempo}
    }).done(function(html){});

});

$('.filaPintada td').each(function(){
    if($(this).attr('class').indexOf("celdaEst")!=-1){      
      if($(this).children().html() == "Pendiente"){
        $(this).parent().css("background-color","orange");
      }else{
        if($(this).children().html() == "Cerrado"){
          $(this).parent().css("background-color","#B40404");
        }else{
          if($(this).children().html() == "Abierto"){
            $(this).parent().css("background-color",'#04B431');
          }
        }
      }
    }
    
});

function AccionesDiaAnterior(){

    $.ajax({
      method:"POST",
      url:"DetectaTabla.php"
    }).done(function(html){});

}