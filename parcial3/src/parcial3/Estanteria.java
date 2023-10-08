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
public class Estanteria {
    private Libros [][]matriz;
    
    public Estanteria(int dimF, int dimC){
        this.matriz = new Libros[dimF][dimC];
        for (int i = 0; i < dimF; i++) {
            for (int j = 0; j < dimC; j++) {
                this.matriz[i][j]= new Libros();
            }
            
        }
    }
    
    public void almacenarLibro(Libros unLibro, int numeroEstante, int numeroEspacio){
        this.matriz[numeroEstante][numeroEspacio]=unLibro;
    }
    
    public Libros sacarLibro(String nombreLibro, int dimF, int dimC){
        Libros libroDevolver= new Libros();
        for (int i = 0; i < dimF; i++) {
            for (int j = 0; j < dimC; j++) {
                if(matriz[i][j].getTitulo() != null && matriz[i][j].getTitulo().equals(nombreLibro)) libroDevolver = matriz[i][j];
            }  
        }
        return (libroDevolver); 
    }
    
    public Libros calcular(int dimF, int dimC){
    double MaxPesoLibro=0;
    Libros libroMasPesado=null;
        for (int i = 0; i < dimF; i++) {
            for (int j = 0; j < dimC; j++) {
                if(matriz[i][j].getPeso() > MaxPesoLibro) {
                    MaxPesoLibro=matriz[i][j].getPeso();
                    libroMasPesado=matriz[i][j];
                }
                
            }
            
        }
        return (libroMasPesado);
    }

    public Libros[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Libros[][] matriz) {
        this.matriz = matriz;
    }
    
    
    
    
}
