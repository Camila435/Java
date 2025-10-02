package com.company;

class Persona {
    String nombre;
    int edad;

    public Persona() {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public void setSoltero(boolean b) {
    }

    public boolean getNombre() {
        return false;
    }

    public void getApellido() {
    }
}

public class EjemploHeap {
    public static void main(String[] args) {
        System.out.println("=== Probando memoria Heap ===");

        // Crear objetos en el HEAP
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Crear array en el HEAP
        int[] numeros = {1, 2, 3, 4, 5};

        // Mostrar la información
        persona1.mostrarInfo();
        persona2.mostrarInfo();

        System.out.print("Array de números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
            System.out.println("Haciendo persona1 = null...");
            persona1 = null;  // El objeto "María" queda sin referencia
                // En algún momento el Garbage Collector lo eliminará del HEAP
        }
        System.out.println();

        // Demostrar que son objetos diferentes en el HEAP
        System.out.println("¿Son la misma persona? " + (persona1 == persona2));

        System.out.println("=== Programa ejecutado correctamente ===");
    }
}
