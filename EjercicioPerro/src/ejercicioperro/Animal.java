package ejercicioperro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacer
 */
public class Animal {
    private String nombre = "michi";
    int edad;
    double peso;
    String sonido;

    //constructor
    public Animal(String nombre, int edad, double peso, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sonido = sonido;
    }
   
    

    //constructor
    public Animal() {
    }

    public void presentar(){
        System.out.println("nombre:" + this.nombre + "\n" + "edad:" + this.edad + "\n" + "peso:" + this.peso + "\n" + "sonido" + this.sonido + "\n");

    }
    public void hacerSonido(){
        System.out.println(sonido);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre= "Mi mascota es "+ nombre;
    }
}