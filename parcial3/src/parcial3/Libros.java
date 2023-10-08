/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author Martin
 */
public class Libros {
    private String titulo;
    private String nombreAutor;
    private double peso;
    
    public Libros(String unTitulo, String unNombreAutor, double unPeso){
        this.titulo=unTitulo;
        this.nombreAutor=unNombreAutor;
        this.peso=unPeso;
    }
    
    public Libros(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", nombreAutor=" + nombreAutor + ", peso=" + peso + '}';
    }
    
    
    
    
}
