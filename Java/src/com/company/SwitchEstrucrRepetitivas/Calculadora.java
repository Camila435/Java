package com.company.SwitchEstrucrRepetitivas;
import java.util.Scanner;

public class Calculadora {

    // 1. Procedimiento que muestra el menú
    public static void mostrarMenu() {
        System.out.println("\n--- Calculadora Básica ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción (1-5): ");
    }

    // 2. Funciones para operaciones matemáticas

    // Función para la suma
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Función para la resta
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Función para la multiplicación
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Función para la división
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.err.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Not-a-Number para indicar error
        }
    }

    // 3. Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu(); // Llama al procedimiento
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    if (!scanner.hasNextDouble()) {
                        System.err.println("Entrada inválida. Debe ser un número.");
                        scanner.next(); // Consumir la entrada inválida
                        continue;
                    }
                    double num1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    if (!scanner.hasNextDouble()) {
                        System.err.println("Entrada inválida. Debe ser un número.");
                        scanner.next(); // Consumir la entrada inválida
                        continue;
                    }
                    double num2 = scanner.nextDouble();
                    double resultado = 0;
                    boolean operacionExitosa = true;

                    switch (opcion) {
                        case 1:
                            resultado = sumar(num1, num2); // Llama a la función
                            break;
                        case 2:
                            resultado = restar(num1, num2); // Llama a la función
                            break;
                        case 3:
                            resultado = multiplicar(num1, num2); // Llama a la función
                            break;
                        case 4:
                            resultado = dividir(num1, num2); // Llama a la función
                            if (Double.isNaN(resultado)) {
                                operacionExitosa = false;
                            }
                            break;
                    }

                    if (operacionExitosa) {
                        System.out.println("El resultado es: " + resultado);
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } else {
                System.err.println("Entrada inválida. Debe ser un número entero.");
                scanner.next(); // Consumir la entrada inválida
                opcion = 0; // Para que el bucle continúe
            }
        } while (opcion != 5);

        System.out.println("¡Calculadora apagada! Adiós.");
        scanner.close();
    }
}