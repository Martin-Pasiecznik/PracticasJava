/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author alumnos
 */
public class VisorFigurasModificado {
    private int guardadas;
    private int capacidadMaxima=5;
    private Figura [] vector;
    
    public VisorFigurasModificado(){
    guardadas=0;
}
    
    public void guardar(Figura f,int i){
        vector[i]=f;
}
    
 public boolean quedaEspacio(int i){
     if (i<5) return true;
     return false;
}
 
    
public void mostrar(Figura f){
System.out.println(f.toString());
guardadas++;
}

public int getMostradas() {
return guardadas;
}
}
