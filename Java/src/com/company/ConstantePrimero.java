package com.company;

public class ConstantePrimero {

    public static void main(String[] args){
        // ERROR 1: La variable 'b' no está declarada
        // ERROR 2: No se puede asignar dos veces a una constante

        // CORRECCIÓN: Declarar y asignar en un paso
        final int a = 10;  // Asignación inicial correcta

        // Si quieres usar otra variable, debes declararla primero
        final int b = 20;

        // ERROR: No se puede reasignar una constante
        // a = 5;  // Esto CAUSARÍA ERROR de compilación

        System.out.println("Constante a: " + a);
        System.out.println("Constante b: " + b);

        // ERROR 3: Falta el tipo de dato y el valor
        // ERROR 4: No sigue la convención de mayúsculas

        // CORRECCIÓN:
        final int CONSTANTE_FLAG = 32;  // Mayúsculas y guiones bajos
        System.out.println("Constante flag: " + CONSTANTE_FLAG);

        // DEMOSTRACIÓN: Intentar cambiar una constante (PRODUCE ERROR)
        // CONSTANTE_FLAG = 50;  // Descomentar esta línea producirá error
    }
}

