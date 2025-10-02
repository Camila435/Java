package com.company;

public class EjemploArreglosMultidimensionales {
    public static void main(String[] args) {

        // ARREGLO BIDIMENSIONAL (MATRIZ) - 2D
        // Declarar y crear una matriz 3x3 (3 filas, 3 columnas)
        int[][] matriz = new int[3][3];

        // ASIGNAR VALORES A LA MATRIZ
        // Fila 0
        matriz[0][0] = 1;  // Fila 0, Columna 0
        matriz[0][1] = 2;  // Fila 0, Columna 1
        matriz[0][2] = 3;  // Fila 0, Columna 2

        // Fila 1
        matriz[1][0] = 4;  // Fila 1, Columna 0
        matriz[1][1] = 5;  // Fila 1, Columna 1
        matriz[1][2] = 6;  // Fila 1, Columna 2

        // Fila 2
        matriz[2][0] = 7;  // Fila 2, Columna 0
        matriz[2][1] = 8;  // Fila 2, Columna 1
        matriz[2][2] = 9;  // Fila 2, Columna 2

        System.out.println("MATRIZ 3x3:");
        // RECORRER MATRIZ CON DOS BUCLES FOR
        // Primer bucle recorre las filas
        for(int i = 0; i < matriz.length; i++) {
            // Segundo bucle recorre las columnas de cada fila
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Salto de linea despues de cada fila
        }

        // ARREGLO BIDIMENSIONAL CON INICIALIZACION DIRECTA
        String[][] nombres = {
                {"Ana", "Juan", "Maria"},    // Fila 0
                {"Pedro", "Luis", "Carmen"}, // Fila 1
                {"Sofia", "Carlos", "Elena"} // Fila 2
        };

        System.out.println("MATRIZ DE NOMBRES 3x3:");
        for(int i = 0; i < nombres.length; i++) {
            for(int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println();
        }

        // ARREGLO DE TAMAÑOS DIFERENTES (NO RECTANGULAR)
        int[][] arregloIrregular = new int[3][];  // 3 filas, columnas variables

        // Fila 0 tiene 2 columnas
        arregloIrregular[0] = new int[2];
        arregloIrregular[0][0] = 10;
        arregloIrregular[0][1] = 20;

        // Fila 1 tiene 4 columnas
        arregloIrregular[1] = new int[4];
        arregloIrregular[1][0] = 30;
        arregloIrregular[1][1] = 40;
        arregloIrregular[1][2] = 50;
        arregloIrregular[1][3] = 60;

        // Fila 2 tiene 1 columna
        arregloIrregular[2] = new int[1];
        arregloIrregular[2][0] = 70;

        System.out.println("ARREGLO IRREGULAR:");
        for(int i = 0; i < arregloIrregular.length; i++) {
            for(int j = 0; j < arregloIrregular[i].length; j++) {
                System.out.print(arregloIrregular[i][j] + " ");
            }
            System.out.println();
        }

        // ARREGLO TRIDIMENSIONAL - 3D
        int[][][] cubo = new int[2][3][2];  // 2 capas, 3 filas, 2 columnas

        // ASIGNAR VALORES AL CUBO
        // Capa 0
        cubo[0][0][0] = 1;  // Capa 0, Fila 0, Columna 0
        cubo[0][0][1] = 2;  // Capa 0, Fila 0, Columna 1
        cubo[0][1][0] = 3;  // Capa 0, Fila 1, Columna 0
        cubo[0][1][1] = 4;  // Capa 0, Fila 1, Columna 1
        cubo[0][2][0] = 5;  // Capa 0, Fila 2, Columna 0
        cubo[0][2][1] = 6;  // Capa 0, Fila 2, Columna 1

        // Capa 1
        cubo[1][0][0] = 7;  // Capa 1, Fila 0, Columna 0
        cubo[1][0][1] = 8;  // Capa 1, Fila 0, Columna 1
        cubo[1][1][0] = 9;  // Capa 1, Fila 1, Columna 0
        cubo[1][1][1] = 10; // Capa 1, Fila 1, Columna 1
        cubo[1][2][0] = 11; // Capa 1, Fila 2, Columna 0
        cubo[1][2][1] = 12; // Capa 1, Fila 2, Columna 1

        System.out.println("ARREGLO TRIDIMENSIONAL:");
        // RECORRER CUBO CON TRES BUCLES FOR
        for(int i = 0; i < cubo.length; i++) {          // Capas
            System.out.println("Capa " + i + ":");
            for(int j = 0; j < cubo[i].length; j++) {     // Filas
                for(int k = 0; k < cubo[i][j].length; k++) { // Columnas
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // PROPIEDADES DE ARREGLOS MULTIDIMENSIONALES
        System.out.println("PROPIEDADES:");
        System.out.println("Matriz filas: " + matriz.length);
        System.out.println("Matriz columnas en fila 0: " + matriz[0].length);
        System.out.println("Arreglo irregular filas: " + arregloIrregular.length);
        System.out.println("Cubo capas: " + cubo.length);
        System.out.println("Cubo filas en capa 0: " + cubo[0].length);
        System.out.println("Cubo columnas en capa 0 fila 0: " + cubo[0][0].length);
    }
}
