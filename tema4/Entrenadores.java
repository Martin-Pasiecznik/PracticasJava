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
public class Entrenadores extends Empleados {
    private int cantidadCampeonatosGanados;
    
    public Entrenadores(int cantidadCampeonatosGanados,String unNombre, double unSueldo, int unAntiguedad){
        super(unNombre, unSueldo, unAntiguedad);
        setCantidadCampeonatosGanados( cantidadCampeonatosGanados);
    }

    public int getCantidadCampeonatosGanados() {
        return cantidadCampeonatosGanados;
    }

    public void setCantidadCampeonatosGanados(int cantidadCampeonatosGanados) {
        this.cantidadCampeonatosGanados = cantidadCampeonatosGanados;
    }
    
    @Override
    public double calcularEfectividad(){
        double promedioEntrenador= (cantidadCampeonatosGanados/super.getAntiguedad());
        return promedioEntrenador;
    }
    
    @Override
    public double calcularSueldoACobrar(){
                 double porcentajeSumar=0;
         for (int i = 0; i < super.getAntiguedad(); i++) {
             porcentajeSumar= porcentajeSumar + (super.getSueldo() * 0.1);
         }
        double plusSueldo=0;
        if(cantidadCampeonatosGanados >= 1 && cantidadCampeonatosGanados <= 4) plusSueldo=5000.0;
        else if(cantidadCampeonatosGanados >= 5 && cantidadCampeonatosGanados <= 10) plusSueldo=30000.0;
        else if (cantidadCampeonatosGanados > 10) plusSueldo=50000.0;
        double sueldoEntrenadores= super.getSueldo() + plusSueldo + porcentajeSumar;
        return sueldoEntrenadores;
    }
    
      @Override
     public String toString(){
     return ("Nombre: " + super.getNombre() + " Sueldo a cobrar: " + this.calcularSueldoACobrar() + " Efectividad: " + this.calcularEfectividad());
     }
}
