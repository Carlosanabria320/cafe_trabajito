/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import java.util.Date;

/**
 *
 * @author Carlos Sanabria
 */
public class Pd {

   
 
   
    private int idpedido;
    private Long cedulaCliente;
    private Long cedulaEmpleado;
    private java.util.Date fechapedido;
    private String producto;
    private int cantidad;
    private String categoria;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public Long getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(Long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Long getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(Long cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public Date getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(Date fechapedido) {
        this.fechapedido = fechapedido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Pd(int idpedido, Long cedulaCliente, Long cedulaEmpleado, Date fechapedido, String producto, int cantidad, String categoria) {
        this.idpedido = idpedido;
        this.cedulaCliente = cedulaCliente;
        this.cedulaEmpleado = cedulaEmpleado;
        this.fechapedido = fechapedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
   

    
}
