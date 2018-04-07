package com.tiendita.controladores;

import com.tiendita.moldes.Cliente;
import com.tiendita.moldes.Factura;
import com.tiendita.moldes.Producto;
import com.tiendita.moldes.Proveedor;

import java.util.ArrayList;


public class ControladorProducto {

    private static ArrayList<Producto> productos;
    private  static ControladorProducto controladorProducto;

    //Constructor privado
    private ControladorProducto(){}

    //Metodo para obtener la instancia actual del controlador del producto
    public static  ControladorProducto getInstance(){
        if (controladorProducto == null){
            controladorProducto = new ControladorProducto();
            productos = new ArrayList<Producto>();
        }
        return controladorProducto;
    }

    public void mostrarTodos(){
        for(Producto producto: productos){
            System.out.println("Descripcion: "+producto.getDescripcion()+"\t"+
                    "Cantidad Disponible: "+producto.getCantidad()+"\n");
        }
    }

    public Producto encontrarProducto(int codigo){
        //variable donde se guardara el producto encontrado
        Producto producto = new Producto();
        //busca y asigna el producto deseado
        for(Producto pro : productos){
            if(pro.getCodigo() == codigo){
                producto = pro;
                break;
            }
        }
        return producto;
    }

    public void crearNuevoProducto(int codigo, String descripcion,int cantidadInicial, double precio, Proveedor proveedor){
        if(this.encontrarProducto(codigo).getEstado() != false){
            System.out.println("Ya existe un producto con ese codigo, favor ingrese uno diferente");
            return;
        }
        productos.add(new Producto(codigo,descripcion,cantidadInicial,precio,proveedor));
        System.out.println("Producto agregado exitosamente\n");
    }

    public void inhabilitarProducto(int codigo){

        Producto producto = this.encontrarProducto(codigo);

        if(producto == null){
            System.out.println("No existe un producto con ese codigo");
            return;
        }
        else{
            producto.setEstado(false);
        }

    }


    public Factura descargarProductoExistente(Cliente cliente, int codigo, int cantidadDescargada){

        Producto producto = encontrarProducto(codigo);
        this.actualizarStock(producto,cantidadDescargada,false);

        return new Factura(cliente,producto,cantidadDescargada);
    }

    public Factura cargarProductoExistente(Proveedor proveedor,int codigo, int cantidadCargada){

        Producto producto = encontrarProducto(codigo);
        this.actualizarStock(producto,cantidadCargada,true);

        return new Factura(proveedor,producto,cantidadCargada);
    }



    private void actualizarStock(Producto producto, int cantidad, boolean agregarQuitar){

        if(agregarQuitar){ producto.setCantidad(producto.getCantidad() + cantidad); }

        else { producto.setCantidad(producto.getCantidad() - cantidad);}
    }

}
