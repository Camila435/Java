package com.company.Maps;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {

        // 1. CREAR EL MAPA
        // <Tipo de Clave, Tipo de Valor>
        Map<String, Double> precios = new HashMap<>();

        // 2. GUARDAR DATOS (.put)
        // Fíjate que no usamos .add, usamos .put
        precios.put("Manzana", 150.50);
        precios.put("Pera", 200.00);
        precios.put("Banana", 120.00);

        // 3. SOBRESCRIBIR
        // Si insertas una clave que YA existe, actualiza el valor viejo
        precios.put("Manzana", 500.00); // ¡Inflación! La manzana ahora es más cara
        
        System.out.println("Mapa actual: " + precios);

        // 4. LEER UN DATO (.get)
        // Le damos la llave ("Pera") y nos devuelve el valor (200.0)
        Double precioPera = precios.get("Pera");
        System.out.println("La pera cuesta: $" + precioPera);

        // 5. VERIFICAR SI EXISTE (.containsKey)
        // Vital para evitar errores antes de pedir algo
        if (precios.containsKey("Uva")) {
            System.out.println("Sí vendemos uvas");
        } else {
            System.out.println("No tenemos uvas en stock");
        }

        // 6. BORRAR (.remove)
        precios.remove("Banana");

        // 7. RECORRER UN MAPA
        // Como no tiene orden numérico, iteramos sobre sus LLAVES (keySet)
        System.out.println("\n--- Lista de Precios ---");
        
        for (String fruta : precios.keySet()) {
            // Usamos la llave para obtener el valor en cada vuelta
            Double precio = precios.get(fruta); 
            System.out.println("Producto: " + fruta + " | Precio: $" + precio);
        }
    }
}
/*Un Map (Mapa) o Diccionario es la estructura de datos más útil después de la Lista.
A diferencia de las Listas que guardan cosas una tras otra (índices 0, 1, 2...), el Map guarda datos en parejas de Clave -> Valor (Key -> Value).*/
/*Método,Descripción
"put(K, V)","Guarda una pareja. Si la clave ya existía, borra el valor anterior y pone el nuevo."
get(K),"Le das la clave y te devuelve el valor. Si no existe, devuelve null."
containsKey(K),Devuelve true o false si la clave está en el mapa.
remove(K),Borra la pareja completa usando la clave.
keySet(),Te devuelve un Set con todas las claves (ideal para bucles).
values(),Te devuelve una lista solo con los valores.*/