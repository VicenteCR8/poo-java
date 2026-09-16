/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioauto;

/**
 *
 * @author cacer
 */
public class EjercicioAuto {
    public static void main(String[] args) {
        Persona propietario = new Persona("Juan", 30);
        auto auto = new auto("Toyota", propietario);
        
        auto.mostrarDetalles();
        
        auto.cambiarNombrePropietario("carlos");
        auto.mostrarDetalles();
    }
    
}
