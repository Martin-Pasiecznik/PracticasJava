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
public class MainVisorFiguras {
    public static void main(String[] args) {
    VisorFigurasModificado visor = new VisorFigurasModificado();
    Figura []vector = new Figura[3];
    
    Cuadrado f1 = new Cuadrado(10,"Violeta","Rosa");
    Rectangulo f2= new Rectangulo(20,10,"Azul","Celeste");
    Cuadrado f3= new Cuadrado(30,"Rojo","Naranja");
   
    vector[0]=f1;
    vector[1]=f2;
    vector[2]=f3;

visor.mostrar(vector[0]);
visor.mostrar(vector[1]);
visor.mostrar(vector[2]);

System.out.println(visor.getMostradas());
}
}
