/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author alumnos
 */
public class Trabajadores extends Persona{
    private String tipoDeTrabajo;
    
    public Trabajadores(String tipoDeTrabajo, String unNombre, int unDNI, int unEdad){
        super(unNombre,unDNI,unEdad);
        setTipoDeTrabajo(tipoDeTrabajo);
    }

    public String getTipoDeTrabajo() {
        return tipoDeTrabajo;
    }

    public void setTipoDeTrabajo(String tipoDeTrabajo) {
        this.tipoDeTrabajo = tipoDeTrabajo;
    }

    @Override
    public String toString() {
        return ("Mi nombre es: "+ super.getNombre()+ " mi DNI es: "+ super.getDNI()+" y tengo " + super.getEdad()+ " años."+" Soy "+getTipoDeTrabajo());
    }
    
    
    
    
}
