// Esto es un ejercicio sin terminar hecho en clase:
package ejercicioclaseficherossincompletar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioClaseFicherosSinCompletar {

    public static void main(String[] args) throws IOException {

        // Opcion 5: metodo mostrarFicheroANimales()
        // Se muestra por pantalla el contenido del fichero de texto datos.txt
        Scanner entrada;
        File f = new File("ficheros/datos.txt");
        String cadena;

        entrada = new Scanner(f);
        while (entrada.hasNext()) {
            cadena = entrada.nextLine();
            System.out.println(cadena);
        }

        // crear un fichero binario donde guardamos la referencia, nombre y el sueldo
        // con WriteInt(id), WriteUTF(nombre), WriteDouble(Sueldo)
        int n = 0;
        String nombre = null;
        double precio = 0;
        try (FileOutputStream fos = new FileOutputStream("ficheros/tabla.dat"); DataOutputStream salida = new DataOutputStream(fos)) {
            entrada = new Scanner(f);
            do {
                    cadena = entrada.nextLine();
                    String[] linea = cadena.split(" ");
                    n = Integer.parseInt(linea[1]);
                    salida.writeInt(n);
                    nombre = linea[2];
                    salida.writeUTF(nombre);
                    precio = Double.parseDouble(linea[7]);
                    salida.writeDouble(precio);

                System.out.println(n);
                System.out.println(nombre);
                System.out.println(precio);
            } while(entrada.hasNextLine());
            
        
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // metodo leer el archivo binario
        try (FileInputStream fis = new FileInputStream("ficheros/tabla.dat"); DataInputStream dis = new DataInputStream(fis)) {
            while (true) {
                n = dis.readInt();
                System.out.println(n);
                nombre = dis.readUTF();
                System.out.println(nombre);
                precio = dis.readDouble();
                System.out.println(precio);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
