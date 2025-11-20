package com.company;

public class EjemploBreakContinue {
    public static void main(String[] args) {

        System.out.println("EJEMPLO CON BREAK:");
        // Bucle for normal
        for(int i = 1; i <= 10; i++) {

            // Cuando i sea igual a 5, el break termina el bucle COMPLETAMENTE
            if(i == 5) {
                System.out.println("Encontrado el numero 5 - BREAK");
                break;  // Sale inmediatamente del bucle for
            }

            System.out.println("Numero: " + i);
        }
        System.out.println("Bucle con break terminado");

        System.out.println("\nEJEMPLO CON CONTINUE:");
        // Otro bucle for
        for(int i = 1; i <= 5; i++) {

            // Cuando i sea 3, el continue salta esta iteracion
            if(i == 3) {
                System.out.println("Encontrado el numero 3 - CONTINUE");
                continue;  // Salta al siguiente ciclo, no ejecuta lo demas
            }

            // Esta linea NO se ejecuta cuando i == 3 por el continue
            System.out.println("Numero: " + i);
        }
        System.out.println("Bucle con continue terminado");
    }
}
