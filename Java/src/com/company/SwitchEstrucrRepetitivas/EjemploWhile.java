package com.company;

public class EjemploWhile {
    public static void main(String[] args) {

        // Inicializamos una variable de control
        // Esta variable controla cuando termina el bucle
        int x = 2;

        // La sentencia while: mientras la condicion sea true, se ejecuta el bloque
        // Condicion: x < 10 (mientras x sea menor que 10)
        while(x < 10) {

            // Esto se ejecuta en cada iteracion del bucle
            System.out.println("Valor actual de x: " + x);

            // Incrementamos x en 1
            // Si no hacemos esto, el bucle seria infinito porque x siempre seria 2
            ++x;

            // El bucle continua hasta que x sea 10 o mas
        }

        // Cuando x llega a 10, la condicion (x < 10) se vuelve false
        // y el bucle termina, continuando con esta linea
        System.out.println("Bucle terminado. Valor final de x: " + x);
    }
}
