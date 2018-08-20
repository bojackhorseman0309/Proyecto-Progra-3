/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.gson.Gson;
import com.ws.ProdRest;
import dao.Producto;
import dao.ProductoLista;
import dao.ProductoRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author Alonso
 */
@Named(value = "productos")
@RequestScoped
public class productos extends Producto{

    /**
     * Creates a new instance of productos
     */
    public productos() {
    }

   
}
