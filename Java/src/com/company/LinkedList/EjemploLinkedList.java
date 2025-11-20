package com.company.LinkedList;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        
        // Creamos la LinkedList
        LinkedList<String> historial = new LinkedList<>();

        // 1. AGREGAR (Normal)
        historial.add("Pagina de Inicio");
        historial.add("Perfil de Usuario");
        
        // 2. AGREGAR AL PRINCIPIO (Muy rápido en LinkedList)
        // Imagina que el usuario vuelve atrás rápidamente
        historial.addFirst("Login"); 

        // 3. AGREGAR AL FINAL (Muy rápido también)
        historial.addLast("Configuración");

        System.out.println("Historial completo: " + historial);
        // Salida: [Login, Pagina de Inicio, Perfil de Usuario, Configuración]

        // 4. MANIPULAR EXTREMOS (Ideal para Colas o Pilas)
        // Eliminamos el último (como si cerraras la última pestaña)
        String eliminado = historial.removeLast(); 
        
        System.out.println("Se cerró: " + eliminado);
        System.out.println("Quedan: " + historial);
        
        // 5. OBTENER UN ELEMENTO (Más lento que ArrayList)
        // Java tiene que recorrer desde el inicio hasta llegar al índice 1
        String segundo = historial.get(1); 
        System.out.println("El segundo elemento es: " + segundo);
    }
}



/*Una LinkedList (Lista Enlazada) es un tipo de lista donde los datos no están guardados uno al lado del otro en la memoria (como en un Array), sino que están dispersos.

Para mantenerse unidos, cada elemento (llamado Nodo) tiene dos cosas:

El Dato (el valor real).

Un Puntero (una flecha) que dice dónde está el siguiente elemento. */