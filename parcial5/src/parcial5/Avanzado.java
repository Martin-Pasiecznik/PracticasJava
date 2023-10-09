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
public class Avanzado extends Sorteo {
    
    public Avanzado(double valorPremio){
        super(valorPremio);
    }
    
    
    
    @Override
 public Persona  ejecutarSorteo(){
        double max=0.0;
        Persona personaGanadora= new Persona();
        for (int i = 0; i < super.getDimF(); i++) {
            if(super.getBono()[i] != null && super.getBono()[i].getMontoColaboracion() > max)
                max = super.getBono()[i].getMontoColaboracion();
                personaGanadora=super.getBono()[i];
        }
        return personaGanadora;
}
    
}
