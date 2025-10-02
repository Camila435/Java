package com.company;

public class SentenciaSwitch {
    public static void main(String[] args) {

        System.out.println("SENTENCIA SWITCH - EJEMPLOS");

        // EJEMPLO 1: SWITCH BASICO CON NUMEROS
        System.out.println("1. SWITCH BASICO:");

        // Declaramos una variable para evaluar en el switch
        int x = 3;
        System.out.println("Valor de x: " + x);

        // La sentencia switch evalua el valor de una variable
        switch (x) {
            // case 1: si x es igual a 1, ejecuta este bloque
            case 1:
                System.out.println("x es igual a 1");
                // break termina el switch y sale de el
                break;

            // case 2: si x es igual a 2, ejecuta este bloque
            case 2:
                System.out.println("x es igual a 2");
                break;

            // case 3: si x es igual a 3, ejecuta este bloque
            case 3:
                System.out.println("x es igual a 3");
                break;

            // default: se ejecuta si ningun case coincide
            default:
                System.out.println("No se que valor es x");
                // El break en default es opcional pero buena practica
                break;
        }

        // EJEMPLO 2: SWITCH CON CHAR
        System.out.println("2. SWITCH CON CHAR:");

        // Switch tambien funciona con tipo char
        char letra = 'B';
        System.out.println("Letra: " + letra);

        switch (letra) {
            case 'A':
                System.out.println("Es la letra A");
                break;
            case 'B':
                System.out.println("Es la letra B");
                break;
            case 'C':
                System.out.println("Es la letra C");
                break;
            default:
                System.out.println("Es otra letra");
                break;
        }

        // EJEMPLO 3: SWITCH SIN BREAK (CAIDA)
        System.out.println("3. SWITCH SIN BREAK:");

        int dia = 2;
        System.out.println("Dia: " + dia);

        // Sin break, la ejecucion "cae" al siguiente case
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                // Sin break, continua con case 2
            case 2:
                System.out.println("Martes");
                // Sin break, continua con case 3
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Otro dia");
                break;
        }

        // EJEMPLO 4: SWITCH CON MULTIPLES CASES
        System.out.println("4. SWITCH CON MULTIPLES CASES:");

        int mes = 2;
        System.out.println("Mes: " + mes);

        // Varios cases pueden ejecutar el mismo codigo
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Es invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Es primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Es verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Es otono");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }

        // EJEMPLO 5: SWITCH CON BYTE
        System.out.println("5. SWITCH CON BYTE:");

        // Usamos byte en lugar de String
        byte opcion = 1;
        System.out.println("Opcion: " + opcion);

        switch (opcion) {
            case 1:
                System.out.println("Opcion rojo seleccionada");
                break;
            case 2:
                System.out.println("Opcion azul seleccionada");
                break;
            case 3:
                System.out.println("Opcion verde seleccionada");
                break;
            default:
                System.out.println("Opcion desconocida");
                break;
        }

        // EJEMPLO 6: SWITCH CON ENTEROS PARA SIMULAR STRINGS
        System.out.println("6. SWITCH CON CODIGOS NUMERICOS:");

        // Usamos numeros para representar colores
        int codigoColor = 1;  // 1=rojo, 2=azul, 3=verde
        System.out.println("Codigo color: " + codigoColor);

        switch (codigoColor) {
            case 1:
                System.out.println("Color rojo seleccionado");
                break;
            case 2:
                System.out.println("Color azul seleccionado");
                break;
            case 3:
                System.out.println("Color verde seleccionado");
                break;
            default:
                System.out.println("Color desconocido");
                break;
        }

        // EJEMPLO 7: COMPARACION CON IF-ELSE
        System.out.println("7. COMPARACION CON IF-ELSE:");

        int numero = 2;
        System.out.println("Numero: " + numero);

        // Esto es equivalente al primer ejemplo con if-else
        if (numero == 1) {
            System.out.println("x es igual a 1");
        } else if (numero == 2) {
            System.out.println("x es igual a 2");
        } else if (numero == 3) {
            System.out.println("x es igual a 3");
        } else {
            System.out.println("No se que valor es x");
        }
    }
}