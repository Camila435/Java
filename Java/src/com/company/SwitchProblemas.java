package com.company;

public class SwitchProblemas {
    public static void main(String[] args) {

        System.out.println("PROBLEMAS COMUNES CON SWITCH");

        // PROBLEMA 1: BYTE CON VALOR FUERA DE RANGO
        System.out.println("1. BYTE CON VALOR FUERA DE RANGO:");

        byte g = 2;
        System.out.println("Valor de g: " + g);

        switch(g) {
            case 23:
                System.out.println("Case 23");
                break;
            // case 128:
            // ERROR: 128 esta fuera del rango de byte (-128 a 127)
            // El compilador detecta que 128 no puede ser un byte
            // System.out.println("Case 128");
            // break;
            case 127:
                System.out.println("Case 127 - este si funciona");
                break;
            default:
                System.out.println("Default");
                break;
        }

        // PROBLEMA 2: DUPLICADO DE CASES
        System.out.println("2. DUPLICADO DE CASES:");

        int temp = 90;
        System.out.println("Valor de temp: " + temp);

        switch(temp) {
            case 80:
                System.out.println("80");
                break;
            // case 80:
            // ERROR: No puede haber dos cases con el mismo valor
            // System.out.println("80 duplicado");
            // break;
            case 90:
                System.out.println("90");
                break;
            default:
                System.out.println("default");
                break;
        }

        // PROBLEMA 3: VALORES QUE SI FUNCIONAN CON BYTE
        System.out.println("3. VALORES VALIDOS PARA BYTE:");

        byte b = 10;
        System.out.println("Valor de b: " + b);

        switch(b) {
            case 10:
                System.out.println("Case 10 - funciona");
                break;
            case -50:
                System.out.println("Case -50 - funciona");
                break;
            case 127:
                System.out.println("Case 127 - maximo valor byte");
                break;
            case -128:
                System.out.println("Case -128 - minimo valor byte");
                break;
            default:
                System.out.println("Default");
                break;
        }

        // PROBLEMA 4: USO CORRECTO DE SWITCH
        System.out.println("4. SWITCH CORRECTO:");

        int numero = 2;
        System.out.println("Valor de numero: " + numero);

        switch(numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Otro numero");
                break;
        }

        // EXPLICACION DE LOS ERRORES
        System.out.println("5. EXPLICACION DE ERRORES:");

        System.out.println("Rango de byte: -128 a 127");
        System.out.println("128 esta fuera de rango - causa error de compilacion");
        System.out.println("Cases duplicados no permitidos - cada case debe ser unico");
        System.out.println("El compilador verifica los valores en tiempo de compilacion");
    }
}
