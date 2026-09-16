/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologico;

/**
 *
 * @author cacer
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal firulais = new Animal();
    firulais.nombre = "firulais";
    firulais.edad = 3;
    firulais.peso = 2.5;
    firulais.sonido = "GUAGUAU";
    
    firulais.presentar();
    firulais.hacerSonido();
    
    Animal vaca = new Animal();
    vaca.nombre = "vaca lola";
    vaca.edad = 5;
    vaca.peso = 130;
    vaca.sonido = "muuu";
    
    vaca.presentar();
    vaca.hacerSonido();
    
            
    }
    
}
