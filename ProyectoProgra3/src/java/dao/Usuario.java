/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Alonso
 */
public class Usuario {
    private String correo;
    private String contraseña;
    private String contraseñaConf;

    public Usuario() {
    }
    
    
    
     public static Usuario getUsuario(Usuario usuarioP){
        Usuario usuario=new Usuario();
        usuario.correo= usuarioP.correo;
        usuario.contraseña=usuarioP.contraseña;
        usuario.contraseñaConf=usuarioP.contraseñaConf;
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseñaConf() {
        return contraseñaConf;
    }

    public void setContraseñaConf(String contraseñaConf) {
        this.contraseñaConf = contraseñaConf;
    }
    
    
}
