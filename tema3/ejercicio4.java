/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;
/**
 *
 * @author Martin
 */
public class ejercicio4 {
    
    public static void main(String[] args) {
        System.out.println("Escriba cantidad de habitaciones del hotel");
        int i = Lector.leerInt();
        
        Hotel hotelIniciado = new Hotel(i); // inicia hotel con el vector
        
        for (int j = 0; j < i; j++) {
            
        System.out.println("Escriba nombre/DNI/edad");
        String nombre = Lector.leerString();
        int DNI = Lector.leerInt();
        int edad = Lector.leerInt();
        Cliente clientes = new Cliente(nombre, DNI, edad);    
        
        
        Habitaciones habitacion = new Habitaciones(); /// inicia 1 habitacion (desocupada)
        habitacion.IngresarClienteHabitacion();
        
        
        }
        

        for (int j = 0; j < i; j++) {
             System.out.println(hotelIniciado.toString(j));
        }
       
   
        
    }
    
}
