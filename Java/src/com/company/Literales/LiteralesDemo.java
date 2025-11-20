package com.company;

public class LiteralesDemo {
    public static void main(String[] args) {

        // LITERALES ENTEROS EN DIFERENTES BASES:

        // Decimal (base 10) - la que usamos normalmente
        int cinco = 5;           // literal decimal

        // Octal (base 8) - empiezan con 0
        int seis = 006;          // 6 en octal = 6 en decimal
        int nueve = 011;         // 11 en octal = 9 en decimal
        // Cálculo: (1 * 8^1) + (1 * 8^0) = 8 + 1 = 9

        // Hexadecimal (base 16) - empiezan con 0x o 0X
        int x = 0X0001;          // 1 en hexadecimal = 1 en decimal
        int y = 0x7fffffff;      // Número hexadecimal grande
        long z = 0xDecadCafel;     // Hexadecimal (no distingue may/min)

        // MOSTRAR LOS RESULTADOS:
        System.out.println("Decimal 5: " + cinco);
        System.out.println("Octal 006: " + seis);
        System.out.println("Octal 011: " + nueve);
        System.out.println("Hexadecimal 0X0001: " + x);
        System.out.println("Hexadecimal 0x7fffffff: " + y);
        System.out.println("Hexadecimal 0xDecadCafe: " + z);

        // OTROS TIPOS DE LITERALES:
        System.out.println("\n--- Otros literales ---");

        // Literales de caracteres (comillas simples)
        char letra = 'p';
        char numeroChar = '1';
        System.out.println("Char literal: " + letra);
        System.out.println("Char numérico: " + numeroChar);

        // Literales booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("Boolean true: " + verdadero);
        System.out.println("Boolean false: " + falso);

        // Literales de punto flotante
        double salario = 2546789.343;
        float porcentaje = 25.5f;  // 'f' obligatoria para float
        System.out.println("Double literal: " + salario);
        System.out.println("Float literal: " + porcentaje);

        // Literal de String (comillas dobles)
        System.out.println("Esto es un literal de String");
    }
}
