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
    private int dimF;
    private int dimC;
    
    public Estanteria(int dimF, int dimC){
        this.dimF=dimF;
        this.dimC=dimC;
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
    
    public Libros sacarLibro(String nombreLibro){
        Libros libroDevolver= new Libros();
        for (int i = 0; i < this.dimF; i++) {
            for (int j = 0; j < this.dimC; j++) {
                if(matriz[i][j].getTitulo() != null && matriz[i][j].getTitulo().equals(nombreLibro)) {libroDevolver = matriz[i][j]; // guerda el libro
                    matriz[i][j]= new Libros(); //deja el espacio libre
                }
            }  
        }
        return (libroDevolver); 
        
    }
    
    public Libros calcular(){
    double MaxPesoLibro=0;
    Libros libroMasPesado=null;
        for (int i = 0; i < this.dimF; i++) {
            for (int j = 0; j < this.dimC; j++) {
                if(matriz[i][j].getPeso() > MaxPesoLibro) {
                    MaxPesoLibro=matriz[i][j].getPeso();
                    libroMasPesado=matriz[i][j];
                }
                
            }
            
        }
        return (libroMasPesado);
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public int getDimC() {
        return dimC;
    }

    public void setDimC(int dimC) {
        this.dimC = dimC;
    }

    
    
    public Libros[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Libros[][] matriz) {
        this.matriz = matriz;
    }
    
    
    
    
}
