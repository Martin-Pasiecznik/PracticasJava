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
public class Comun extends Sorteo {

    
    public Comun(double valorPremio){
        super(valorPremio);
    }
    
@Override
 public Persona  ejecutarSorteo(){
     int numeroAleatorio=2;
     return  super.getBono()[numeroAleatorio];
}
 
    
    
}
