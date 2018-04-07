package com.tiendita.moldes;

public class Factura {

    Cliente cliente;
    Proveedor proveedor;

    int cantidadDescargada;
    int cantidadCargada;

    Producto producto;

    public Factura(Cliente cliente, Producto producto, int cantidadDescargada){
        this.cliente = cliente;
        this.proveedor = null;
        this.producto = producto;
        this.cantidadDescargada = cantidadDescargada;
        this.cantidadCargada = 0;
        imprimirComprobante();
    }
    public Factura(Proveedor proveedor, Producto producto, int cantidadCargada){
        this.cliente = null;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidadDescargada = 0;
        this.cantidadCargada = cantidadCargada;

        imprimirComprobante();
    }

    private void imprimirComprobante(){}
}
