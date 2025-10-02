public import java.util.Scanner;

public class EstructurasRepetitivas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- 23) Ejercicios Repetitivos ---");
            System.out.println("1. Contar del 1 al 10 con for");
            System.out.println("2. Contar del 10 al 1 con while");
            System.out.println("3. Pedir números hasta ingresar 0 con do-while");
            System.out.println("4. Recorrer un arreglo con for-each");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción (1-5): ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        // 1. Contar del 1 al 10 con for.
                        System.out.println("\nContando del 1 al 10 con for:");
                        for (int i = 1; i <= 10; i++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                        
                    case 2:
                        // 2. Contar del 10 al 1 con while.
                        System.out.println("\nContando del 10 al 1 con while:");
                        int contador = 10;
                        while (contador >= 1) {
                            System.out.print(contador + " ");
                            contador--;
                        }
                        System.out.println();
                        break;
                        
                    case 3:
                        // 3. Pedir números hasta que el usuario ingrese 0 usando do-while.
                        System.out.println("\nIngrese números (0 para detener):");
                        int numeroLeido;
                        int sumaTotal = 0;
                        do {
                            System.out.print("Número: ");
                            numeroLeido = scanner.nextInt();
                            sumaTotal += numeroLeido;
                        } while (numeroLeido != 0);
                        System.out.println("Bucle detenido. La suma de los números ingresados fue: " + sumaTotal);
                        break;

                    case 4:
                        // 4. Recorrer un arreglo de enteros con for-each y mostrar sus elementos.
                        int[] arreglo = {50, 100, 150, 200};
                        System.out.println("\nElementos del arreglo recorridos con for-each:");
                        for (int elemento : arreglo) {
                            System.out.println("Elemento: " + elemento);
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo de la práctica repetitiva...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Consumir la entrada inválida
                opcion = 0;
            }

        } while (opcion != 5);
    }
} EstructurasRepetitivas {
    
}
