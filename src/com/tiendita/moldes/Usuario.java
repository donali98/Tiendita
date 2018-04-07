package com.tiendita.moldes;

public class Usuario {

    String usuario;
    String contra;

    public Usuario(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
