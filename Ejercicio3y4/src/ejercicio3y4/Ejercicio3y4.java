/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3y4;

import java.util.Scanner;
/**
 *
 * @author cacer
 */
public class Ejercicio3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
         
        System.out.println("Tabla del " + numero);
        
        for (int i =1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        // Ejercicio 4.
        int suma = 0;
        System.out.print("Ingresa un numero: ");
        int numerox = sc.nextInt();
        while (numerox != 0){
            suma = suma + numero;
            
            System.out.print("Ingresa otro numero: ");
       numerox = sc.nextInt();
        }
        System.out.println("La suma total es: " + suma);
        
    }
}
