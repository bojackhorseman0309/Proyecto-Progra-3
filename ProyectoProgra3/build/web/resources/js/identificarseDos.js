/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function obtenerCon(parametro){
    if(parametro){
        $(document.getElementById("mens")).append("Contraseña invalida");
        $(document.getElementById("formIden:autenticacion")).prop('disabled', true);
    }else{
         $(document.getElementById("mens")).empty();
        $(document.getElementById("formIden:autenticacion")).prop('disabled', false);
    }
}