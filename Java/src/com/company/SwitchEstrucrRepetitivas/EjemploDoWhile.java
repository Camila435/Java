package com.company;

public class EjemploDoWhile {
    public static void main(String[] args) {

        // Inicializamos la variable de control
        int x = 10;

        // El do-while: PRIMERO ejecuta el bloque, LUEGO verifica la condicion
        // A diferencia del while que verifica primero
        do {
            // Esto se ejecuta AL MENOS UNA VEZ, sin importar la condicion
            System.out.println("Valor actual de x: " + x);

            // Incrementamos x en 1
            x++;

            // La condicion se verifica DESPUES de ejecutar el bloque
        } while(x < 10);  // Condicion: x < 10

        // Cuando la condicion se vuelve false, el bucle termina
        System.out.println("Bucle terminado. Valor final de x: " + x);
    }
}
