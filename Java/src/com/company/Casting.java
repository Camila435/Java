package com.company;

public class Casting {
    public static void main(String[] args) {

        System.out.println("=== EJEMPLOS DE CASTING ===");

        // ============================================
        // EJEMPLO 1: SUMA DE BYTES - ERROR COMUN
        // ============================================
        System.out.println("\n--- Suma de bytes ---");

        byte b = 3;
        byte c = 8;
        // byte d = b + c;  // ERROR de compilación

        // EXPLICACIÓN: Java convierte bytes a int para operaciones aritméticas
        // Por eso b + c devuelve un int, no un byte

        // SOLUCIÓN 1: Casting explícito
        byte d = (byte) (b + c);
        System.out.println("byte d = (byte) (b + c); → " + d);

        // SOLUCIÓN 2: Usar int (recomendado)
        int resultado = b + c;
        System.out.println("int resultado = b + c; → " + resultado);

        // ============================================
        // EJEMPLO 2: CASTING DE LONG A BYTE
        // ============================================
        System.out.println("\n--- Casting de long a byte ---");

        long l = 56L;  // CORRECCIÓN: 56L (no 5GL)
        byte b2 = (byte) l;  // CORRECCIÓN: (byte) l (no solo (byte))
        System.out.println("long l = 56L;");
        System.out.println("byte b2 = (byte) l; -> " + b2);

        // ============================================
        // EJEMPLO 3: CASTING CON PÉRDIDA DE DATOS
        // ============================================
        System.out.println("\n--- Casting con pérdida de datos ---");

        long numeroGrande = 300L;  // 300 cabe en byte? SÍ (rango byte: -128 a 127)
        byte b3 = (byte) numeroGrande;
        System.out.println("long numeroGrande = 300L;");
        System.out.println("byte b3 = (byte) numeroGrande; -> " + b3);
        System.out.println("¡Perdida de datos! 300 no cabe en byte");

        // ============================================
        // EJEMPLO 4: POR QUÉ OCURRE EL ERROR
        // ============================================
        System.out.println("\n--- ¿Por que byte + byte da error? ---");

        byte x = 10;
        byte y = 20;

        System.out.println("byte x = 10;");
        System.out.println("byte y = 20;");
        System.out.println("x + y = " + (x + y) + " (es de tipo int)");
        System.out.println("Java siempre promueve byte, short, char a int en operaciones");
    }
}
