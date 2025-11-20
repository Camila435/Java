package com.company.HasdCodeEquals;


import java.util.Objects;


class Persona {
    String nombre;
    int id;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // --- AQUÍ ESTÁ LA MAGIA ---
    // Si borras estos dos métodos, el código de abajo FALLA (imprime 2 personas)
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id; // Solo comparamos el ID para saber si es igual
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Generamos un número basado en el ID
    }
}

