/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

public class NIF {

    private int numeros;
    private char letra;

    public NIF() {
    }

    public NIF(int numeros, char letra) {
        this.numeros = numeros;
        this.letra = letra;
    }

    public NIF(NIF nif) {           // hemos tenido que crear este constructor copia para poder crear objetos NIF en la clase alumno
        this.numeros = nif.numeros;
        this.letra = nif.letra;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF: " + numeros + " - " + letra;
    }

}
