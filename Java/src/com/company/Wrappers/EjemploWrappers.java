package com.company.Wrappers;

//Las estructuras de datos dinámicas de Java (como ArrayList, LinkedList, HashSet) solo aceptan Objetos. No aceptan primitivos.
import java.util.ArrayList; // Importamos la herramienta de lista

public class EjemploWrappers {
    public static void main(String[] args) {

        // 1. Creación de la lista
        // ❌ ESTO DARÍA ERROR: ArrayList<int> notas = new ArrayList<>();
        // ✅ FORMA CORRECTA: Usamos el Wrapper
        ArrayList<Integer> listaDeNotas = new ArrayList<>();

        // 2. Agregando datos (Autoboxing)
        // Aunque escribimos '10' (primitivo), Java lo envuelve automáticamente en una caja Integer.
        listaDeNotas.add(10); 
        listaDeNotas.add(8);
        listaDeNotas.add(5);

        System.out.println("La lista contiene: " + listaDeNotas);

        // 3. Usando los datos para matemáticas (Unboxing)
        // Aquí Java saca el número de la caja para poder sumarlo.
        int suma = 0;
        
        for (Integer unaNota : listaDeNotas) {
            suma = suma + unaNota; // Java convierte Integer a int aquí mismo
        }

        System.out.println("La suma total es: " + suma);
        
        // 4. Ejemplo de null
        listaDeNotas.add(null); // Podemos agregar un valor "vacío"
        System.out.println("Lista con un nulo: " + listaDeNotas);
    }
}
