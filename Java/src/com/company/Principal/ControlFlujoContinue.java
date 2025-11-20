import java.util.Scanner;

public class ControlFlujoContinue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 25) Control de Flujo con continue ---");
        System.out.println("Se le pedirá ingresar 10 números. Solo se mostrarán los pares.");
        
        int numerosMostrados = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                
                // Si el número es impar (el residuo de la división por 2 es 1)
                if (numero % 2 != 0) {
                    // Usando continue para saltar los impares
                    System.out.println("   -> Impar detectado. Saltando con 'continue'.");
                    continue; 
                }
                
                // Esta línea solo se ejecuta si el número es par
                System.out.println("   -> PAR ENCONTRADO: " + numero);
                numerosMostrados++;
            } else {
                System.out.println("Entrada inválida. Se contará como intento fallido.");
                scanner.next(); // Consumir la entrada inválida
            }
        }
        
        System.out.println("\nProceso terminado. Total de números pares mostrados: " + numerosMostrados);
    }
}