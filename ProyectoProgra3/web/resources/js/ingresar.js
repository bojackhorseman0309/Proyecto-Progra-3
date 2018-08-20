/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $("#correoRegMens").hide();
});

function obtener(parametro){
    $(document.getElementById("correoRegMens")).empty();
    if(parametro){ 
        $("#correoRegMens").show();
        $(document.getElementById("correoRegMens")).append("<strong>¡Error!</strong> Correo ya existe");
        $(document.getElementById("formulario:registro")).prop('disabled', true);
    }else{
         $(document.getElementById("correoRegMens")).empty();
        $(document.getElementById("formulario:registro")).prop('disabled', false);
        $("#correoRegMens").hide();
    }
}

