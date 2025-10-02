package com.company;

public class TiposPrimitivosDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE TIPOS PRIMITIVOS EN JAVA ===");

        // 1. char - Caracteres (comillas simples)
        char varCaracter = 'c';
        System.out.println("char: " + varCaracter);
        System.out.println("Tamaño: 16 bits, Unicode: \\u" + Integer.toHexString(varCaracter));

        // 2. boolean - Valores lógicos
        boolean varBooleano = false;
        System.out.println("\nboolean: " + varBooleano);
        System.out.println("Puede ser true o false");

        // 3. byte - Enteros pequeños
        byte varByte = 8;
        System.out.println("\nbyte: " + varByte);
        System.out.println("Rango: -128 a 127");

        // 4. short - Enteros cortos
        short varShort = 24;
        System.out.println("\nshort: " + varShort);
        System.out.println("Rango: -32,768 a 32,767");

        // 5. int - Enteros estándar
        int varEntera = 32;
        System.out.println("\nint: " + varEntera);
        System.out.println("Rango: -2,147,483,648 a 2,147,483,647");

        // 6. long - Enteros largos (termina con L)
        long varLong = 123456789L;
        System.out.println("\nlong: " + varLong);
        System.out.println("Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807");

        // 7. float - Punto flotante simple (termina con f)
        float varFloat = 1244.75f;
        System.out.println("\nfloat: " + varFloat);
        System.out.println("Precisión: 6-7 dígitos decimales");

        // 8. double - Punto flotante doble
        double varDouble = 12345.1234;
        System.out.println("\ndouble: " + varDouble);
        System.out.println("Precisión: 15-16 dígitos decimales");

        // 9. String - NO es primitivo (es una clase)
        String varString = "Hola mundo";
        System.out.println("\nString: " + varString);
        System.out.println("String es una CLASE, no tipo primitivo");

        System.out.println("\n=== OPERACIONES CON LOS TIPOS ===");

        // Operaciones con números
        int suma = varEntera + varShort;
        System.out.println("Suma (int + short): " + varEntera + " + " + varShort + " = " + suma);

        double division = varDouble / varFloat;
        System.out.println("División (double / float): " + varDouble + " / " + varFloat + " = " + division);

        // Operaciones con boolean
        boolean comparacion = varEntera > varShort;
        System.out.println("Comparación: " + varEntera + " > " + varShort + " = " + comparacion);

        // Operaciones con char
        char siguienteCaracter = (char)(varCaracter + 1);
        System.out.println("Char siguiente: '" + varCaracter + "' + 1 = '" + siguienteCaracter + "'");

        // Operaciones con String
        String stringModificado = varString + " - Programando en Java!";
        System.out.println("String concatenado: " + stringModificado);

        System.out.println("\n=== DEMOSTRACIÓN COMPLETADA ===");
    }
}