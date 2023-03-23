// Ejemplo TreeSEt
package ejemplotreeset;

import java.util.Scanner;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        TreeSet<Character> letras = new TreeSet();  // si queremos modificar el criterio por el que ordenar los elmentos del treeset debemos añadir 
        Scanner sc = new Scanner(System.in);        // un Comparator a la declaración :
        String cadena;                              // TreeSet<Character> letras = new TreeSet(new Comparator<Character>() { ...
        do {                                        // y establecer el criterio
            System.out.println("Introduzca cadena:");
            cadena = sc.nextLine();
            if (!cadena.isEmpty()) {
                for (int i = 0; i < cadena.length(); i++) {
                    if (Character.isLetter(cadena.charAt(i))) {
                        letras.add(cadena.charAt(i));
                    }
                }
                // NO PODEMOS UTILIZAR UN for "normal" PORQUE LOS TREESET NO TIENEN ACCESO CON INDICES COMO LOS ARRAYLISTS
                for(Character c : letras){
                    System.out.print(c + " ");
                }
                System.out.println("");
            }   
        } while (!cadena.isEmpty());

    }
}
// Si queremos introducir objetos en el TreeSet deberemos implementar el método CompareTo en la clase del objeto
// para así poder establecer un criterio de orden para el TreeSet, ya que éste no puede almacenarlos sin ordenar.

// Debemos tener en cuenta que el criterio de ordenación que establezcamos será el que el TreeSet use tambien para
// saber si el objeto está repetido o no, es decir, usará el atributo usado en el CompareTo para saber si está repetido
// Por ejemplo: si metiesemos objetos Persona y el criterio de ordenacion fuese el nombre, el TreeSet no nos incluiría 
// las nuevas personas con un nombre que ya estuviese en la coleccion.

// Para eso luego lo confirma con el método Equals, por lo tanto para usar la coleccion TreeSet es recomendable implementar
// ambos métodos: CompareTo y Equals.