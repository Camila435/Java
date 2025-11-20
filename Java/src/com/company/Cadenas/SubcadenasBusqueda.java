import java.util.Scanner;

public class SubcadenasBusqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 47) Subcadenas y Búsqueda ---");
        System.out.print("Ingrese una frase completa: ");
        String frase = scanner.nextLine();
        
        System.out.print("Ingrese una palabra a buscar: ");
        String palabraBuscar = scanner.nextLine();

        // El programa debe verificar si la palabra está contenida en la frase (contains)
        boolean contiene = frase.contains(palabraBuscar);
        System.out.println("\n¿La frase contiene la palabra '" + palabraBuscar + "'? " + contiene);

        if (contiene) {
            // Mostrar la posición donde aparece (indexOf)
            int posicion = frase.indexOf(palabraBuscar);
            System.out.println("La palabra aparece por primera vez en la posición (índice): " + posicion);
        } else {
            System.out.println("La palabra no fue encontrada en la frase.");
        }
    }
}