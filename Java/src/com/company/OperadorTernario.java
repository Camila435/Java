package com.company;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("=== OPERADOR TERNARIO ===");

        // EJEMPLO 1: Mascotas (tu ejemplo)
        int mascotas = 3;
        String estadoMascotas = (mascotas < 4) ? "numero correcto de mascotas" : "demasiadas mascotas";
        System.out.println("Mascotas: " + mascotas + " -> " + estadoMascotas);

        // EJEMPLO 2: Mayor de edad
        int edad = 20;
        String puedeConducir = (edad >= 18) ? "Puede conducir" : "No puede conducir";
        System.out.println("Edad: " + edad + " -> " + puedeConducir);

        // EJEMPLO 3: Número par o impar
        int numero = 7;
        String tipoNumero = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("Numero: " + numero + " -> " + tipoNumero);

        // EJEMPLO 4: Aprobado o reprobado
        int nota = 75;
        String resultado = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Nota: " + nota + " -> " + resultado);

        // EJEMPLO 5: Con números (no solo Strings)
        int precio = 100;
        int descuento = (precio > 50) ? 10 : 0;
        System.out.println("Precio: " + precio + " -> Descuento: " + descuento + "%");

        // EJEMPLO 6: Múltiples condiciones
        int hora = 14;
        String saludo = (hora < 12) ? "Buenos dias" : (hora < 18) ? "Buenas tardes" : "Buenas noches";
        System.out.println("Hora: " + hora + " -> " + saludo);
    }
}
