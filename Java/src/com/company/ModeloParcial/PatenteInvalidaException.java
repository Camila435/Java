package com.company.ModeloParcial;

/*
 * TEORÍA: Excepciones Personalizadas (de java 3.ppt)
 * Creamos nuestra propia clase de error extendiendo 'Exception'.
 * Esto nos permite "lanzar" (throw) un error muy específico
 * y "atraparlo" (catch) en otro lado.
 *
 * Enunciado: "Crear una excepción, por ejemplo: PatenteInvalidaException"
 */
public class PatenteInvalidaException extends Exception {
    
    /**
     * Constructor que recibe el mensaje de error.
     * @param mensaje El mensaje que explica por qué la patente es inválida.
     */
    public PatenteInvalidaException(String mensaje) {
        // 'super(mensaje)' llama al constructor de la clase padre (Exception)
        // y le pasa el mensaje de error.
        super(mensaje);
    }
}
