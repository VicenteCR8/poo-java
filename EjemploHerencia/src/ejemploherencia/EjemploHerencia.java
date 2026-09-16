/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author cacer
 */
public class EjemploHerencia {

    public static void main(String[] args) {
       animal animal = new animal("Perro", "Guau");
       
       animal.hacerSonido();
       
       Perro firulais = new Perro("negro");
       
       firulais.hacerSonido();
    
      animal peruano = new TipoPerro("Negro", "peruana");
      peruano.hacerSonido();
      }
    
}
