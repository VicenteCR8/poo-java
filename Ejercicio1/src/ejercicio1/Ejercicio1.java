/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
/**
 *
 * @author cacer
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese altura: ");
        double altura = sc.nextDouble();
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else { 
            System.out.println("Eres menor de edad.");
        }
        System.out.print("Ingrese trabajo true/false: ");
        Boolean trabajo = sc.nextBoolean();
        if (trabajo == true) {
            System.out.println("Eres trabajador(a) ");
        
            System.out.println("selecciona un turno de trabajo (1,2,3,4)" + 
                    "\n1. De Lunes a Viernes Diurno.\n" +
                    "2. De Lunes a Viernes Vespertino.\n" +
                    "3. De Martes a Sábado.\n" +
                    "4. Sábados y Domingos y Festivos.");
            int turno = sc.nextInt();
            switch (turno) { 
                case 1:
                    System.out.println("tu turno de trabajo es de Lunes a Viernes Diurno.");
                    break;
                case 2:
                    System.out.println("Tu turno de trabajo es de Lunes a Viernes Vespertino.");
                    break;
                case 3:
                    System.out.println("Tu turno de trabajo es de Martes a Sabado");
                    break;
                case 4:
                    System.out.println("Tu turno de trabajo es Sabados y Domingos y Festivos.");
                default:
                    System.out.println("Numero de turno no valido, prueba con 1,2,3,4");
                    break;
            }
        }
        System.out.print("Ingrese Estado civil (S, C, V , D): ");
        char estado = sc.next().charAt(0);
        if (estado == 'S') {
            System.out.println("Eres soltero(a)");
        } else  if (estado == 'C') {
            System.out.println("Eres Casado(a)");
        } else if (estado == 'V') { 
            System.out.println("Eres Viudo(a)");
        } else if (estado == 'D') {
            System.out.println("Eres Divorciado(a)");
        } else {
            System.out.println("dato ingresado no valido, vuelva a intertar con S,C,V,D en mayuscula.");
        }  
        System.out.println("Bienvenido " + nombre + " " + altura + "m " + edad + " " + trabajo + " " + estado);
    }
    
    
    
}
