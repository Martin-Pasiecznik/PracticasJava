/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Martin
 */
public class Cliente {
    private String nombre;
    private int DNI;
    private int edad;
    
    public Cliente(String unNombre, int unDNI, int unEdad){
           nombre=unNombre;
           DNI=unDNI;
           edad= unEdad;
    }
    


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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad ;
    }
    
    
}
