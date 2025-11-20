public class CaracteresEscape {
    public static void main(String[] args) {
        System.out.println("\n--- 48) Caracteres de Escape y Formato ---");

        // \n: Salto de línea
        // \t: Tabulación
        String mensaje = "Datos Personales:\n" +
                         "\tNombre:\tJuan\n" +
                         "\tEdad:\t20\n" +
                         "\tCiudad:\tResistencia";

        System.out.println(mensaje);
    }
}