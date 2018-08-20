/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $('#mensajeError').hide();
    $('#mensajeExito').hide();
});

function guardarInfo(){
    var id = document.getElementById("id").value;
    var nombre = document.getElementById("nombre").value;
    var cantidad = document.getElementById("cant").value;
    var precio = document.getElementById("precio").value;
    var imagen = document.getElementById("img").value;
    
    var jsonParametro = {
        id: id,
        nombre: nombre,
        cantidad: cantidad,
        precio: precio,
        imagen: imagen
    };
    
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/ProyectoProgra3/apiProductos/apiProd",
        data: JSON.stringify(jsonParametro),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(data){
            if(parseInt(data) == 1){
                   $('#mensajeExito').show();
                $('#mensajeExito').append("<strong>¡Exito!</strong> Se ha guardado el producto");
            }
               
            else{
                  $('#mensajeExito').show();
                 $('#mensajeError').append("<strong>¡Error!</strong> No se ha guardado el producto");
            }    
        },
        failure: function(errMsg){
            alert(errMsg);
        }
    });
}
