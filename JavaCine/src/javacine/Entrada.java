    package javacine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacer
 */
public class Entrada {
    int tipo;
    int precio;
    
    public Entrada(int t) {
        tipo = t;
    } 
    
    public void calcularPrecio(){
        switch (tipo) {
            
            case 1:
                precio = 5000;
            break;
            
            case 2:
                precio = 3500;
            break;
            
            case 3:
                precio = 2500;
            break;  
            
            default:
                System.out.println("No valido.");
        }
    }
        
    public void mostrarEntrada() {
        
        
        switch (tipo) {
            
            case 1:
                System.out.println("Tipo: Normal");
                System.out.println("precio de la entrada: "+ precio );
            break;
            
            case 2:
                System.out.println("Tipo: Estudiante");
                System.out.println("Precio de la entrada: "+ precio);
            break;
            
            case 3:
                System.out.println("Tipo: Adulto Mayor");
                System.out.println("Precio de la entrada: "+ precio);
            break;
            
            default:
                System.out.println("no valido");
        }
    }
        
    
}

