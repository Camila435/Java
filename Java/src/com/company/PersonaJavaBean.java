package com.company;

// Clase renombrada para evitar conflictos con tu Persona existente
// Sigue el estándar JavaBeans con atributos privados, constructor sin argumentos, getters y setters
public class PersonaJavaBean {

    // ATRIBUTOS PRIVADOS - encapsulamiento
    private String nombre;    // Almacena el nombre de la persona
    private String apellido;  // Almacena el apellido de la persona
    private Boolean soltero;  // Almacena el estado civil (true = soltero, false = casado)

    // CONSTRUCTOR SIN ARGUMENTOS - requisito de JavaBeans
    public PersonaJavaBean() {
        // Inicializamos los atributos con valores por defecto
        this.nombre = "Jhon";    // Asigna "Jhon" al atributo nombre
        this.apellido = "Q";     // Asigna "Q" al atributo apellido
        // El atributo 'soltero' no se inicializa, queda como null
    }

    // GETTER para el atributo 'nombre'
    public String getNombre() {
        return this.nombre;  // Retorna el valor de 'nombre'
    }

    // SETTER para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;  // Asigna el nuevo valor al atributo
    }

    // GETTER para el atributo 'apellido'
    public String getApellido() {
        return this.apellido;  // Retorna el valor de 'apellido'
    }

    // SETTER para el atributo 'apellido'
    public void setApellido(String apellido) {
        this.apellido = apellido;  // Asigna el nuevo valor al atributo
    }

    // GETTER ESPECIAL para boolean - usa 'is' en lugar de 'get'
    public boolean isSoltero() {
        return this.soltero;  // Retorna el valor de 'soltero'
    }

    // SETTER para el atributo booleano 'soltero'
    public void setSoltero(boolean soltero) {
        this.soltero = soltero;  // Asigna el nuevo valor al atributo
    }
}
