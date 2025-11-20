package com.company.vectores;

public class EjemploVector {
     public static void main(String[] args) {
        int numeros[] = new int[8];
        numeros[0] = 5;
        numeros[1] = 10;   
        numeros[2] = 15;
        numeros[3] = 20;
        numeros[4] = 25;
        numeros[5] = 30;
        numeros[6] = 35;
        numeros[7] = 40;

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }
       
     }
}
