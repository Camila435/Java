import java.util.Arrays;

public class PasoPorValorYReferencia {

    // 1. Función para duplicar un número (Paso por Valor)
    public static void duplicarNumero(int x) {
        System.out.println("   [Función] Valor inicial de x: " + x);
        x = x * 2; // El cambio solo afecta a la copia local 'x'
        System.out.println("   [Función] Valor duplicado de x: " + x);
    }

    // 2. Función para duplicar los elementos de un arreglo (Paso por Referencia)
    public static void duplicarArreglo(int[] arr) {
        System.out.println("   [Función] Arreglo inicial: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            // Se modifica el contenido de la posición de memoria a la que apunta 'arr'
            arr[i] = arr[i] * 2; 
        }
        System.out.println("   [Función] Arreglo modificado: " + Arrays.toString(arr));
    }

    // 3. y 4. Método main para la prueba
    public static void main(String[] args) {
        // --- Prueba de duplicarNumero (Paso por Valor) ---
        int miNumero = 10;
        System.out.println("--- Prueba de Paso por Valor (int) ---");
        System.out.println("Main: Valor inicial de miNumero: " + miNumero);

        duplicarNumero(miNumero); // Se pasa una COPIA del valor (10)

        // 4. Mostrar si cambió o no
        System.out.println("Main: Valor final de miNumero: " + miNumero);
        System.out.println("Resultado: El valor de la variable original NO cambió. Se pasó por valor.");
        System.out.println("----------------------------------------------\n");


        // --- Prueba de duplicarArreglo (Paso por Referencia) ---
        int[] miArreglo = {2, 4, 6};
        System.out.println("--- Prueba de Paso por Referencia (int[]) ---");
        System.out.println("Main: Arreglo inicial: " + Arrays.toString(miArreglo));

        duplicarArreglo(miArreglo); // Se pasa la REFERENCIA (la dirección de memoria) del arreglo

        // 5. Mostrar si los valores cambiaron
        System.out.println("Main: Arreglo final: " + Arrays.toString(miArreglo));
        System.out.println("Resultado: Los valores del arreglo original SÍ cambiaron. Se pasó la referencia.");
    }
}