package com.mycompany.punto_2_inventario;

import java.util.ArrayList;

public class Almacen implements ServicioAlmacen{
    
    private  ArrayList<Producto> inventario = new ArrayList<Producto>();

    //Getter y Setter
    public ArrayList<Producto> getAlmacen() {
        return inventario;
    }

    public void setAlmacen(ArrayList<Producto> almacen) {
        this.inventario = almacen;
    }

    //Metodo para encontrar el valor total de un stock
    @Override
    public int valorTotalInventario(Producto producto) {
        return producto.getCantidad()*producto.getValorUnitario();
    }

    //Metodo para encontrar el valor total de todo el inventario
    @Override
    public int valorTotalAlmacen() {
        int valorTotal = 0;
        
        for(Producto producto: this.inventario){
            valorTotal += producto.getCantidad()*producto.getValorUnitario();
        }
        
        return valorTotal;
    }

    //Metodo para eliminar un stock del inventario
    @Override
    public String eliminarInventario(Producto producto) {
        if(this.enLista(producto)){
            this.inventario.remove(producto);
            return "Fuera del almacen";
        }
        else{
            return "No esta en el almacen";
        } 
    }

    //Metodo para agregar un stock del inventario
    @Override
    public String AgregarInventario(Producto producto) {
        if(!this.enLista(producto)){
            this.inventario.add(producto);
            return "Guardado en el almacen";
        }
        else{
            return "Ya esta guardado";
        }
    }

    //Metodo para ordenar alfabeticamente el inventario
    @Override
    public void ordenarAlmacen() {
        inventario.sort((a1, a2) -> a1.getNombre().compareTo(a2.getNombre()));
    }
    
    //Metodo para revisar si un stock esta en el inventario
    public boolean enLista(Producto inventario){
        return this.inventario.contains(inventario);
    }
    
    //Metodo para eliminar todo lo que esta en el inventario
    public void eliminarTodo(){
        this.inventario.clear();
    }
    
    //Metodo para saber la cantidad total de productos del inventario
    @Override
    public int cantidadProductos(){
        int cantidadProductos = 0;
        
        for(Producto inventario: this.inventario){
            cantidadProductos += inventario.getCantidad();
        }
        
        return cantidadProductos;
    }
    
    //Metodo para ver la informacion del inventario
    @Override
    public void verInventario() {
        System.out.println("---------------------------");
        System.out.println("Valor total del almacen: " + this.valorTotalAlmacen());
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("Cantidad total de productos: " + this.cantidadProductos());
        System.out.println("---------------------------");
        for(Producto producto: this.inventario){
            System.out.println("---------------------------");
            System.out.println("Producto : " + producto.getNombre());
            System.out.println("Cantidad de unidades: " + producto.getCantidad());
            System.out.println("Valor unitario: " + producto.getValorUnitario());
            System.out.println("Valor total del stock: " + this.valorTotalInventario(producto));
            System.out.println("---------------------------");
        }
    }
}
