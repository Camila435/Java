package com.company.TryCatchFinally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivo {
    public static void main(String[] args) {

        BufferedReader lector = null;

        try {
            // 1. INTENTAR (TRY): Abrir y leer el archivo
            System.out.println("Intentando abrir el archivo...");
            
            // Esta línea lanzará error si el archivo no existe
            lector = new BufferedReader(new FileReader("notas.txt"));
            
            String linea = lector.readLine();
            
            while (linea != null) {
                System.out.println("Leído: " + linea);
                linea = lector.readLine();
            }

        } catch (IOException e) {
            // 2. ATRAPAR (CATCH): Manejar el error
            // Esto se ejecuta si el archivo no existe o falla la lectura
            System.out.println("¡Ocurrió un error!");
            System.out.println("Detalle del error: " + e.getMessage());

        } finally {
            // 3. FINALMENTE (FINALLY): Limpieza
            // Esto se ejecuta SIEMPRE, haya error o no.
            // Es vital para cerrar el archivo y liberar memoria.
            try {
                if (lector != null) {
                    lector.close();
                    System.out.println("Archivo cerrado correctamente.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}