/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $("#mens").hide();
});

function obtenerCon(parametro){
     //$(document.getElementById("mens")).innerHTML="";
     $(document.getElementById("mens")).empty();
    if(parametro){
        $("#mens").show();
        $(document.getElementById("mens")).append("<strong>¡Error!</strong> Contraseña invalida");
        $(document.getElementById("formIden:autenticacion")).prop('disabled', true);
    }else{
         $(document.getElementById("mens")).empty();
        $(document.getElementById("formIden:autenticacion")).prop('disabled', false);
        $("#mens").hide();
    }
}