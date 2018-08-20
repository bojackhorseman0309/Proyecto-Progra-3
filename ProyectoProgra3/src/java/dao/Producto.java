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
public class Producto {
    private String idProd;
    private String nomProd;
    private String cantProd;
    private String precioProd;
    private String imagen;

    public Producto() {
    }

    public Producto getProducto(Producto productoP) {
       Producto prod=new Producto();
       prod.idProd=productoP.idProd;
       prod.nomProd=productoP.nomProd;
       prod.cantProd=productoP.cantProd;
       prod.precioProd=productoP.precioProd;
       prod.imagen=productoP.imagen;
       return prod;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getCantProd() {
        return cantProd;
    }

    public void setCantProd(String cantProd) {
        this.cantProd = cantProd;
    }

    public String getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(String precioProd) {
        this.precioProd = precioProd;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
