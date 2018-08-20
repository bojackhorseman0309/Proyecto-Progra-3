/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import com.productos;
import dao.Producto;
import dao.ProductoLista;
import dao.ProductoRepositorio;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 * REST Web Service
 *
 * @author Alonso
 */
@Path("apiProd")
public class ProdRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProdRest
     */
    public ProdRest() {
    }

    /**
     * Retrieves representation of an instance of com.ws.ProdRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
          ProductoLista.cargarDatos();
          List<Producto> listaProd = ProductoLista.getListaProducto();
        
//        if(productos.isEmpty()){
//              PersonaLista.inicializar();
//        }
          
        
        JsonArrayBuilder arregloProductos = Json.createArrayBuilder();
        
        for(Producto producto : listaProd){
            JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
            JsonObject jsonObject = jsonObjectBuilder.add("id", producto.getIdProd())
                                        .add("nombre", producto.getNomProd())
                                        .add("cantidad", producto.getCantProd())
                                        .add("precio", producto.getPrecioProd())
                                        .add("imagen", producto.getImagen())
                                        .build();
            arregloProductos.add(jsonObject);
        }
        JsonObjectBuilder jsonObjectBuilder2 = Json.createObjectBuilder();
        JsonObject jsonFinal = jsonObjectBuilder2.add("productos",arregloProductos).build();
        StringWriter tira = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(tira);
        jsonWriter.writeObject(jsonFinal);
        return tira.toString();
    }

   
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public static void postJson(String content) throws JSONException {
//        Producto producto = new Producto(); 
//        JSONArray jsonArray = new JSONArray(content);
//        for (int i = 0; i < jsonArray.length(); i++) {
//             JSONObject jsonObject = jsonArray.getJSONObject(i);
//             producto.setIdProd(jsonObject.getString("idProd"));
//             producto.setNomProd(jsonObject.getString("nomProd"));
//             producto.setCantProd(jsonObject.getString("cantProd"));
//             producto.setPrecioProd(jsonObject.getString("precioProd"));
//             ProductoLista.agregar(producto);
//        }
//    }
    
     @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int postJson(String content) {
        JsonObject jsonObject;
        JsonReader jsonReader = Json.createReader(new StringReader(content));
        jsonObject = jsonReader.readObject();
        Producto producto = new Producto();
        producto.setIdProd(jsonObject.getString("id"));
        producto.setNomProd(jsonObject.getString("nombre"));
        producto.setCantProd(jsonObject.getString("cantidad"));
        producto.setPrecioProd(jsonObject.getString("precio"));
        producto.setImagen(jsonObject.getString("imagen"));
         ProductoRepositorio.createProducto(producto);
        return 1;
    }
}
