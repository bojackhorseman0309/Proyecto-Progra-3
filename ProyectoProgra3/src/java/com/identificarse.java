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
@Named(value = "identificarse")
@RequestScoped
public class identificarse{
   private List<Usuario> datosUsuario=new ArrayList<Usuario>();
   private String correoIden;
   private String contraseñaIden;
    /**
     * Creates a new instance of identificarse
     */
    public identificarse() {
    }

    public List<Usuario> getDatosUsuario() {
        return datosUsuario;
    }
    
    @PostConstruct
    public void leeDatos(){
        datosUsuario=UsuarioRepositorio.readPersonas();
    }
    
    
    public String verificaLogin(){
        return "inicio";
    }
    
    
    public void verificaCorreo(){
        RequestContext context = RequestContext.getCurrentInstance();
         boolean salida=true;      
        for (Usuario usuario: datosUsuario) {
            if (usuario.getCorreo().equals(correoIden)) {
                salida=false;
                break;
            }else{
                salida=true;
            }
        }
        context.execute("obtenerIden("+salida+")");
    }
    
      public void verificaContra(){
        RequestContext context = RequestContext.getCurrentInstance();
         boolean salida=true;      
        for (Usuario usuario: datosUsuario) {
            if (usuario.getContraseña().equals(contraseñaIden)) {
                salida=false;
                break;
            }else{
                salida=true;
            }
        }
         context.execute("obtenerCon("+salida+")");
    }

    public String getCorreoIden() {
        return correoIden;
    }

    public void setCorreoIden(String correoIden) {
        this.correoIden = correoIden;
    }

    public String getContraseñaIden() {
        return contraseñaIden;
    }

    public void setContraseñaIden(String contraseñaIden) {
        this.contraseñaIden = contraseñaIden;
    }

 
    
    
    
}
