package com.company.List;

import java.util.ArrayList;
import java.util.List;

public class DemoMetodoList {
    public static void main(String[] args) {
        
        // Usamos Integer (Wrapper) como aprendimos antes
        List<Integer> numeros = new ArrayList<>();

        // 1. AGREGAR (.add)
        numeros.add(100);
        numeros.add(200);
        numeros.add(300);
        // Podemos insertar en una posición específica (índice 1)
        numeros.add(1, 150); 

        // 2. LEER (.get)
        System.out.println("El primer número es: " + numeros.get(0));

        // 3. SABER EL TAMAÑO (.size)
        System.out.println("Hay " + numeros.size() + " números en la lista.");

        // 4. ELIMINAR (.remove)
        numeros.remove(0); // Borra el que está en la posición 0 (el 100)

        // 5. VERIFICAR SI EXISTE (.contains)
        if (numeros.contains(300)) {
            System.out.println("¡El 300 está en la lista!");
        }
        
        // 6. RECORRER (Iterar)
        System.out.println("Lista final:");
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}