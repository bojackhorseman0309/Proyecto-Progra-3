/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Compra;
import dao.CompraRepositorio;
import dao.Usuario;
import dao.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alonso
 */
@Named(value = "electronicos")
@RequestScoped
public class electronicos extends Compra{
      private List<Compra> listaCompras=new ArrayList<Compra>();
    /**
     * Creates a new instance of electronicos
     */
    public electronicos() {
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void registraCompra(){
        CompraRepositorio.createCompra(getCompra(this));
    }
    
    
        @PostConstruct
    public void leeCompra(){
        listaCompras=CompraRepositorio.readCompra();
    }
    
    
    
}
