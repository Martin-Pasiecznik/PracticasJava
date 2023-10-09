/*
Representar dos tipos de sorteos solidarios: común y avanzado. Ambos sorteos
mantienen el valor en pesos del premio y guardan para cada bono (0..99) la información de la persona a la que fue asignado (nombre, dni y colaboración en pesos). Sin embargo, difieren en cierta funcionalidad (se detalla más adelante).
Lea 1 y 2 atentamente y luego implemente.

1- Genere las clases necesarias. Provea constructores para iniciar los sorteos a partir del premio en pesos (los bonos inicialmente no están asignados a nadie).

2- Implemente los métodos necesarios, en las clases que corresponda, para:
a. Agregar una persona al sorteo, devolviendo el nro. de bono que le tocó. Los nros. De bono se reparten en forma consecutiva comenzando de 0. Asuma que hay un nro. De bono disponible.
b. Obtener la persona que compró el nro. de bono B. Asuma que B es un nro. de bono nválido.
c. Ejecutar el sorteo, devolviendo la persona ganadora, teniendo en cuenta que: en los sorteos comunes se elige el nro. de bono ganador aleatoriamente entre los nros. repartidos; en los sorteos avanzados la persona ganadora será la que aportó mayor colaboración en pesos.

3- Realice un programa que instancie un sorteo común y un sorteo avanzado con premio 50.000$. Agregue personas a cada sorteo. Ejecute ambos sorteos e imprima la información obtenida de la ejecución.

 */
package parcial5;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Martin
 */
public class Parcial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();;
        Comun nuevoSorteoComun = new Comun(5000.0);
        Avanzado nuevoSorteoAvanzado = new Avanzado(5000.0);
        
        
        for (int i = 0; i < 99; i++) {
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre(GeneradorAleatorio.generarString(5));
            nuevaPersona.setDNI(GeneradorAleatorio.generarInt(500000));
            nuevaPersona.setMontoColaboracion(GeneradorAleatorio.generarDouble(30000));
            nuevoSorteoComun.agregarPersona(nuevaPersona, i);
            
            Persona nuevaPersona2 = new Persona();
            nuevaPersona2.setNombre(GeneradorAleatorio.generarString(5));
            nuevaPersona2.setDNI(GeneradorAleatorio.generarInt(500000));
            nuevaPersona2.setMontoColaboracion(GeneradorAleatorio.generarDouble(30000));
            nuevoSorteoAvanzado.agregarPersona(nuevaPersona2, i);
        }
        
        System.out.println(nuevoSorteoComun.ejecutarSorteo().toString());
        System.out.println(nuevoSorteoAvanzado.ejecutarSorteo().toString());
        
        
        
        
    }
    
}
