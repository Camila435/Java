package com.company;

public class Logical {
    public static void main(String[] args) {

        System.out.println("=== OPERADORES LOGICOS ===");

        // OPERADOR AND (&&) - Devuelve true solo si AMBOS operandos son true
        boolean b = true && false;  // true Y false = false
        System.out.println("true && false = " + b);

        System.out.println("---------------");

        // TABLA DE VERDAD DEL OPERADOR AND (&&)
        System.out.println("AND (&&) - Solo true si AMBOS son true:");
        System.out.println("true && true = " + (true && true));    // true Y true = true
        System.out.println("true && false = " + (true && false));  // true Y false = false
        System.out.println("false && true = " + (false && true));  // false Y true = false
        System.out.println("false && false = " + (false && false)); // false Y false = false

        System.out.println("---------------");

        // TABLA DE VERDAD DEL OPERADOR OR (||)
        System.out.println("OR (||) - True si AL MENOS UNO es true:");
        System.out.println("true || true = " + (true || true));    // true O true = true
        System.out.println("true || false = " + (true || false));  // true O false = true
        System.out.println("false || true = " + (false || true));  // false O true = true
        System.out.println("false || false = " + (false || false)); // false O false = false

        System.out.println("---------------");

        // OPERADOR NOT (!) - INVIERTE el valor booleano
        System.out.println("NOT (!) - Invierte el valor:");
        System.out.println("!true = " + (!true));   // NO true = false
        System.out.println("!false = " + (!false)); // NO false = true

        System.out.println("---------------");

        // EJEMPLOS PRACTICOS CON COMENTARIOS
        System.out.println("EJEMPLOS PRACTICOS:");

        // Ejemplo 1: Verificar si puede conducir
        int edad = 20;
        boolean tieneLicencia = true;
        // Para conducir necesita: edad >= 18 Y tener licencia
        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("Edad: " + edad + ", Licencia: " + tieneLicencia);
        System.out.println("Puede conducir? " + puedeConducir);

        // Ejemplo 2: Verificar si puede descansar
        boolean esFinDeSemana = false;
        boolean tieneVacaciones = true;
        // Puede descansar si: es fin de semana O tiene vacaciones
        boolean puedeDescansar = esFinDeSemana || tieneVacaciones;
        System.out.println("Fin de semana: " + esFinDeSemana + ", Vacaciones: " + tieneVacaciones);
        System.out.println("Puede descansar? " + puedeDescansar);

        // Ejemplo 3: Usando NOT (!)
        boolean estaLloviendo = true;
        // Podemos salir si NO esta lloviendo
        boolean podemosSalir = !estaLloviendo;
        System.out.println("Esta lloviendo: " + estaLloviendo);
        System.out.println("Podemos salir? " + podemosSalir);
    }
}
