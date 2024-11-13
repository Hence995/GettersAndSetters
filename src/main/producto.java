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
public class producto {
     private String nombre;
     private double precio;
     private int cantidad;
     
         //Constructor
         public producto(String nombre, double precio, int cantidad) {
             this.nombre = nombre;
             this.precio = precio;
             this.cantidad = cantidad;
         }
// Getters escribirlo a mano o usar alt+insert
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
// Setters más de lo mismo a mano o ser efectivo con el alt+insert XD
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser menor que cero");
        }
          
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser menor a cero");
        }
    }
          
}
     

