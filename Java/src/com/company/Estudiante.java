package com.company;

// Clase Estudiante que sigue el estándar JavaBeans
// JavaBeans: clases con atributos privados, constructor sin argumentos, getters y setters
public class Estudiante {

    // ATRIBUTOS PRIVADOS - encapsulamiento
    // Cada atributo es privado para proteger los datos
    private String nombre;        // Almacena el nombre del estudiante
    private int edad;             // Almacena la edad del estudiante
    private double promedio;      // Almacena el promedio de calificaciones
    private boolean activo;       // Almacena si el estudiante está activo (true/false)

    // CONSTRUCTOR SIN ARGUMENTOS - requisito de JavaBeans
    // Se ejecuta automáticamente cuando creamos un objeto: new Estudiante()
    public Estudiante() {
        // Inicializamos los atributos con valores por defecto
        this.nombre = "Sin nombre";    // Asigna valor por defecto al nombre
        this.edad = 18;                // Asigna valor por defecto a la edad
        this.promedio = 0.0;           // Asigna valor por defecto al promedio
        this.activo = true;            // Asigna valor por defecto a activo
    }

    // GETTER para el atributo 'nombre'
    // Devuelve el valor actual del atributo nombre
    public String getNombre() {
        return this.nombre;  // Retorna el valor de 'nombre'
    }

    // SETTER para el atributo 'nombre'
    // Permite cambiar el valor del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;  // Asigna el nuevo valor al atributo
    }

    // GETTER para el atributo 'edad'
    // Devuelve el valor actual del atributo edad
    public int getEdad() {
        return this.edad;  // Retorna el valor de 'edad'
    }

    // SETTER para el atributo 'edad'
    // Permite cambiar el valor del atributo edad con validación
    public void setEdad(int edad) {
        if(edad >= 0) {  // Valida que la edad no sea negativa
            this.edad = edad;  // Asigna el nuevo valor al atributo
        }
    }

    // GETTER para el atributo 'promedio'
    // Devuelve el valor actual del atributo promedio
    public double getPromedio() {
        return this.promedio;  // Retorna el valor de 'promedio'
    }

    // SETTER para el atributo 'promedio'
    // Permite cambiar el valor del atributo promedio con validación
    public void setPromedio(double promedio) {
        if(promedio >= 0.0 && promedio <= 10.0) {  // Valida rango 0-10
            this.promedio = promedio;  // Asigna el nuevo valor al atributo
        }
    }

    // GETTER ESPECIAL para boolean - usa 'is' en lugar de 'get'
    // Para atributos booleanos, JavaBeans recomienda usar 'is' en lugar de 'get'
    public boolean isActivo() {
        return this.activo;  // Retorna el valor de 'activo'
    }

    // SETTER para el atributo booleano 'activo'
    // Permite cambiar el valor del atributo activo
    public void setActivo(boolean activo) {
        this.activo = activo;  // Asigna el nuevo valor al atributo
    }
}
