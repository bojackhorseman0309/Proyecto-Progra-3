/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    $("#editCon").hide();
});

function obtenerUpdate(parametro){
    $(document.getElementById("editCon")).empty();
    if(parametro){ 
        $("#editCon").show();
        $(document.getElementById("editCon")).append("<strong>¡Error!</strong> Correo no existe");
        $(document.getElementById("formularioUp:registroUp")).prop('disabled', true);
    }else{
         $(document.getElementById("editCon")).empty();
        $(document.getElementById("formularioUp:registroUp")).prop('disabled', false);
        $("#editCon").hide();
    }
}