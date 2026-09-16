/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cacer
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 5,
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        
        int numero = ra.nextInt(100)+ 1;
        int intento;
        
        System.out.println("adivina un numero entre 1 y 100.");
        
        do {
            System.out.println("Ingresa tu intento: ");
            intento = sc.nextInt();
            
            if (intento < numero) {
                System.out.println("El numero es Mayor que " + intento);
            } else if (intento > numero) {
                System.out.println("El numero es Menor que " + intento);
            }
        } while (intento != numero);
        
        System.out.println("Adivinaste el numero, era; " + numero);
    }
}
       
            

