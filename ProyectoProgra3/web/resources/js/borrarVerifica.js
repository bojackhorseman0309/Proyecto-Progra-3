/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    $("#mensajeId").hide();
});

function verificaCorreo(parametro){
    // $(document.getElementById("mensajeId")).innerHTML="";
    $(document.getElementById("mensajeId")).empty();
    if(parametro){
        $("#mensajeId").show();
        $(document.getElementById("mensajeId")).append("<strong>¡Error!</strong> Correo invalido");
        $(document.getElementById("formularioUp:borrar")).prop('disabled', true);
    }else{
         $(document.getElementById("mensajeId")).empty();
        $(document.getElementById("formularioUp:borrar")).prop('disabled', false);
        $("#mensajeId").hide();
    }
}