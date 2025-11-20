package com.company;

public class LiteralesNumericos {
    public static void main(String[] args) {
        System.out.println("=== LITERALES NUMÉRICOS EN JAVA ===\n");

        // ============================================
        // LITERALES ENTEROS - Por defecto son INT
        // ============================================

        System.out.println("--- LITERALES ENTEROS ---");

        // Por defecto, los números enteros son de tipo INT
        int numeroInt = 32;           // 32 es un literal int
        System.out.println("int numeroInt = 32; → " + numeroInt);
        System.out.println("El 32 se interpreta como int automáticamente");

        // Si queremos un LONG, debemos agregar 'L' o 'l' al final
        long numeroLong = 32L;         // 32L es un literal long
        System.out.println("long numeroLong = 32L; → " + numeroLong);
        System.out.println("La 'L' indica que es long (64 bits)");

        // ERROR COMÚN: número demasiado grande para int
        // long error = 3000000000;    // Esto daría error!
        long correcto = 3000000000L;   // Esto es correcto
        System.out.println("long correcto = 3000000000L; → " + correcto);

        // ============================================
        // LITERALES DE PUNTO FLOTANTE - Por defecto son DOUBLE
        // ============================================

        System.out.println("\n--- LITERALES DE PUNTO FLOTANTE ---");

        // Por defecto, los números con punto decimal son DOUBLE
        double numeroDouble = 32.064;  // 32.064 es un literal double
        System.out.println("double numeroDouble = 32.064; → " + numeroDouble);
        System.out.println("Se interpreta como double automáticamente (64 bits)");

        // Si queremos un FLOAT, debemos agregar 'F' o 'f' al final
        float numeroFloat = 32.064F;   // 32.064F es un literal float
        System.out.println("float numeroFloat = 32.064F; → " + numeroFloat);
        System.out.println("La 'F' indica que es float (32 bits)");

        // También podemos ser explícitos con double usando 'D' o 'd'
        double numeroDoubleExplicito = 32.064D;  // Con D (opcional)
        System.out.println("double numeroDoubleExplicito = 32.064D; → " + numeroDoubleExplicito);

        // ============================================
        // DEMOSTRACIÓN DE ERRORES COMUNES
        // ============================================

        System.out.println("\n--- ERRORES COMUNES ---");

        // ERROR: No se puede asignar double a float sin 'F'
        // float errorFloat = 32.064;  // ¡ERROR de compilación!

        // SOLUCIÓN: Agregar 'F'
        float solucionFloat = 32.064F;  // Correcto

        // ERROR: Número demasiado grande para int
        // long errorLong = 2147483648;  // ¡ERROR! (máximo int es 2147483647)

        // SOLUCIÓN: Agregar 'L'
        long solucionLong = 2147483648L;  // Correcto

        System.out.println("float solucionFloat = 32.064F; → " + solucionFloat);
        System.out.println("long solucionLong = 2147483648L; → " + solucionLong);

        // ============================================
        // RESUMEN DE SUFIJOS
        // ============================================

        System.out.println("\n--- RESUMEN DE SUFIJOS ---");

        int conInt = 100;              // Sin sufijo → int
        long conLong = 100L;           // L → long
        float conFloat = 100.5F;       // F → float
        double conDouble = 100.5;      // Sin sufijo → double
        double conDoubleExplicito = 100.5D; // D → double (opcional)

        System.out.println("int conInt = 100; → " + conInt);
        System.out.println("long conLong = 100L; → " + conLong);
        System.out.println("float conFloat = 100.5F; → " + conFloat);
        System.out.println("double conDouble = 100.5; → " + conDouble);
        System.out.println("double conDoubleExplicito = 100.5D; → " + conDoubleExplicito);

        // ============================================
        // EJEMPLOS PRÁCTICOS
        // ============================================

        System.out.println("\n--- EJEMPLOS PRÁCTICOS ---");

        // Cálculos con diferentes tipos
        double resultado1 = 10.5 + 20;     // double + int = double
        float resultado2 = 15.3F + 5.7F;   // float + float = float
        long resultado3 = 1000L * 50L;     // long * long = long

        System.out.println("double + int: 10.5 + 20 = " + resultado1);
        System.out.println("float + float: 15.3F + 5.7F = " + resultado2);
        System.out.println("long * long: 1000L * 50L = " + resultado3);

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
