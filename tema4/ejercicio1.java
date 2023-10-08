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
public class ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Escriba 3 lados del triangulo");
        double ladoA= Lector.leerDouble();
        double ladoB= Lector.leerDouble();
        double ladoC= Lector.leerDouble();
        System.out.println("Escriba color de linea y color de relleno");
        String colorLinea= Lector.leerString();
        String colorRelleno= Lector.leerString();
        Triangulo nuevoTriangulo = new Triangulo(ladoA, ladoB, ladoC, colorLinea, colorRelleno); /// Inicializo triangulo
        
        System.out.println("Escriba Radio de circulo");
        double radio= Lector.leerDouble();
        System.out.println("Escriba color de linea y color de relleno");
        String colorLineaCirculo= Lector.leerString();
        String colorRellenoCirculo= Lector.leerString();
        Circulo nuevoCirculo = new Circulo(radio, colorLineaCirculo,colorRellenoCirculo); /// Inicializo circulo
        //////////////////// Callculo de area, perimetro etc
        nuevoTriangulo.calcularArea();
        nuevoTriangulo.calcularPerimetro();
        nuevoCirculo.calcularArea();
        nuevoCirculo.calcularPerimetro();
       ///////////////////////////
        
        System.out.println( nuevoTriangulo.toString());
        System.out.println( nuevoCirculo.toString());
        System.out.println("/////////////////////////////");
        nuevoTriangulo.despintar();
        nuevoCirculo.despintar();
        
        System.out.println(nuevoTriangulo.toString());
        System.out.println(nuevoCirculo.toString());        
    }
    
}
