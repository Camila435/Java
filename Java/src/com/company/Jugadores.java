package com.company;

public class Jugadores {
    public static void main(String[] args) {
        int jugadores = 0;

        // POST-INCREMENTO: jugadores++
        System.out.println("jugadores online: " + jugadores++);
        // ↑ PRIMERO usa el valor (0), LUEGO incrementa a 1

        System.out.println("El valor de jugadores es " + jugadores);
        // ↑ Ahora jugadores vale 1

        // PRE-INCREMENTO: ++jugadores
        System.out.println("El valor de jugadores es ahora " + ++jugadores);
        // ↑ PRIMERO incrementa a 2, LUEGO usa el valor (2)
    }
}
