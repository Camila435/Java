package com.company;

public class OperadoresLogicos {
    public static void main(String[] args) {

        System.out.println("=== DIFERENCIA ENTRE &&/|| Y &/| ===");

        // ============================================
        // DIFERENCIA FUNDAMENTAL: EVALUACION CORTOCIRCUITO
        // ============================================

        System.out.println("1. OPERADORES && y || (CORTOCIRCUITO):");
        System.out.println("   Evaluan solo lo necesario");

        // Ejemplo con && (AND cortocircuito)
        System.out.println("\n--- Ejemplo con && ---");
        int x = 10;
        int y = 5;

        // Con &&: si la primera condicion es false, NO evalúa la segunda
        boolean resultado1 = (x < 5) && (y++ > 0);
        System.out.println("(x < 5) && (y++ > 0) = " + resultado1);
        System.out.println("Valor de y después: " + y); // y sigue siendo 5 porque NO se ejecutó y++

        // ============================================

        System.out.println("\n--- Ejemplo con & ---");
        int a = 10;
        int b = 5;

        // Con &: SIEMPRE evalúa AMBAS condiciones
        boolean resultado2 = (a < 5) & (b++ > 0);
        System.out.println("(a < 5) & (b++ > 0) = " + resultado2);
        System.out.println("Valor de b después: " + b); // b es 6 porque SI se ejecutó b++

        // ============================================
        // OPERADOR XOR (^) - OR EXCLUSIVO
        // ============================================

        System.out.println("\n2. OPERADOR XOR (^):");
        System.out.println("   True solo si los operandos son DIFERENTES");

        System.out.println("\n--- Tabla de verdad XOR ---");
        System.out.println("true ^ true = " + (true ^ true));   // false
        System.out.println("true ^ false = " + (true ^ false)); // true
        System.out.println("false ^ true = " + (false ^ true)); // true
        System.out.println("false ^ false = " + (false ^ false)); // false

        // ============================================
        // EJEMPLO DEL XOR CON NEGACION (!)
        // ============================================

        System.out.println("\n3. EJEMPLO COMPLEJO CON XOR Y NEGACION:");

        // Ejemplo original: !((2<3) ^ (4>3))
        boolean expresion1 = (2 < 3);  // true
        boolean expresion2 = (4 > 3);  // true

        System.out.println("(2 < 3) = " + expresion1);
        System.out.println("(4 > 3) = " + expresion2);

        // Primero: XOR entre ambas expresiones
        boolean xorResult = expresion1 ^ expresion2;  // true ^ true = false
        System.out.println("(2<3) ^ (4>3) = " + xorResult);

        // Luego: Negación del resultado XOR
        boolean resultadoFinal = !xorResult;  // !false = true
        System.out.println("!((2<3) ^ (4>3)) = " + resultadoFinal);

        // ============================================
        // MAS EJEMPLOS PRACTICOS
        // ============================================

        System.out.println("4. MAS EJEMPLOS PRACTICOS:");

        // Ejemplo práctico de cortocircuito
        System.out.println("-- Ejemplo práctico cortocircuito ---");
        String texto = null;

        // Con &&: seguro - si texto es null, NO intenta llamar a length()
        if (texto != null && texto.length() > 0) {
            System.out.println("Texto no es nulo y tiene contenido");
        } else {
            System.out.println("Texto es nulo o vacío (usando &&)");
        }

        // Con &: peligroso - SIEMPRE evalúa ambas, causaría NullPointerException
        // if (texto != null & texto.length() > 0) {  // ¡ERROR!
        //     System.out.println("Esto causaría NullPointerException");
        // }

        // ============================================
        // RESUMEN
        // ============================================

        System.out.println("=== RESUMEN ===");
        System.out.println("&& y ||: Evaluacion cortocircuito (RECOMENDADOS)");
        System.out.println("& y |: Evaluan siempre ambas expresiones");
        System.out.println("^: XOR - true solo si los operandos son diferentes");
        System.out.println("!: NOT - invierte el valor booleano");
    }
}
