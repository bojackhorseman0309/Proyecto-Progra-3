/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import dao.Usuario;
import dao.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    private List<Usuario> listaCorreos=new ArrayList<Usuario>();

    /**
     * Creates a new instance of registrarse
     */
    public registrarse() {
    }
    
    public String registro(){
        UsuarioRepositorio.createPersona(Usuario.getUsuario(this));
        return "paginaPrincipal";
    }
    
    public String updateContra(){
        UsuarioRepositorio.updatePersona(Usuario.getUsuario(this));
        return "paginaPrincipal";
    }
    
    
    

    public List<Usuario> getListaCorreos() {
        return listaCorreos;
    }

    @PostConstruct
    public void leeCorreos(){
        listaCorreos=UsuarioRepositorio.readPersonas();
    }
    
      public void verificaCorreo(){
        boolean salida;
        RequestContext context = RequestContext.getCurrentInstance();
        for (Usuario usuario: listaCorreos) {
            if (usuario.getCorreo().equals(this.getCorreo())) {
                salida=true;
                context.execute("obtener("+salida+")");
                break;
            }else{
                salida=false;
                context.execute("obtener("+salida+")");
                break;
            }
        }
    }               
      
      
         public void verificaCorreoUpdateCon(){
        boolean salida;
        RequestContext context = RequestContext.getCurrentInstance();
        for (Usuario usuario: listaCorreos) {
            if (usuario.getCorreo().equals(this.getCorreo())) {
                salida=false;
                context.execute("obtenerUpdate("+salida+")");
                break;
            }else{
                salida=true;
                context.execute("obtenerUpdate("+salida+")");
               
            }
        }
    }         
         
}
