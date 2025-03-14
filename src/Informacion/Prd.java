/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import javax.accessibility.AccessibleContext;

/**
 *
 * @author Carlos Sanabria
 */
public class Prd {

    public Prd(int identificadorPrd, String nombrePrd, Long valorPrd, Long stockminimo, Long Existencia, String Proveedor, String Categoria) {
        this.identificadorPrd = identificadorPrd;
        this.nombrePrd = nombrePrd;
        this.valorPrd = valorPrd;
        this.stockminimo = stockminimo;
        this.Existencia = Existencia;
        this.Proveedor = Proveedor;
        this.Categoria = Categoria;
    }

    public int getIdentificadorPrd() {
        return identificadorPrd;
    }

    public void setIdentificadorPrd(int identificadorPrd) {
        this.identificadorPrd = identificadorPrd;
    }

    public String getNombrePrd() {
        return nombrePrd;
    }

    public void setNombrePrd(String nombrePrd) {
        this.nombrePrd = nombrePrd;
    }

    public Long getValorPrd() {
        return valorPrd;
    }

    public void setValorPrd(Long valorPrd) {
        this.valorPrd = valorPrd;
    }

    public Long getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(Long stockminimo) {
        this.stockminimo = stockminimo;
    }

    public Long getExistencia() {
        return Existencia;
    }

    public void setExistencia(Long Existencia) {
        this.Existencia = Existencia;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

   

    private int identificadorPrd;
    private String nombrePrd;
    private Long valorPrd;
    private Long stockminimo;
    private Long Existencia;
    private String Proveedor;
    private String Categoria;

}
