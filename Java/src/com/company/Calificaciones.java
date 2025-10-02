import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- 22) Sistema de Calificaciones ---");
        System.out.print("Ingrese la nota (0-10): ");
        int nota = scanner.nextInt();

        System.out.println("\n--- Usando Estructura if-else if ---");
        String resultadoIf;
        
        // 1. Si la nota es menor a 6, mostrar “Reprobado”
        if (nota < 6) {
            resultadoIf = "Reprobado 😞";
        // 2. Si la nota está entre 6 y 8, mostrar “Aprobado”
        } else if (nota >= 6 && nota <= 8) {
            resultadoIf = "Aprobado 😊";
        // 3. Si la nota es mayor o igual a 9, mostrar “Excelente”
        } else if (nota >= 9 && nota <= 10) {
            resultadoIf = "Excelente 🌟";
        } else {
            resultadoIf = "Nota fuera del rango (0-10).";
        }
        System.out.println("Nota " + nota + ": " + resultadoIf);


        // 4. Implementa la misma lógica también con un switch
        System.out.println("\n--- Usando Estructura switch (con 'switch expression' si Java >= 14, o 'switch normal' para rangos) ---");
        // Nota: Para implementar rangos en switch con versiones antiguas, se usa un truco con la división.
        // Aquí usamos la estructura normal que es más limpia en Java moderno (desde 14), 
        // o mapeamos la nota a un grupo si usamos switch normal (< Java 14). Usaremos el mapeo por simplicidad.
        
        String resultadoSwitch;
        int grupoNota;

        if (nota < 0 || nota > 10) {
            grupoNota = -1; // Caso de error
        } else if (nota < 6) {
            grupoNota = 0; // Reprobado
        } else if (nota <= 8) {
            grupoNota = 1; // Aprobado
        } else { // >= 9
            grupoNota = 2; // Excelente
        }

        switch (grupoNota) {
            case 0:
                resultadoSwitch = "Reprobado 😞";
                break;
            case 1:
                resultadoSwitch = "Aprobado 😊";
                break;
            case 2:
                resultadoSwitch = "Excelente 🌟";
                break;
            default:
                resultadoSwitch = "Nota fuera del rango (0-10).";
                break;
        }
        
        System.out.println("Nota " + nota + ": " + resultadoSwitch);
    }
}