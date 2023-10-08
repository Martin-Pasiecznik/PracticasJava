/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import PaqueteLectura.Lector;
/**
 *
 * @author alumnos
 */
public class ejercicio3 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese nombre,DNI,edad de la persona que ingresa: ");
        String nombre = Lector.leerString();
        int DNI = Lector.leerInt();
        int edad = Lector.leerInt();
        
        PersonasIngresan nuevaPersona = new PersonasIngresan(nombre, DNI, edad);
        
        
        System.out.println("Ingrese nombre,DNI,edad del trabajador que ingresa: ");
        String nombreTrabajador = Lector.leerString();
        int DNITrabajador = Lector.leerInt();
        int edadTrabajador = Lector.leerInt();
        System.out.println("Ingrese ocupacion del trabajador:  ");
        String ocupacionTrabajador = Lector.leerString();
        
        Trabajadores nuevoTrabajador = new Trabajadores(ocupacionTrabajador,nombreTrabajador,DNITrabajador,edadTrabajador);
        
        System.out.println(nuevaPersona.toString());
        System.out.println(nuevoTrabajador.toString());
        
        
        
    }
    
}
