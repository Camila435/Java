package com.company;

public class OperadoresBitABit {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES BIT A BIT ===");

        // OPERADOR AND (&)
        byte b1 = 6 & 8;
        System.out.println("6 & 8 = " + b1);
        System.out.println("6 en binario: 0110");
        System.out.println("8 en binario: 1000");
        System.out.println("AND bit a bit: 0000 = 0");

        System.out.println("---------------");

        // OPERADOR OR (|)
        byte b2 = 7 | 9;
        System.out.println("7 | 9 = " + b2);
        System.out.println("7 en binario: 0111");
        System.out.println("9 en binario: 1001");
        System.out.println("OR bit a bit:  1111 = 15");

        System.out.println("---------------");

        // OPERADOR XOR (^)
        byte b3 = 5 ^ 4;
        System.out.println("5 ^ 4 = " + b3);
        System.out.println("5 en binario: 0101");
        System.out.println("4 en binario: 0100");
        System.out.println("XOR bit a bit: 0001 = 1");

        System.out.println("---------------");

        // RESULTADO FINAL
        System.out.println("Resultado: " + b1 + " " + b2 + " " + b3);

        System.out.println("---------------");

        // MAS EJEMPLOS
        System.out.println("MAS EJEMPLOS:");

        System.out.println("3 & 5 = " + (3 & 5) + " (0011 & 0101 = 0001)");
        System.out.println("3 | 5 = " + (3 | 5) + " (0011 | 0101 = 0111)");
        System.out.println("3 ^ 5 = " + (3 ^ 5) + " (0011 ^ 0101 = 0110)");
    }
}
