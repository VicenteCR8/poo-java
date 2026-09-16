/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author cacer
 */
public class Perro extends animal{
    protected String color; 
    
    Perro(String color){
    super("perro", "GUAU");
    this.color=color;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El "+tipo+" de color "+color+" hace "+sonido);
        
        
    }

}
