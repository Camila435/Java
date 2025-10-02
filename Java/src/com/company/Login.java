import java.util.Scanner;

public class Login {
    // 1. Variable global (atributo de la clase)
    private static int intentosFallidos = 0;
    private static final int INTENTOS_MAXIMOS = 3;

    public static void validarUsuario() {
        // 2. Variables locales
        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese usuario: ");
        String usuarioIngresado = scanner.nextLine(); // Variable local
        System.out.print("Ingrese contraseña: ");
        String claveIngresada = scanner.nextLine(); // Variable local

        if (usuarioIngresado.equals(usuarioCorrecto) && claveIngresada.equals(claveCorrecta)) {
            System.out.println("¡Bienvenido al sistema, " + usuarioIngresado + "!");
            // Reiniciar el contador al iniciar sesión correctamente
            intentosFallidos = 0; 
        } else {
            // 3. Incrementar el contador global
            intentosFallidos++;
            System.out.println("Usuario o contraseña incorrectos. Intento " + intentosFallidos + " de " + INTENTOS_MAXIMOS);

            // 4. Mostrar mensaje de bloqueo
            if (intentosFallidos >= INTENTOS_MAXIMOS) {
                System.out.println("\n🚫 ERROR: Usuario bloqueado. Demasiados intentos fallidos.");
                System.exit(0); // Termina el programa
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Sistema de Login ---");
        // Bucle para permitir múltiples intentos
        while (intentosFallidos < INTENTOS_MAXIMOS) {
            validarUsuario();
        }
        
        // Si el bucle termina porque intentosFallidos >= INTENTOS_MAXIMOS
        if (intentosFallidos >= INTENTOS_MAXIMOS) {
            System.out.println("\n🚫 ERROR: Usuario bloqueado. Intente más tarde.");
        }
    }
}