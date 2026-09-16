/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author cacer
 */
public class TipoPerro extends Perro{
    private String raza;
    
    public TipoPerro(String color, String raza) {
        super(color);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("El "+tipo+" de raza "+raza+" color "+color+" hace "+ sonido);
    }
}
