package com.company.InterfazQueue;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {
    public static void main(String[] args) {
        
        // Usamos LinkedList, pero la tratamos como una Queue
        Queue<String> impresora = new LinkedList<>();

        // 1. LLEGAN LOS DOCUMENTOS (offer)
        impresora.offer("Documento_Tesis.pdf");
        impresora.offer("Foto_Vacaciones.jpg");
        impresora.offer("Memes_Gatos.png");

        System.out.println("Cola de impresión: " + impresora);
        // Salida: [Documento_Tesis.pdf, Foto_Vacaciones.jpg, Memes_Gatos.png]

        // 2. MIRAR QUIÉN SIGUE (peek)
        System.out.println("El siguiente a imprimir es: " + impresora.peek());

        // 3. IMPRIMIR (poll) - Atender y sacar de la fila
        while (!impresora.isEmpty()) {
            // poll() saca al primero y nos lo entrega
            String archivo = impresora.poll();
            System.out.println("Imprimiendo: " + archivo + "...");
            
            // Simulamos una pausa
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }

        System.out.println("¡Todos los documentos impresos!");
        
        // Si intentamos sacar de una cola vacía con poll(), no da error:
        System.out.println("¿Queda algo? " + impresora.poll()); // Imprime: null
    }
}
/*La interfaz Queue (Cola) en Java representa una estructura de datos lineal que sigue el principio FIFO (First In, First Out).
En español significa: "Primero en entrar, primero en salir"*/
