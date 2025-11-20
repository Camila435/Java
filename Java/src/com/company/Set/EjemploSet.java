package com.company.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void main(String[] args) {

        // --- EJEMPLO 1: HashSet (Sin orden, sin duplicados) ---
        System.out.println("--- PRUEBA CON HASHSET ---");
        Set<String> invitados = new HashSet<>();

        invitados.add("Carlos");
        invitados.add("Ana");
        invitados.add("Beatriz");
        
        // INTENTO DE DUPLICADO
        boolean agregado = invitados.add("Carlos"); // Intentamos meter a Carlos otra vez
        
        System.out.println("¿Se agregó a Carlos otra vez? " + agregado); // Dirá: false
        System.out.println("Lista HashSet (Desordenada): " + invitados);


        // --- EJEMPLO 2: TreeSet (Ordenado, sin duplicados) ---
        System.out.println("\n--- PRUEBA CON TREESET ---");
        // Fíjate que cambiamos HashSet por TreeSet
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(10); // Duplicado ignorado

        // Al imprimir, verás que se ordenaron solos: 10, 50, 100
        System.out.println("Lista TreeSet (Ordenada): " + numeros);
        
        // --- CÓMO RECORRER UN SET ---
        // Como no existe .get(0), usamos for-each
        System.out.println("\nRecorriendo los números:");
        //PARA cada numero n QUE ESTÉ EN la colección numeros
        for (Integer n : numeros) {
            System.out.println("Número: " + n);
        }
    }
}

/*HashSet (El más rápido):
Es como una bolsa revuelta.
Orden: Caótico. No te asegura ningún orden específico.
Uso: Cuando solo te importa que los datos sean únicos y quieres máxima velocidad.
TreeSet (El ordenado):
Ordena los elementos automáticamente (Alfabéticamente o de menor a mayor).
Uso: Cuando necesitas la lista ordenada (ej. lista de nombres A-Z). Es un poco más lento.
LinkedHashSet (El de memoria):
Recuerda el orden en que insertaste los datos (como una fila).
Uso: Cuando el orden de llegada es importante.*/
/*Un Set (Conjunto) en Java es una colección diseñada para una regla de oro: No admite duplicados.
Si intentas agregar un elemento que ya existe dentro del Set, Java simplemente lo ignora y no lo agrega.
 Tampoco tiene índices numéricos (no puedes hacer .get(0)), porque en la mayoría de los casos, los elementos no tienen un orden fijo.*/