/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import PaqueteLectura.Lector;
/**
 *
 * @author Martin
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese nombre/sueldo/antiguedad del jugador: ");
        String nombre = Lector.leerString();
        double sueldo = Lector.leerDouble();
        int antiguedad = Lector.leerInt();
        System.out.println("Ingrese cantidad de partidos/ goles del jugador:  ");
        int partidos = Lector.leerInt();
        int goles = Lector.leerInt();
     
        Jugadores nuevoJugador = new Jugadores(partidos, goles, nombre, sueldo, antiguedad);
        
        System.out.println("Ingrese nombre/sueldo/antiguedad del Entrenador: ");
        String nombreEntrenador = Lector.leerString();
        double sueldoEntrenador = Lector.leerDouble();
        int antiguedadEntrenador = Lector.leerInt();
        System.out.println("Ingrese cantidad de campeonatos ganados del entrenador:  ");
        int campeonatosGanados = Lector.leerInt();
        
        Entrenadores nuevoEntrenador = new Entrenadores(campeonatosGanados, nombreEntrenador, sueldoEntrenador, antiguedadEntrenador);
        
        System.out.println(nuevoJugador.toString());
        System.out.println(nuevoEntrenador.toString());
    }
    
}
