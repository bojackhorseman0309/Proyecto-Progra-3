/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    $(document).ready(function(){
                $.get("http://localhost:8080/ProyectoProgra3/apiProductos/apiProd", function(data, status){
        var prod=data.productos;
        
        for (var i in prod) {
            $('<div></div>').attr({class: "col-sm-3", id: i}).appendTo("body");
            $('<fieldset></fiedlset>').attr({id: 'field'+i, style:'border: 1px'}).appendTo("#"+i+"");
            $('<legend>Producto</legend>').attr({id: 'field'+i}).appendTo("#field"+i+"");
            $('<img></img>').attr({src: prod[i].imagen, alt: prod[i].nombre, style: "width: 200px; height: 200px"}).appendTo("#field"+i+"");
            $('<br/>').appendTo("#field"+i+"");
             $('<label>Nombre del producto: </label>').attr({ class: 'lead'}).appendTo("#field"+i+"");$('<input></input>').attr({type: 'text' , value: prod[i].nombre, readonly: 'true', class: 'form-control '}).appendTo("#field"+i+"");
             $('<br/>').appendTo("#field"+i+"");
               $('<label>ID: </label>').attr({ class: 'lead'}).appendTo("#field"+i+"");$('<input></input>').attr({type: 'text' , value: prod[i].id, readonly: 'true', class: 'form-control'}).appendTo("#field"+i+"");
               $('<br/>').appendTo("#field"+i+"");
              $('<label>Cantidad: </label>').attr({ class: 'lead'}).appendTo("#field"+i+""); $('<input></input>').attr({type: 'text' , value: prod[i].cantidad, readonly: 'true', class: 'form-control'}).appendTo("#field"+i+"");
              $('<br/>').appendTo("#field"+i+"");
              $('<label>Precio: </label>').attr({ class: 'lead'}).appendTo("#field"+i+""); $('<input></input>').attr({type: 'text' , value: prod[i].precio, readonly: 'true', class: 'form-control'}).appendTo("#field"+i+"");
              $('<br/>').appendTo("#field"+i+"");
        } //fin de for
    }); 
  });
  
