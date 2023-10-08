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
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String color;
    private String colorLinea;
    
    public void setLadoA(double unLadoA ){
    ladoA = unLadoA;
}
        public void setLadoB(double unLadoB ){
    ladoB = unLadoB;
}
        
            public void setLadoC(double unLadoC ){
    ladoC = unLadoC;
}

            public void setColor(String Color ){
    color = Color;
}
            
            public void setColorLinea(String ColorLinea ){
    colorLinea = ColorLinea;
}

///////////////// GET
            public double GetLadoA(){
    return ladoA;
}            
            
            public double GetLadoB(){
    return ladoB;
}
            
            public double GetLadoC(){
    return ladoC;
}                    
            public String GetColor(){
    return color;
}            
            
            public String GetColorLinea(){
    return colorLinea;
}
            
//////////////////

            public double calcularPerimetro(){
               double perimetro = ladoA+ladoB+ladoC;
               return(perimetro);
            }
            
            public double calcularArea(){
               double s= (ladoA+ladoB+ladoC)/2;
               double area= Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
               return(area);
            }
            
}