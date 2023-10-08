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
public class Estanteria {
       private Libro[] vectorLibros;
       private int cantLibros;
       
       public void Estanteria(){
       cantLibros=0;
       vectorLibros= new Libro[20];   
       }
      
       
       public void agregarLibro(Libro unLibro){
        
        if(cantLibros<20){
            vectorLibros[cantLibros]=unLibro;
        }
        cantLibros++;
        
    }
          
    
     public int getCantitadLibros(){
         return cantLibros;
     }
     
     public boolean getEstanteLleno(int totalLibros){
         if (totalLibros < 20) return false;
         else return true;
     }   
     
     public Libro devolverPorTitulo(String nombreBuscar, int dimL){ 
            int k=0;
            String aux = vectorLibros[k].getTitulo();
           while((k<dimL) && (!nombreBuscar.equals(aux))){
               aux = vectorLibros[k].getTitulo();
           }
           if (nombreBuscar.equals(aux)) return vectorLibros[k];
           else return vectorLibros[k]=null;                                /////////que hacer si no lo encuentra??? 
     }
}
    