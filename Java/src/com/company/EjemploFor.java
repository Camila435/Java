package com.company;

public class EjemploFor {
    public static void main(String[] args) {

        // El bucle for tiene TRES partes en su declaracion:
        // 1. Inicializacion: int i = 1 (variable de control)
        // 2. Condicion: i <= 5 (cuando terminar)
        // 3. Actualizacion: i++ (como cambia en cada vuelta)
        for(int i = 1; i <= 5; i++) {

            // Esto se ejecuta en cada iteracion del bucle
            // mientras la condicion i <= 5 sea true
            System.out.println("Iteracion numero: " + i);
        }

        // Cuando i llega a 6, la condicion i <= 5 se vuelve false
        // y el bucle termina
        System.out.println("Bucle for terminado");
    }
}
