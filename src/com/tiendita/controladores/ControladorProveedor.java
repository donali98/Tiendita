package com.tiendita.controladores;

import com.tiendita.moldes.Empresa;
import com.tiendita.moldes.Proveedor;

import java.util.ArrayList;

public class ControladorProveedor {
    private ControladorProveedor controladorProveedor;
    private ControladorProveedor(){}
    private ArrayList<Proveedor> proveedores;

    public ControladorProveedor getInstance(){

        if(controladorProveedor == null) {
            controladorProveedor = new ControladorProveedor();
            proveedores = new ArrayList<Proveedor>();
        }
        return controladorProveedor;
    }
    public Proveedor buscarProveedor(int codigo){
        Proveedor proveedor = new Proveedor();
        for(Proveedor pro: proveedores){
            if(pro.getCodigo() == codigo){
                proveedor = pro;
                break;
            }
        }
        return proveedor;
    }
    public void agregarProveedor(int codigo, String nombre, String apellido,String numero, Empresa empresa){
        if(buscarProveedor(codigo).getEstado() != false){
            System.out.println("Ya existe un proveedor con ese codigo\n");
        }
        else{
            Proveedor proveedor = new Proveedor(codigo,nombre,apellido,numero,empresa);
        }
    }

}
