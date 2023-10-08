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
public class Hotel {
    private Habitaciones vectHabitaciones[];
    
    public Hotel(int i){
        vectHabitaciones = new Habitaciones[i];
        for (int j = 0; j < i; j++) {
            vectHabitaciones[j]= new Habitaciones();
            
        }
    }
    

    public Habitaciones[] getVectHabitaciones() {
        return vectHabitaciones;
    }

    public void setVectHabitaciones(Habitaciones[] vectHabitaciones) {
        this.vectHabitaciones = vectHabitaciones;
    }

   
    public String toString(int i) {
        return ("Habitacion" + i + "Costo noche " + vectHabitaciones[i].getCostoNoche() + " estado:" + vectHabitaciones[i].estadoHabitacion()  );
    }
    
    

    
    
}
