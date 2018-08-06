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
        for (Usuario datos: datosUsuario) {
            if (datos.getCorreo().equals(correoIden)) {
                if (datos.getContraseña().equals(contraseñaIden)) {
                    return "inicio";
                }
            }
        }
        return "paginaPrincipal";
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
