/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase;

public class Alumno {
    private int nia;
    private NIF nif;
    private String nombre;
    private double nota;

    public Alumno() {
        nif = new NIF();    // SIEMPRE! que tengamos una clase compuesta, en el constructor debemos crear el objeto 
    }                       

    public Alumno(int nia, NIF nif, String nombre, double nota) {
        this.nia = nia;
        this.nif = nif;
        this.nombre = nombre;
        this.nota = nota;
        this.nif = new NIF (nif); // hemos tenido que crear un constructor copia 
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno " + "NIA: " + nia + " NIF: " + nif + " Nombre: " + nombre + " Nota: " + nota ;
    }
    
}
