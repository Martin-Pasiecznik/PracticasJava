/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Martin
 */
public class Habitaciones {
    private double costoNoche;
    private boolean habitacionOcupada;
    private Cliente reservaCliente;
    
    
    public Habitaciones(){
        GeneradorAleatorio.iniciar();
        costoNoche=(GeneradorAleatorio.generarDouble(10000)-2000);
        habitacionOcupada=false;
    }
    
    public boolean IngresarClienteHabitacion(){
        return(this.habitacionOcupada=true); 
    }
    
    public void aumentarPrecioHabitaciones(double precioAumentar){
        costoNoche=costoNoche+ precioAumentar;
    }
    
    public String estadoHabitacion(){
        if(this.habitacionOcupada==true) return ("Ocupada por:  "+ reservaCliente.toString());
        else return ("libre");
    }
    

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public boolean isOcupada() {
        return habitacionOcupada;
    }

    public void setOcupada(boolean habitacionOcupada) {
        this.habitacionOcupada = habitacionOcupada;
    }

    public Cliente getReservaCliente() {
        return reservaCliente;
    }

    public void setReservaCliente(Cliente reservaCliente) {
        this.reservaCliente = reservaCliente;
    }
    
    
}
