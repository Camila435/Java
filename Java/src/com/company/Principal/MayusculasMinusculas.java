import java.util.Scanner;

public class MayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 45) Mayúsculas y Minúsculas ---");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Todo mayúsculas (toUpperCase())
        String enMayusculas = frase.toUpperCase();
        System.out.println("En Mayúsculas: " + enMayusculas);

        // Todo minúsculas (toLowerCase())
        String enMinusculas = frase.toLowerCase();
        System.out.println("En Minúsculas: " + enMinusculas);
    }
}