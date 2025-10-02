package com.company;

public class Salary {
    public static void main(String[] args) {
        int mascotas = 3;

        // OPERADOR TERNARIO:
        // condicion ? valor_si_verdadero : valor_si_falso
        String estado = (mascotas < 4) ? "numero correcto de mascotas" : "demasiadas mascotas";

        System.out.println("El estado de las mascotas es: " + estado);
    }
}