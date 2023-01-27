/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_Clase {

    // creamos el ArrayList fuera de la clase (como variable global) ya que vamos a 
    // utilizarlo en todos los métodos de la clase y así nos evitamos estar mandandolo como parámetro:
    static ArrayList<Alumno> alumnos = new ArrayList();

    public static void main(String[] args) {
        // vamos a crear un arrayList de alumnos con una clase compuesta "alumno" y otra clase NIF
        llenarArray();
        mostrarArray();
    }

    public static void mostrarArray() {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }

    public static void llenarArray() {
        String nombre;
        int nia;
        double nota;
        int numeros;
        char letra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca numero de alumnos:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Introduzca los datos del alumno:");
            System.out.print("NIA: ");
            nia = sc.nextInt();
            // comprobar si existe para evitar repetir el alumno: (SIN USAR el .CONTAINS) 
            // El objeto Contains funciona con OBJETOS, no con parametros, y no nos indicaria el error si lo hacemos!!!!
            // En este caso tendría que enviarle el objeto alumno y no el parametro nia...
            // ¡¡OJO!! y  en la clase alumno además hay que crear un metodo equals!!!
            // en general cualquier metodo el cual trabaje con objetos indexOf(), contains(), etc. → tenemos que crear el metodo equals en la clase
            boolean existe = false;
            do{    
            for(Alumno alumno : alumnos){
                if (alumno.getNia() == nia){
                    existe = true;
                }
            }
            if (existe){
                System.out.println("El alumno ya existe.");
            }
            } while (existe);
            
            sc.nextLine();      // limpiamos buffer
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("NIF: ");   
            System.out.print("Numeros: ");
            numeros = sc.nextInt();
            sc.nextLine();      // volvemos a limpiar el buffer
            System.out.print("Letra: ");
            letra = sc.nextLine().charAt(0);
            System.out.print("Nota: ");
            nota = sc.nextInt();
            sc.nextLine();

            Alumno a = new Alumno(); // creamos un objeto alumno
            a.setNia(nia);
            a.setNombre(nombre);
            NIF nif = new NIF(numeros, letra);       // tenemos que crear un objeto NIF para poder asignarle los parametros (numeros y letra) que hemos leido por teclado
            a.setNif(nif);                          // ya que no podemos hacer el setNif sin mandarle un objeto NIf que es el que espera como parametro.
            a.setNota(nota);

            alumnos.add(a);     // introducimos el objeto "a" al ArrayList  
        }

    }
}
