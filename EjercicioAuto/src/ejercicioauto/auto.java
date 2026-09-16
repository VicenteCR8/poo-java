package ejercicioauto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacer
 */
public class auto {
    private String modelo;
    private Persona propietario;
    
    public auto(String modelo, Persona propietario) {
        this.modelo = modelo;
        this.propietario = propietario;
    }
    
    public String getModelo() {return modelo;}
    
    public void setModelo(String modelo) {this.modelo = modelo;}
    
    public Persona getPropietario() {return propietario;}
    
    public void setPropietario(Persona propietario) {this.propietario = propietario;}
    
    public void mostrarDetalles() {
        System.out.println("Modelo: "+ modelo);
        propietario.saludar();
        
    }
    
    public void cambiarNombrePropietario(String nuevoNombre) {
        propietario.setNombre(nuevoNombre);
    }
}
