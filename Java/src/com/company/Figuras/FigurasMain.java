package com.company;

public class FigurasMain {
    public static void main(String[] args) {
        System.out.println("\n--- 61) Figura Geométrica (Abstracta e Interface) ---");

        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Área del Círculo: " + circulo.calcularArea());
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

        // Usando la interfaz Dibujable
        ((Dibujable) circulo).dibujar();
        ((Dibujable) rectangulo).dibujar();
    }
}