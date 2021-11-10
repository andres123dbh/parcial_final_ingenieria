package com.mycompany.punto_2_inventario;

public class Producto {
    private int id;
    private String nombre;
    private int valorUnitario;
    private int cantidad;
    
    //Metodo CONSTRUCTOR
    public Producto(int id, String nombre, int valorUnitario,int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
