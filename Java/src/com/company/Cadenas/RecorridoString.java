import java.util.Scanner;

public class RecorridoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 46) Recorrido de un String ---");
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.println("Caracteres de la palabra:");
        // Recorre el String usando el largo y charAt(i)
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            System.out.println(caracter);
        }
    }
}