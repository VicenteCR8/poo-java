/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioperro;

/**
 *
 * @author cacer
 */
public class EjercicioPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal perro = new Animal("fIRULAIS", 3, 5.5, " GUAU");
    
    perro.presentar();
    
    Animal gato = new Animal();
    
    gato.setNombre("muchi");
    
    gato.presentar();
    }
    
}
