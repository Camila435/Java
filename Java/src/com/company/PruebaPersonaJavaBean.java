package com.company;

// Archivo separado para probar la clase PersonaJavaBean
// Usa nombre diferente para evitar conflictos
public class PruebaPersonaJavaBean {
    public static void main(String[] args) {

        // Crear objeto PersonaJavaBean usando el constructor sin argumentos
        PersonaJavaBean persona = new PersonaJavaBean();

        // Usar getters para leer los valores por defecto
        System.out.println("Valores por defecto:");
        System.out.println("Nombre: " + persona.getNombre());    // Muestra "Jhon"
        System.out.println("Apellido: " + persona.getApellido()); // Muestra "Q"

        // Usar setters para cambiar los valores
        persona.setNombre("Maria");      // Cambia el nombre a "Maria"
        persona.setApellido("Gomez");    // Cambia el apellido a "Gomez"
        persona.setSoltero(true);        // Establece soltero = true

        // Ver los cambios con los getters
        System.out.println("Despues de cambios:");
        System.out.println("Nombre: " + persona.getNombre());     // Muestra "Maria"
        System.out.println("Apellido: " + persona.getApellido()); // Muestra "Gomez"
        System.out.println("Es soltero: " + persona.isSoltero()); // Muestra "true"
    }
}
