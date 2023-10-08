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
public class ejercicio1 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        System.out.println("Escriba 3 lados del triangulo: ");
        double ladoA = Lector.leerDouble();
        double ladoB = Lector.leerDouble();
        double ladoC = Lector.leerDouble();
        
        triangulo1.setLadoA(ladoA);
        triangulo1.setLadoB(ladoB);
        triangulo1.setLadoC(ladoC);
        
        System.out.println("Escriba color del triangulo:  ");
        String color= Lector.leerString();
        triangulo1.setColor(color);
        
        System.out.println("Escriba color de la linea:  ");
        String colorLinea= Lector.leerString();
        triangulo1.setColorLinea(colorLinea);
        
        System.out.println("El perimetro del triangulo es:" + triangulo1.calcularPerimetro());
        System.out.println("El area del triangulo es: " + triangulo1.calcularArea());
    }
}
