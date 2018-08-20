/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $("#mensajeId").hide();
});

function obtenerIden(parametro){
    // $(document.getElementById("mensajeId")).innerHTML="";
    $(document.getElementById("mensajeId")).empty();
    if(parametro){
        $("#mensajeId").show();
        $(document.getElementById("mensajeId")).append("<strong>¡Error!</strong> Correo invalido");
        $(document.getElementById("formIden:autenticacion")).prop('disabled', true);
    }else{
         $(document.getElementById("mensajeId")).empty();
        $(document.getElementById("formIden:autenticacion")).prop('disabled', false);
        $("#mensajeId").hide();
    }
}