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
public class Persona {
    private String nombre;
    private int DNI;
    private double montoColaboracion; 
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getMontoColaboracion() {
        return montoColaboracion;
    }

    public void setMontoColaboracion(double montoColaboracion) {
        this.montoColaboracion = montoColaboracion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", montoColaboracion=" + montoColaboracion + '}';
    }
    
    
    
    
}
