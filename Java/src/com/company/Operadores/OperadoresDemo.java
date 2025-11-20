package com.company;

public class OperadoresDemo {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES ARITMETICOS EN JAVA ===\n");

        // ============================================
        // OPERADORES BÁSICOS
        // ============================================
        System.out.println("--- OPERADORES BASICOS ---");

        int a = 15;
        int b = 4;

        // SUMA
        int suma = a + b;
        System.out.println(a + " + " + b + " = " + suma);

        // RESTA
        int resta = a - b;
        System.out.println(a + " - " + b + " = " + resta);

        // MULTIPLICACIÓN
        int multiplicacion = a * b;
        System.out.println(a + " * " + b + " = " + multiplicacion);

        // DIVISIÓN (entera)
        int division = a / b;
        System.out.println(a + " / " + b + " = " + division + " (division entera)");

        // MÓDULO (resto de la división)
        int modulo = a % b;
        System.out.println(a + " % " + b + " = " + modulo + " (resto de " + a + "/" + b + ")");

        // ============================================
        // MÁS EJEMPLOS DE MÓDULO %
        // ============================================
        System.out.println("\n--- MAS EJEMPLOS DE MODULO % ---");

        System.out.println("5 % 2 = " + (5 % 2) + " <- 5 dividido 2 da resto 1");
        System.out.println("10 % 3 = " + (10 % 3) + " <- 10 dividido 3 da resto 1");
        System.out.println("8 % 4 = " + (8 % 4) + " <- 8 dividido 4 da resto 0 (division exacta)");
        System.out.println("7 % 10 = " + (7 % 10) + " <- cuando el divisor es mayor, el resto es el mismo numero");

        // Uso práctico: verificar si un número es par
        int numero = 9;
        System.out.println("¿El numero " + numero + " es par? " + (numero % 2 == 0));

        // ============================================
        // OPERADORES COMPUESTOS
        // ============================================
        System.out.println("\n--- OPERADORES COMPUESTOS ---");

        // -= (operador compuesto de resta)
        int x = 10;
        System.out.println("int x = " + x + ";");
        x -= 2;  // Equivale a: x = x - 2
        System.out.println("x -= 2; -> x = " + x);

        // += (operador compuesto de suma)
        int y = 5;
        System.out.println("\nint y = " + y + ";");
        y += 3;  // Equivale a: y = y + 3
        System.out.println("y += 3; -> y = " + y);

        // *= (operador compuesto de multiplicación)
        int z = 4;
        System.out.println("\nint z = " + z + ";");
        z *= 5;  // Equivale a: z = z * 5
        System.out.println("z *= 5; -> z = " + z);

        // /= (operador compuesto de división)
        int w = 20;
        System.out.println("\nint w = " + w + ";");
        w /= 4;  // Equivale a: w = w / 4
        System.out.println("w /= 4; -> w = " + w);

        // %= (operador compuesto de módulo)
        int v = 17;
        System.out.println("\nint v = " + v + ";");
        v %= 5;  // Equivale a: v = v % 5
        System.out.println("v %= 5; -> v = " + v);

        // ============================================
        // EJEMPLOS PRÁCTICOS CON OPERADORES COMPUESTOS
        // ============================================
        System.out.println("\n--- EJEMPLOS PRACTICOS ---");

        // Contador que se incrementa
        int contador = 0;
        System.out.println("Contador inicial: " + contador);
        contador += 1;  // Aumentar en 1
        System.out.println("contador += 1; -> " + contador);
        contador += 5;  // Aumentar en 5
        System.out.println("contador += 5; -> " + contador);

        // Acumulador de precios
        double totalCompra = 0.0;
        System.out.println("\nTotal compra inicial: $" + totalCompra);
        totalCompra += 15.50;  // Agregar un producto
        System.out.println("totalCompra += 15.50; -> $" + totalCompra);
        totalCompra += 8.75;   // Agregar otro producto
        System.out.println("totalCompra += 8.75; -> $" + totalCompra);

        // Descuento aplicado
        double precio = 100.0;
        System.out.println("\nPrecio original: $" + precio);
        precio *= 0.85;  // Aplicar 15% de descuento (multiplicar por 0.85)
        System.out.println("precio *= 0.85; (15% descuento) -> $" + precio);

        // ============================================
        // COMPARACIÓN: FORMA LARGA vs FORMA CORTA
        // ============================================
        System.out.println("\n--- COMPARACION: FORMA LARGA vs CORTA ---");

        int numero1 = 10;

        // Forma LARGA (tradicional)
        numero1 = numero1 + 5;
        System.out.println("Forma larga: numero1 = numero1 + 5; -> " + numero1);

        // Forma CORTA (con operador compuesto)
        numero1 += 5;  // Mucho más compacto!
        System.out.println("Forma corta: numero1 += 5; -> " + numero1);

        System.out.println("\n=== LOS OPERADORES COMPUESTOS AHORRAN CODIGO ===");
    }
}
