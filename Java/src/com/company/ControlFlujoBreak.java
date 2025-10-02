import java.util.Scanner;

public class ControlFlujoBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 24) Control de Flujo con break ---");
        System.out.println("Ingrese números enteros. Ingrese 999 para detener.");
        
        int contadorNumeros = 0;
        
        // Bucle infinito
        while (true) { 
            System.out.print("Ingrese número: ");
            
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                
                // 1. El programa se detiene (break) cuando el usuario ingresa el número 999.
                if (numero == 999) {
                    System.out.println("Número 999 detectado. Deteniendo el programa...");
                    break; 
                }
                
                contadorNumeros++;
            } else {
                System.out.println("Entrada inválida. Debe ser un número.");
                scanner.next(); // Consumir la entrada inválida
            }
        }
        
        // 2. Luego muestra la cantidad de números ingresados antes de detenerse.
        System.out.println("Cantidad de números ingresados (excluyendo el 999): " + contadorNumeros);
    }
}