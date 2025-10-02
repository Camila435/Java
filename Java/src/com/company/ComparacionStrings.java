import java.util.Scanner;

public class ComparacionStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 44) Comparación de Strings ---");
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // 1. Si son exactamente iguales (equals)
        boolean sonIgualesExactas = palabra1.equals(palabra2);
        System.out.println("\n¿Son exactamente iguales (case sensitive)? " + sonIgualesExactas);

        // 2. Si son iguales ignorando mayúsculas (equalsIgnoreCase)
        boolean sonIgualesIgnorandoCaso = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("¿Son iguales ignorando mayúsculas/minúsculas? " + sonIgualesIgnorandoCaso);
    }
}