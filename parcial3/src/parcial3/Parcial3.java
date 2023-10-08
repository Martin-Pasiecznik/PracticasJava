/*
Queremos representar estanterías de libros. Una estantería mantiene sus libros organizados en N estantes cada uno con lugar para M libros. Un libro posee título, nombre de su primer autor y peso.
a) Implemente las clases de su modelo, con sus atributos y getters/setters adecuados.
 Provea constructores para iniciar: los libros a partir de toda su información; la estantería para N estantes y lugar para M libros por estante (inicialmente no debe tener libros cargados).

b) Implemente los siguientes métodos:
- almacenarLibro: recibe un libro, un nro. de estante y nro. de lugar válidos y guarda al libro en la estantería. Asuma que dicho lugar está disponible.

- sacarLibro: recibe el título de un libro, y saca y devuelve el libro con ese título, quedando su lugar disponible. Tenga en cuenta que el libro puede no existir.

- calcular: calcula y devuelve el libro más pesado de la estantería.

2) Realice un programa que instancie una estantería para 5 estantes y 3 libros por estante. Almacene 7 libros en la estantería. A partir de la estantería: saque un libro e informe su representación String; luego, informe el título del libro más pesado.  

 */
package parcial3;

/**
 *
 * @author Martin
 */
public class Parcial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estanteria nuevoEstante = new Estanteria(7,3);
        
        Libros libro1 = new Libros("f","pepe",526.2);
        Libros libro2 = new Libros("a","pepe2",522.2);
        Libros libro3 = new Libros("s","pepe3",516.2);
        Libros libro4 = new Libros("c","pepe4",596.2);
        Libros libro5 = new Libros("f","pepe5",546.2);
        Libros libro6 = new Libros("g","pepe6",545.2);
        Libros libro7 = new Libros("d","pepe7",599.2);
        
        nuevoEstante.almacenarLibro(libro1, 0, 0);
        nuevoEstante.almacenarLibro(libro2, 0, 1);
        nuevoEstante.almacenarLibro(libro3, 0, 2);
        nuevoEstante.almacenarLibro(libro4, 2, 0);
        nuevoEstante.almacenarLibro(libro5, 1, 1);
        nuevoEstante.almacenarLibro(libro6, 2, 1);
        nuevoEstante.almacenarLibro(libro7, 4, 1);
        
        System.out.println(nuevoEstante.sacarLibro("d", 7, 3).toString());
        System.out.println(nuevoEstante.calcular(7, 3).getTitulo());
        

        
    }
    
}
