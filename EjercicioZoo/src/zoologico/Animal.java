/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author cacer
 */
public class Animal {
    
    String nombre;
    int edad;
    double peso;
    String sonido;
    
    public void presentar() {
        System.out.println("mi mascota se llama " + nombre+ " tiene  "+ edad + " años "+ "pesa "+ peso+ " kg");
    
    }       
            
    public void hacerSonido() {
            System.out.println(sonido);
    }
}

