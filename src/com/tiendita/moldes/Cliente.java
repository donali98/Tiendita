package com.tiendita.moldes;

public class Cliente {

    int codigo;
    String nombre, apellido, telefono;

    public Cliente(int codigo, String nombre, String apellido, String telefono) {
        this.codigo = codigo;

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}



