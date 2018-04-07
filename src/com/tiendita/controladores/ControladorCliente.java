package com.tiendita.controladores;

import com.tiendita.moldes.Cliente;

import java.util.ArrayList;

public class ControladorCliente {

    private static ArrayList<Cliente> clientes;
    private static ControladorCliente controladorCliente;
    private ControladorCliente(){}

    public static ControladorCliente getInstance(){
        if(controladorCliente == null){
            controladorCliente = new ControladorCliente();
            clientes  = new ArrayList<Cliente>();
        }
        return controladorCliente;
    }


}
