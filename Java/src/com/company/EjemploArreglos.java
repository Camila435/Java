package com.company;

public class EjemploArreglos {
    public static void main(String[] args) {

        // DECLARACION E INICIALIZACION DE ARREGLOS
        // Forma 1: Declarar y luego crear el arreglo
        int[] numeros;                    // Declarar variable de arreglo
        numeros = new int[5];             // Crear arreglo de 5 elementos

        // ASIGNAR VALORES A CADA POSICION
        numeros[0] = 10;  // Indice 0 - primera posicion
        numeros[1] = 20;  // Indice 1 - segunda posicion
        numeros[2] = 30;  // Indice 2 - tercera posicion
        numeros[3] = 40;  // Indice 3 - cuarta posicion
        numeros[4] = 50;  // Indice 4 - quinta posicion

        System.out.println("ARREGLO CON ASIGNACION MANUAL:");
        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("numeros[3] = " + numeros[3]);
        System.out.println("numeros[4] = " + numeros[4]);

        // Forma 2: Declarar e inicializar en una linea
        String[] nombres = {"Ana", "Juan", "Maria", "Pedro"};  // Arreglo con valores iniciales

        System.out.println("ARREGLO CON INICIALIZACION DIRECTA:");
        System.out.println("nombres[0] = " + nombres[0]);
        System.out.println("nombres[1] = " + nombres[1]);
        System.out.println("nombres[2] = " + nombres[2]);
        System.out.println("nombres[3] = " + nombres[3]);

        // RECORRER ARREGLO CON FOR TRADICIONAL
        double[] precios = {15.5, 20.0, 8.75, 33.25, 12.0};

        System.out.println("RECORRIDO CON FOR TRADICIONAL:");
        // i es el indice que va desde 0 hasta precios.length-1
        for(int i = 0; i < precios.length; i++) {
            // precios[i] accede al elemento en la posicion i
            System.out.println("precios[" + i + "] = " + precios[i]);
        }

        // RECORRER ARREGLO CON FOR-EACH
        char[] letras = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("RECORRIDO CON FOR-EACH:");
        // for-each: para cada elemento en el arreglo
        for(char letra : letras) {
            // letra toma el valor de cada elemento automaticamente
            System.out.println("Letra: " + letra);
        }

        // PROPIEDAD LENGTH DE LOS ARREGLOS
        System.out.println("PROPIEDAD LENGTH:");
        System.out.println("Tamaño de numeros: " + numeros.length);  // 5 elementos
        System.out.println("Tamaño de nombres: " + nombres.length);  // 4 elementos
        System.out.println("Tamaño de precios: " + precios.length);  // 5 elementos
        System.out.println("Tamaño de letras: " + letras.length);    // 5 elementos

        // MODIFICAR UN VALOR EXISTENTE EN EL ARREGLO
        System.out.println("MODIFICACION DE VALOR:");
        System.out.println("Antes: numeros[2] = " + numeros[2]);
        numeros[2] = 100;  // Cambiar el valor en la posicion 2
        System.out.println("Despues: numeros[2] = " + numeros[2]);
    }
}

    /*PUNTOS IMPORTANTES SOBRE ARREGLOS:
        Se declaran con: tipo[] nombre
        Se crean con: new tipo[tamaño] o {valores}
        Los indices empiezan en 0 y terminan en length - 1
        length es una propiedad, no un metodo
        Una vez creado, el tamaño no puede cambiar
        Todos los elementos son del mismo tipo
        Se puede acceder y modificar por indice*/
