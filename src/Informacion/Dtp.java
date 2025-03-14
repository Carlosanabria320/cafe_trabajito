/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;


public class Dtp {

    public Dtp(int idDetallepedido, int ideproducto, String nombreproducto, int cantidad, Long preciounitario, String categoria) {
        this.idDetallepedido = idDetallepedido;
        this.ideproducto = ideproducto;
        this.nombreproducto = nombreproducto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.categoria = categoria;
    }

    public int getIdDetallepedido() {
        return idDetallepedido;
    }

    public void setIdDetallepedido(int idDetallepedido) {
        this.idDetallepedido = idDetallepedido;
    }

    public int getIdeproducto() {
        return ideproducto;
    }

    public void setIdeproducto(int ideproducto) {
        this.ideproducto = ideproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Long preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

  
    
    private int idDetallepedido;
    private int ideproducto;
    private String nombreproducto;
    private int cantidad;
    private Long preciounitario;
    private String categoria;
    
}
