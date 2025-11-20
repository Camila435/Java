package com.company.SwitchEstrucrRepetitivas;

import java.util.Scanner;

public class EjercicioMerceria {
    public static void main(String[] args) {
        int CantidadPaquetes;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de paquetes que desea comprar: ");
            CantidadPaquetes = teclado.nextInt();

            if(CantidadPaquetes<5){
                System.out.println("No se permiten ventas minoristas(cantidad de paquetes menor a 5)");
            } else {
                if(CantidadPaquetes>=5 && CantidadPaquetes<=15){
                    System.out.println("El precio del envio es de 10USD" );
                } else {
                    System.out.println("No tiene costo de envio" );
                }
            }
        }
    }
}