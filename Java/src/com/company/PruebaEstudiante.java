package com.company;

// Archivo separado para probar la clase Estudiante
// Así no modificas tu Main.java principal
public class PruebaEstudiante {
    public static void main(String[] args) {

        // Crear objeto Estudiante usando el constructor sin argumentos
        // El constructor asigna valores por defecto
        Estudiante estudiante = new Estudiante();

        // Usar getters para leer los valores por defecto
        System.out.println("Valores por defecto:");
        System.out.println("Nombre: " + estudiante.getNombre());     // Muestra "Sin nombre"
        System.out.println("Edad: " + estudiante.getEdad());         // Muestra 18
        System.out.println("Promedio: " + estudiante.getPromedio()); // Muestra 0.0
        System.out.println("Activo: " + estudiante.isActivo());      // Muestra true

        // Usar setters para cambiar los valores
        estudiante.setNombre("Carlos");      // Cambia el nombre a "Carlos"
        estudiante.setEdad(20);              // Cambia la edad a 20
        estudiante.setPromedio(8.5);         // Cambia el promedio a 8.5
        estudiante.setActivo(true);          // Mantiene activo = true

        // Ver los cambios con los getters
        System.out.println("\nDespues de cambios:");
        System.out.println("Nombre: " + estudiante.getNombre());     // Muestra "Carlos"
        System.out.println("Edad: " + estudiante.getEdad());         // Muestra 20
        System.out.println("Promedio: " + estudiante.getPromedio()); // Muestra 8.5
        System.out.println("Activo: " + estudiante.isActivo());      // Muestra true

        // Probar validaciones
        System.out.println("\nProbando validaciones:");
        estudiante.setEdad(-5);              // No cambia (edad negativa)
        estudiante.setPromedio(15.0);        // No cambia (promedio fuera de rango)

        System.out.println("Edad despues de intento invalido: " + estudiante.getEdad()); // Sigue 20
        System.out.println("Promedio despues de intento invalido: " + estudiante.getPromedio()); // Sigue 8.5
    }
}
