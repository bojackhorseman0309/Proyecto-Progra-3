/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.Gson;
import com.ws.ProdRest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author Alonso
 */
public class ProductoLista {
    private static List<Producto> listaProducto=new ArrayList<Producto>();

    public static List<Producto> getListaProducto() {
        return listaProducto;
    }
    
    public static void agregar(Producto producto){
        listaProducto.add(producto);
    }
    
    
    public static void cargarDatos(){
        listaProducto=ProductoRepositorio.readProducto();
//        cargaPost();
    }
    
    
    
//    public void cargaPost(){
//        JSONObject jObj=new JSONObject();
//        String jsonString= new Gson().toJson(listaProducto);
//        try {
//            jObj.put("Producto", jsonString );
//        } catch (JSONException ex) {
//            Logger.getLogger(ProductoLista.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            ProdRest.postJson(jsonString);
//        } catch (JSONException ex) {
//            Logger.getLogger(ProductoLista.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
    
//    public static void main(String []args){
//        ProductoLista p=new ProductoLista();
//        ProdRest rest=new ProdRest();
////        p.cargarDatos();
//        String caca=rest.getJson();
//        System.out.println("JSOOOOOOOOOOOOOON"+caca);
//    }
}
