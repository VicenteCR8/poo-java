package ejemploherencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacer
 */
public class animal {
    protected String tipo, sonido;
    
    animal(String tipo, String sonido){
        this.tipo= tipo;
        this.sonido = sonido;
    }
    
    public void hacerSonido() {
        System.out.println("El "+ tipo+ " hace "+ sonido);
        
    }
}
