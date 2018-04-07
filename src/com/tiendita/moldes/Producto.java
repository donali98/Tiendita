package com.tiendita.moldes;

public class Producto {

    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precio;
    private boolean estado;
    private Proveedor proveedor;

    public Producto(){this.estado = false;}

    public Producto(int codigo, String descripcion, int cantidad, double precio, Proveedor proveedor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.proveedor = proveedor;
        this.estado = true;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
