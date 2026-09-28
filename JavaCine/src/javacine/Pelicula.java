package javacine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacer
 */
    public class Pelicula {
        String nombre;
        String genero;
        int duracion;
    
    public Pelicula(String n, String g, int d) {
        nombre = n;
        genero = g;
        duracion = d;
    
    }
    
    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre + "\nGenero: " + genero + "\nduracion: "+ duracion + " minutos");
    
    }
    public void esPeliculaLarga() {
        if (duracion > 120) {
            System.out.println("La pelicula es larga");
        } else {
            System.out.println("La pelicula es corta");
        }
    }
    
    
}