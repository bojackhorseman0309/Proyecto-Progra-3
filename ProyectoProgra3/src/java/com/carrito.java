/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Compra;
import dao.CompraRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alonso
 */
@Named(value = "carrito")
@RequestScoped
public class carrito {
     private List<Compra> listaCarrito=new ArrayList<Compra>();
    /**
     * Creates a new instance of carrito
     */
    public carrito() {
    }

    public List<Compra> getListaCarrito() {
        return listaCarrito;
    }
    
        @PostConstruct
    public void leeCarrito(){
        listaCarrito=CompraRepositorio.readCompra();
    }
    
}
