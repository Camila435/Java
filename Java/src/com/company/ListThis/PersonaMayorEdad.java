package com.company.ListThis;

import java.util.ArrayList;
import java.util.List;

public class PersonaMayorEdad {
    public String nombre;
    public int anioNacimiento;

    public PersonaMayorEdad(String nombre, int anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }

    public static void main(String[] args) {
        int anioActual = 2025;
        List<PersonaMayorEdad> personas = new ArrayList<>();
        personas.add(new PersonaMayorEdad("Ana", 2000));
        personas.add(new PersonaMayorEdad("Luis", 2010));
        personas.add(new PersonaMayorEdad("Marta", 1995));
        personas.add(new PersonaMayorEdad("Pedro", 1980));
        personas.add(new PersonaMayorEdad("Sofía", 2012));

        List<PersonaMayorEdad> mayoresEdad = new ArrayList<>();
        for (PersonaMayorEdad persona : personas) {
            int edad = persona.calcularEdad(anioActual);
            if (edad >= 18) {
                mayoresEdad.add(persona);
            }
        }

        System.out.println("Personas mayores o iguales a 18 años:");
        for (PersonaMayorEdad persona : mayoresEdad) {
            int edad = persona.calcularEdad(anioActual);
            System.out.println(persona.nombre.toUpperCase() + " - " + edad + " años");
        }
        System.out.println("Personas menores de 18 años:");
        for (PersonaMayorEdad persona : personas) {
            int edad = persona.calcularEdad(anioActual);
            if (edad < 18) {
                System.out.println(persona.nombre.toUpperCase() + " - " + edad + " años");
            }
        }
    }
}