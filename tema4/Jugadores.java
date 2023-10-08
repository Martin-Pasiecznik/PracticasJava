/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Martin
 */
public class Jugadores extends Empleados {
    private int numeroPartidos;
    private int numeroGoles;
    
    public Jugadores(int unNumeroPartidos,int unNumeroGoles, String unNombre, double unSueldo, int unAntiguedad){
        super(unNombre,unSueldo,unAntiguedad);
        setNumeroPartidos(unNumeroPartidos);
        setNumeroGoles(unNumeroGoles);
    }

    public int getNumeroPartidos() {
        return numeroPartidos;
    }

    public void setNumeroPartidos(int numeroPartidos) {
        this.numeroPartidos = numeroPartidos;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }
    
    @Override
     public double calcularEfectividad(){
         double promedioEfectividad = (this.numeroGoles/this.numeroPartidos);
         return promedioEfectividad;
     }
     
     
    @Override
     public double calcularSueldoACobrar(){
         double porcentajeSumar=0;
         for (int i = 0; i < super.getAntiguedad(); i++) {
             porcentajeSumar= porcentajeSumar + (super.getSueldo() * 0.1);
         }
         double plusSueldoJugador=0;
         if ((this.numeroGoles/this.numeroPartidos) > 0.5) plusSueldoJugador= super.getSueldo();
         
         double sueldoJugadores= super.getSueldo() + porcentajeSumar + plusSueldoJugador ;
         return sueldoJugadores;
     }
    
     @Override
     public String toString(){
     return ("Nombre: " + super.getNombre() + " Sueldo a cobrar: " + this.calcularSueldoACobrar() + " Efectividad: " + this.calcularEfectividad());
     }
}
