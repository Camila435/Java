package com.company.HasdCodeEquals;

import java.util.Set;
import java.util.HashSet;

public class PruebaHash {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 1);
        Persona p2 = new Persona("Juan", 1); // Es lógicamente la misma persona

        Set<Persona> grupo = new HashSet<>();
        
        grupo.add(p1);
        grupo.add(p2);

        // Si hashCode/equals están bien, debería decir: 1
        // Si no están, dirá: 2
        System.out.println("Personas en el grupo: " + grupo.size());
    }
}