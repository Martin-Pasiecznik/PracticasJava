/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public class PersonasIngresan extends Persona {
    
    public PersonasIngresan(String unNombre, int unDNI, int unaEdad){
        super(unNombre, unDNI,unaEdad);
    }
    
    @Override
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + super.getNombre() + ", mi DNI es " + super.getDNI() + " y tengo " + super.getEdad() + " años.";
        return aux;
    }
    
    
    
    
}
