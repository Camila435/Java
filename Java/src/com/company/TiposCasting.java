package com.company;

public class TiposCasting {
    public static void main(String[] args) {
        System.out.println("=== CASTING IMPLICITO vs EXPLICITO ===\n");

        // ============================================
        // 1. CASTING IMPLÍCITO (Automático)
        // ============================================
        System.out.println("--- CASTING IMPLICITO ---");
        System.out.println("Java lo hace AUTOMATICAMENTE - De chico a grande");

        int numeroInt = 100;
        long numeroLong = numeroInt;  // Implícito: int → long
        System.out.println("int -> long: " + numeroInt + " -> " + numeroLong);

        float numeroFloat = 50.5f;
        double numeroDouble = numeroFloat;  // Implícito: float → double
        System.out.println("float -> double: " + numeroFloat + " -> " + numeroDouble);

        System.out.println(" SEGURO - No hay perdida de datos\n");

        // ============================================
        // 2. CASTING EXPLÍCITO (Manual)
        // ============================================
        System.out.println("--- CASTING EXPLICITO ---");
        System.out.println("Forzado MANUALMENTE - De grande a chico");

        double valorDouble = 99.99;
        int valorInt = (int) valorDouble;  // Explícito: double → int
        System.out.println("double -> int: " + valorDouble + " -> " + valorInt);

        long valorLong = 3000000000L;
        int otroInt = (int) valorLong;  // Explícito: long → int
        System.out.println("long -> int: " + valorLong + " -> " + otroInt);

        System.out.println("  PELIGROSO - Puede haber perdida de datos");
    }
}
