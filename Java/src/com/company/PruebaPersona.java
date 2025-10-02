package com.company;

// Archivo separado para probar la clase Persona
// Así no modificas tu Main.java principal
public class PruebaPersona {
    public static void main(String[] args) {

        // Crear objeto Persona usando el constructor sin argumentos
        // El constructor asigna valores por defecto: nombre="Jhon", apellido="Q"
        Persona persona = new Persona();

        // Usar getters para leer los valores por defecto
        System.out.println("Valores por defecto:");
        System.out.println(new StringBuilder().append("Nombre: ").append(persona.getNombre()).toString());    // Muestra "Jhon"
        System.out.println("Apellido: " + persona.getApellido()); // Muestra "Q"

        // Usar setters para cambiar los valores
        persona.setNombre("Maria");      // Cambia el nombre a "Maria"
        persona.setApellido("Gomez");    // Cambia el apellido a "Gomez"
        persona.setSoltero(true);        // Establece soltero = true

        // Ver los cambios con los getters
        System.out.println("\nDespues de cambios:");
        System.out.println("Nombre: " + persona.getNombre());     // Muestra "Maria"
        System.out.println("Apellido: " + persona.getApellido()); // Muestra "Gomez"
        System.out.println("Es soltero: " + persona.isSoltero()); // Muestra "true"
    }
}
