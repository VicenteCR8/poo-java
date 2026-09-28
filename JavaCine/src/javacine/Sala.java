/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacine;

/**
 *
 * @author cacer
 */
public class Sala {
    int numero;
    int capacidad;
    int entradasVendidas;

 
    public Sala(int n, int c)  {
        numero = n;
        capacidad = c;
        entradasVendidas = 0;
    }

    public boolean estaLlena() {
        return entradasVendidas == capacidad;
    }

    public void mostrarDisponibilidad() {
        System.out.println("Sala: "+numero);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Entradas vendidas: "+entradasVendidas);
        System.out.println("Asientos disponibles: "+(capacidad - entradasVendidas));
    }

    public void venderEntrada(int x) {
        if (entradasVendidas + x <= capacidad ) {
            entradasVendidas = entradasVendidas + x;
            System.out.println("Entrada vendida correctamente.");
        } else {
            System.out.println("La sala esta llena. No se puede vender otra entrada.");
        }
        
    }
}


