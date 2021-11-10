package com.mycompany.punto_2_inventario;

public interface ServicioAlmacen {
    //Metodos ue se implementaran en la clase Almacen
    public int valorTotalInventario(Producto producto);
    public int valorTotalAlmacen();
    public String eliminarInventario(Producto producto);
    public String AgregarInventario(Producto producto);
    public void ordenarAlmacen();
    public void verInventario();
    public int cantidadProductos();
}
