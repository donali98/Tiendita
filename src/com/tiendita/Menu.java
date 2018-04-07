package com.tiendita;

import com.tiendita.controladores.ControladorProducto;
import com.tiendita.moldes.Empresa;
import com.tiendita.moldes.Proveedor;

import java.util.Scanner;

public class Menu {

    private static Menu menu;

    private Menu(){}

    public static Menu getInstance(){
        if(menu == null) menu = new Menu();
        return  menu;
    }

    private void mostrarOpciones(){

        System.out.println("***Bienvenido a la tiendita***\n");
        System.out.println("Elija una opcion: \n");
        System.out.println("1- Agregar Producto\n");
        System.out.println("2- Listar Productos\n");

    }

    public void mostrarMenu(){

        ControladorProducto controladorProducto = ControladorProducto.getInstance();

        int opcion = 5;
        Scanner scanner = new Scanner(System.in);

        while (opcion!=0){
            mostrarOpciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    /*controladorProducto.crearNuevoProducto(
                            1,
                            "Lays",
                            10,
                            0.50,
                            new Proveedor("Juan",
                                    "Alfredo",
                                    "2121-2121",
                                    new Empresa("caca",
                                            "caca landia",
                                            "634323-23232",
                                            "a.b@c.com"
                                    )
                            )
                    );*/
                break;

                case 2:
                    controladorProducto.mostrarTodos();
                break;
            }
        }
    }
}
