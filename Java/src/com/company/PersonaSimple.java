package com.company;

// Clase simple con encapsulamiento
public class PersonaSimple {

    // ATRIBUTOS PRIVADOS - encapsulados
    private String nombre;
    private int edad;

    // CONSTRUCTOR - para crear objetos
    public PersonaSimple(String n, int e) {
        this.nombre = n;  // Asigna el nombre
        this.edad = e;    // Asigna la edad
    }

    // GETTER para nombre - permite leer el valor
    public String getNombre() {
        return this.nombre;  // Devuelve el nombre
    }

    // SETTER para nombre - permite cambiar el valor con validación
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;  // Cambia el nombre
    }

    // GETTER para edad
    public int getEdad() {
        return this.edad;  // Devuelve la edad
    }

    // SETTER para edad - con validación
    public void setEdad(int nuevaEdad) {
        if(nuevaEdad >= 0) {  // Valida que la edad no sea negativa
            this.edad = nuevaEdad;
        }
    }

    public void mostrarInfo() {
    }
}

