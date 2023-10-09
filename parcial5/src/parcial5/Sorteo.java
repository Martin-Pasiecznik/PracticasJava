/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial5;

/**
 *
 * @author Martin
 */
public abstract class Sorteo extends Persona {
    private double valorPremio;
    private Persona []bono;
    private int dimF=99;
    
    public Sorteo(double valorPremio){
        this.valorPremio=valorPremio;
        bono= new Persona[dimF];
    }
    
    
   
    public Sorteo(){
    }
    
        public int agregarPersona(Persona unaPersona, int numBono){
        bono[numBono]=unaPersona;
        return numBono;    
    }
        
        public  Persona obtenerPersona(int numeroBonoPersona){
            return bono[numeroBonoPersona];
        }
        
        public abstract Persona ejecutarSorteo();



    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public Persona[] getBono() {
        return bono;
    }

    public void setBono(Persona[] bono) {
        this.bono = bono;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }
    
    
    
}
