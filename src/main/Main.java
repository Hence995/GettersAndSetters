/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        producto producto = new producto("MonitorLG", 200, 10);

        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("--------------------------------------");
        producto.setNombre("MonitorSamsung");
        System.out.println("Nombre: " + producto.getNombre());
        producto.setPrecio(250);
        System.out.println("Precio: "+ producto.getPrecio());
        producto.setCantidad(15);
        System.out.println("Cantidad: " + producto.getCantidad());
                
    }

}
