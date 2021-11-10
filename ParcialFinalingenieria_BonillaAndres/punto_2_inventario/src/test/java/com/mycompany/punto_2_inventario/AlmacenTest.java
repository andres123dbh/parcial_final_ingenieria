/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto_2_inventario;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlmacenTest {
    
    @InjectMocks
    private Almacen almacen;
    
    @Mock
    private Producto producto;
    
    
    //Prueba del metoso valorTotalInventario
    @Test
    public void testValorTotalInventario() {
        when(producto.getCantidad()).thenReturn(30);
        when(producto.getValorUnitario()).thenReturn(10000);
        assertEquals(300000,almacen.valorTotalInventario(producto),0);
    }

    //Prueba metodo valorTotalAlmacen
    @Test
    public void testValorTotalAlmacen() {
        ArrayList<Producto> stocks = new ArrayList<Producto>();
        Producto pastillas = new Producto(1,"Pastillas",2000,50);
        Producto bandas = new Producto(1,"Bandas",1000,10);
        stocks.add(pastillas);
        stocks.add(bandas);
        almacen.setAlmacen(stocks);
        assertEquals(110000,almacen.valorTotalAlmacen(),0);
    }
    
    //Prueba metodo cantidadProductos
    @Test
    public void testCantidadProductos() {
        ArrayList<Producto> stocks = new ArrayList<Producto>();
        Producto pastillas = new Producto(1,"Pastillas",2000,50);
        Producto bandas = new Producto(1,"Bandas",1000,10);
        stocks.add(pastillas);
        stocks.add(bandas);
        almacen.setAlmacen(stocks);
        assertEquals(60,almacen.cantidadProductos(),0);
    }
}
