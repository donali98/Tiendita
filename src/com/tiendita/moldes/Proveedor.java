package com.tiendita.moldes;

public class Proveedor {
    private int codigo;
    private String nombre, apellido, numero;
    private Empresa empresa;
    private boolean estado;

    public Proveedor(){this.estado = false;}
    public Proveedor(int codigo, String nombre, String apellido, String numero, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.empresa = empresa;
        this.estado = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
