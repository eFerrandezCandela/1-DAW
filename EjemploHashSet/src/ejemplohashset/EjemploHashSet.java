// Ejemplo TreeSEt
package ejemplohashset;

import java.util.HashSet;
import java.util.Scanner;

public class EjemploHashSet {

    public static void main(String[] args) {

        HashSet<Character> letras = new HashSet();
        Scanner sc = new Scanner(System.in);
        String cadena;
        do {
            System.out.println("Introduzca cadena:");
            cadena = sc.nextLine();
            if (!cadena.isEmpty()) {
                for (int i = 0; i < cadena.length(); i++) {
                    if (Character.isLetter(cadena.charAt(i))) {
                        letras.add(cadena.charAt(i));
                    }
                }
                // NO PODEMOS UTILIZAR UN for "normal" PORQUE LAS COLECCIONES SET NO TIENEN ACCESO CON INDICES COMO LOS ARRAYLISTS
                for(Character c : letras){
                    System.out.print(c + " ");
                }
                System.out.println("");
            }   
        } while (!cadena.isEmpty());

    }

}

