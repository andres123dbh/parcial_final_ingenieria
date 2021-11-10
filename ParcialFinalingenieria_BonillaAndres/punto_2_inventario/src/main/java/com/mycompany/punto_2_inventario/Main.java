package com.mycompany.punto_2_inventario;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        Scanner sn = new Scanner(System.in); 
        
        Almacen almacen = new Almacen();
        
        //Id automatico para los eventos
        int id = 1;
        
        //Condicional while
        boolean seguir = true;
        
        while(seguir){

            System.out.println("---------------------------------");
            System.out.println("1.Guardar stock \n2.Ver inventario\n3.Cerrar");
            System.out.println("---------------------------------");

            //Condicional para el switch
            int opcion = sn.nextInt();
        
            switch(opcion){
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Guardar Evento.");
                    System.out.println("---------------------------------");
                    String pp = sn.nextLine();
                    
                    //Nombre del producto
                    System.out.println("Digite el nombre del producto:");
                    System.out.println("---------------------------------");
                    String nombre = sn.nextLine();


                    //Valor unitario del producto
                    System.out.println("---------------------------------");
                    System.out.println("Digite el valor unitario del producto:");
                    System.out.println("---------------------------------");
                    int vlrUnitario = sn.nextInt();
                    
                    //Cantidad de productos
                    System.out.println("---------------------------------");
                    System.out.println("Digite la cantidad de productos:");
                    System.out.println("---------------------------------");
                    int cantProductos = sn.nextInt();

                    Producto producto = new Producto(id,nombre,vlrUnitario,cantProductos);
                    almacen.AgregarInventario(producto);
                    id += 1;
                    
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Ver todos los elementos.");
                    System.out.println("---------------------------------");

                    //Llamar al metodo verInventario
                    almacen.verInventario();
                    break;
                case 3:
                    seguir = false;
                    System.out.println("---------------------------------");
                    System.out.println("Aplicaion cerrada");
                    System.out.println("---------------------------------");
                    break;
                default:
                    //Digito una opcion no valida
                    System.out.println("---------------------------------");
                    System.out.println("Esa opción no es valida");
                    System.out.println("---------------------------------");
                    break;
            }
            
        }
    }
}
