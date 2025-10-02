import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 21) Operaciones Básicas ---");
        System.out.print("Ingrese el primer número entero (A): ");
        int numA = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero (B): ");
        int numB = scanner.nextInt();

        // 1. La suma
        int suma = numA + numB;
        // 2. La resta
        int resta = numA - numB;
        // 3. La multiplicación
        int multiplicacion = numA * numB;
        // 4. La división (Nota: Usamos casting a double para obtener el resultado decimal)
        double division = (double) numA / numB;

        System.out.println("\nResultados:");
        System.out.println("Suma (A + B): " + suma);
        System.out.println("Resta (A - B): " + resta);
        System.out.println("Multiplicación (A * B): " + multiplicacion);

        if (numB != 0) {
            System.out.println("División (A / B): " + division);
        } else {
            System.out.println("División (A / B): No se puede dividir por cero.");
        }
        
        // No cerramos el scanner aquí para reutilizarlo en otros ejercicios si fuera un solo archivo
    }
}