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
public class Compra {
    private String idProd;
    private String nomProd;
    private String cantProd;
    private String precioProd;

    public Compra() {
    }

    public static Compra getCompra(Compra compraP){
        Compra compra=new Compra();
        compra.idProd= compraP.idProd;
        compra.nomProd=compraP.nomProd;
        compra.cantProd=compraP.cantProd;
        compra.precioProd=compraP.precioProd;
        return compra;
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
    
    


    
}
