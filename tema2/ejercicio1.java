/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author Martin
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese nombre/DNI/edad");
        String nombre = Lector.leerString();
        int dni = Lector.leerInt();
        int edad = Lector.leerInt();
        
        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setDNI(dni);
        persona1.setEdad(edad);
        
        System.out.println(persona1.toString());
        
        
        
    }
    
}
