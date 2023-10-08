/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Martin
 */
public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double unladoA,double unladoB,double unladoC,String unColorR, String unColorL){
        super(unColorR,unColorL);
        setLadoA(unladoA);
        setLadoB(unladoB);
        setLadoC(unladoC);
    }
    
    public void setLadoA(double unLadoA ){
    ladoA = unLadoA;
}
        public void setLadoB(double unLadoB ){
    ladoB = unLadoB;
}
        
            public void setLadoC(double unLadoC ){
    ladoC = unLadoC;
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

            
//////////////////

    @Override
            public double calcularPerimetro(){
               double perimetro = ladoA+ladoB+ladoC;
               return(perimetro);
            }
          
    @Override
            public double calcularArea(){
               double area=(ladoA*ladoB)/2;
               return(area);
            }
            
  
                public String toString(){
        String aux = super.toString() + 
                    " lado a" + this.GetLadoA() +
                    " lado b" + this.GetLadoB() +
                    " lado c" + this.GetLadoC();            
             return aux;
       }
}