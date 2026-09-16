/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author cacer
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1.
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        }else; {
         System.out.println("el numero es impar");
           }
        //Ejercicio 2.
        System.out.print("Ingrese una nota: ");
        float nota = sc.nextInt();
        if (nota < 4) {
            System.out.println("Nota Insatisfactoria");
        } else if (nota > 4 && nota < 5) {
            System.out.println("Nota satisfactoria");
        } else if (nota > 5 && nota < 6.5) {
            System.out.println("Nota Buena");
        } else if (nota > 6.5 || nota == 7 ) {
            System.out.println("Nota Excelente");
        } else {
            System.out.println("Ponga una nota del 1.0 al 7.0");
        }           
            
    }
    
}
