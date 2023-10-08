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
public class ejercicio3 {
    
    public static void main(String[] args) {
        Estanteria estante = new Estanteria();
        Libro libro1 = new Libro();
        
        estante.Estanteria(); ///inicia estante vacio
        
         System.out.println("Escriba nombre autor/biografia/origen:  ");
         String nombre = Lector.leerString();
         String biografia = Lector.leerString();
         String origen = Lector.leerString();
         Autor autor1 = new Autor(nombre,biografia,origen); ///crea autor
        
        System.out.println("Escriba titulo del libro/autor/editorial/año/ISBN/precio: ");
        String titulo = Lector.leerString();
        
    
        int i=0;
        while(!titulo.equals("Mujercitas") && i<20){
        
        libro1.setTitulo(titulo);    
        String autor = Lector.leerString();
        libro1.setPrimerAutor(autor1);
        String editorial = Lector.leerString();
        int año = Lector.leerInt();
        int isbn = Lector.leerInt();
        double precio = Lector.leerDouble(); 
        
        estante.agregarLibro(libro1);
        estante.getEstanteLleno(i);

        
        libro1 = new Libro(); //nuevo libro
         System.out.println("Escriba nombre autor/biografia/origen:  ");
         nombre = Lector.leerString();
         biografia = Lector.leerString();
         origen = Lector.leerString();
         autor1 = new Autor(nombre,biografia,origen); ///nuevo autor
         
        System.out.println("Escriba titulo del libro/autor/editorial/año/ISBN/precio: ");
        titulo = Lector.leerString();
         
        int cantidadLibros=estante.getCantitadLibros();
        System.out.println("CANTIDAD DE LIBROS: " + cantidadLibros);
        
        i++;
        }
        
        estante.getCantitadLibros();
         System.out.print(estante.devolverPorTitulo("fuego", i).getTitulo());  ///que hacer si no lo encuentra???
    }
    
}
