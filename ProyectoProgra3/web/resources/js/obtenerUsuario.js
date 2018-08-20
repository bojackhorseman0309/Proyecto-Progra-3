/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    $("#avisoBorra").hide();
});

function borrarUsuario(parametro){
    // $(document.getElementById("mensajeId")).innerHTML="";
    $(document.getElementById("avisoBorra")).empty();
    if(parametro){
        $("#avisoBorra").show();
        $(document.getElementById("avisoBorra")).append("<strong>¡Exito!</strong> Usuario Borrado");
        $(document.getElementById("formularioUp:borrar")).prop('disabled', true);
    }else{
         //$(document.getElementById("avisoBorra")).empty();
          $(document.getElementById("avisoBorra")).append("<strong>¡Error!</strong> Usuario no pudo ser borrado");
        $(document.getElementById("formularioUp:borrar")).prop('disabled', false);
        //$("#avisoBorra").hide();
    }
}