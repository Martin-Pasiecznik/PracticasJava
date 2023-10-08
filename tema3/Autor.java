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
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    
    public Autor(String unNombre,String unBiografia, String unOrigen){
           nombre=unNombre;
           biografia= unBiografia;
           origen=unOrigen;
}
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
        public void setBiografia(String unBiografia){
        nombre = unBiografia;
    }
        public void setOrigen(String unOrigen){
        nombre = unOrigen;
    }
    ////////////////// get
        public String getNombre(){
            return nombre;
        }
        public String getBiografia(){
            return biografia;
        }
        public String getOrigen(){
            return origen;
        }
        
        public String getRepresentacion(){
        return ("Nombre autor: "+ nombre + " biografia: "+ biografia +" origen: "+ origen);
        }
}
