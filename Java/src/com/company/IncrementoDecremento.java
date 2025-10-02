package com.company;

public class IncrementoDecremento {
    public static void main(String[] args) {
        System.out.println("=== POST-INCREMENTO vs PRE-INCREMENTO ===");

        int contador = 5;

        System.out.println("Valor inicial: " + contador);

        System.out.println("POST-INCREMENTO (contador++)");
        System.out.println("PRIMERO usa el valor, LUEGO incrementa");

        System.out.println("System.out.println(contador++);");
        System.out.println("Resultado: " + contador++);
        System.out.println("Despues de contador++, contador = " + contador);

        System.out.println("PRE-INCREMENTO (++contador)");
        System.out.println("PRIMERO incrementa, LUEGO usa el valor");

        System.out.println("System.out.println(++contador);");
        System.out.println("Resultado: " + ++contador);
        System.out.println("Despues de ++contador, contador = " + contador);

        System.out.println("DECREMENTO");

        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        System.out.println("Post-decremento (numero--): " + numero--);
        System.out.println("Ahora numero = " + numero);

        System.out.println("Pre-decremento (--numero): " + --numero);
        System.out.println("Ahora numero = " + numero);

        System.out.println("RESUMEN");

        int x = 5;
        int y = 5;

        System.out.println("POST-incremento:");
        System.out.println("int a = x++; -> a = " + (x++) + ", x = " + x);

        System.out.println("PRE-incremento:");
        System.out.println("int b = ++y; -> b = " + (++y) + ", y = " + y);

        System.out.println("Regla memonica:");
        System.out.println("contador++ -> el ++ esta DESPUES, opera DESPUES");
        System.out.println("++contador -> el ++ esta ANTES, opera ANTES");
    }
}
