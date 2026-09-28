/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacine;
import java.util.Scanner;

/**
 *
 * @author cacer
 */
public class JavaCine {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    Pelicula pelicula = new Pelicula("interestellar", "ciencia ficcion", 169);
    Entrada entrada = new Entrada(2);
    Sala sala = new Sala(2,50);
    
    int opcion = 0;
    
    while (opcion != 5){
        System.out.println("");
        System.out.println("== CINE JAVA==");
        System.out.println(" ");
        System.out.println("1. Mostrar informacion de pelicula");
        System.out.println("2. Calcular precio de entrada");
        System.out.println("3. Vender entrada");
        System.out.println("4. Ver disponibilidad de sala");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion: ");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                pelicula.mostrarInformacion();
                pelicula.esPeliculaLarga();
            break;
            
            case 2:
                entrada.calcularPrecio();
                entrada.mostrarEntrada();
            break;
            
            case 3:
                System.out.print("¿Cuantas entradas desea? ");
                int cantidad = sc.nextInt();
                sala.venderEntrada(cantidad);
            break;
            
            case 4:
                sala.mostrarDisponibilidad();
            break;
            
            case 5:
                System.out.println("Gracias por utilizar Cine Java.");
            break;
            
            default:
                System.out.println("Opcion no valida.");
                
        }
    }
    
    }
    
}
