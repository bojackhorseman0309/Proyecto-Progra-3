/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function obtener(parametro){
    if(parametro){
        $(document.getElementById("mensaje")).append("Correo ya existe");
        $(document.getElementById("formulario:registro")).prop('disabled', true);
    }else{
         $(document.getElementById("mensaje")).empty();
        $(document.getElementById("formulario:registro")).prop('disabled', false);
    }
}

