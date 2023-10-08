/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author alumnos
 */
public class Circulo extends Figura {
    private double radio;  
    
    public Circulo(double unRadio,String unColorR, String unColorL){
    super(unColorR,unColorL);
    setRadio(unRadio);
    }
    
    //////////////////////////////
        public void setRadio(double unRadio ){
    radio = unRadio;
}
        
                    public double GetRadio(){
    return radio;
}  
    
    
    /////////////////////////////
    
    
    
    

    @Override
    public double calcularPerimetro(){
    double perimetro = 2*Math.PI*radio;
    return(perimetro);
    }
            
 
    @Override
    public double calcularArea(){
    double area= Math.PI * Math.pow(radio, 2);
    return(area);
    }
    
    public String toString(){
        String aux = super.toString() +
                " radio: " + GetRadio();
        return aux;
       }
    
    
}
