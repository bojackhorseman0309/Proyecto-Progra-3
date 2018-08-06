/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Usuario;
import dao.UsuarioRepositorio;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Alonso
 */
@Named(value = "registrarse")
@RequestScoped
public class registrarse extends Usuario{

    /**
     * Creates a new instance of registrarse
     */
    public registrarse() {
    }
    
    public String registro(){
        UsuarioRepositorio.createPersona(Usuario.getUsuario(this));
        return "paginaPrincipal";
    }
    
    
     public void existeContraseña(){
         RequestContext context = RequestContext.getCurrentInstance();
         boolean verifica=true;
        if(this.getContraseña().equals(this.getContraseñaConf())){
            context.execute("obtener("+verifica+")");
        }
        else{
            verifica=false;
            context.execute("obtener("+verifica+")");
        }
    }
    
    
   
    
    
   
                        
}
