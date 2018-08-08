/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function obtenerIden(parametro){
    if(parametro){
        $(document.getElementById("mensajeId")).append("Correo invalido");
        $(document.getElementById("formIden:autenticacion")).prop('disabled', true);
    }else{
         $(document.getElementById("mensajeId")).empty();
        $(document.getElementById("formIden:autenticacion")).prop('disabled', false);
    }
}