package com.company;

public class EjemploArreglosAvanzados {
    public static void main(String[] args) {

        // CREACION DE ARREGLO CON VALORES INICIALES
        // Se crea un arreglo de 8 elementos con valores del 2 al 9
        int[] enterosChicos = {2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("ARREGLO ORIGINAL:");
        for(int i = 0; i < enterosChicos.length; i++) {
            System.out.println("enterosChicos[" + i + "] = " + enterosChicos[i]);
        }

        // ARREGLO ANONIMO - se asigna un nuevo arreglo sin nombre a la variable
        // Se crea un nuevo arreglo con diferentes valores
        enterosChicos = new int[] {21, 22, 23, 43, 33, 45, 46, 47};

        System.out.println("ARREGLO CON NUEVOS VALORES (ANONIMO):");
        for(int i = 0; i < enterosChicos.length; i++) {
            System.out.println("enterosChicos[" + i + "] = " + enterosChicos[i]);
        }

        // COPIAR ARREGLOS CON System.arraycopy()
        // Crear un arreglo origen (de donde copiamos)
        int[] arregloOrigen = {10, 20, 30, 40, 50, 60, 70, 80};

        // Crear un arreglo destino (a donde copiamos)
        int[] arregloDestino = new int[10];  // Arreglo de 10 elementos (inicialmente 0)

        // Mostrar arreglo destino antes de copiar
        System.out.println("ARREGLO DESTINO ANTES DE COPIAR:");
        for(int i = 0; i < arregloDestino.length; i++) {
            System.out.println("arregloDestino[" + i + "] = " + arregloDestino[i]);
        }

        // COPIAR ELEMENTOS DE UN ARREGLO A OTRO
        // System.arraycopy(origen, posicion_inicio_origen, destino, posicion_inicio_destino, cantidad_elementos)
        System.arraycopy(arregloOrigen,  // arreglo de origen
                2,               // empezar desde indice 2 del origen (valor 30)
                arregloDestino,  // arreglo destino
                3,               // empezar en indice 3 del destino
                4);              // copiar 4 elementos

        System.out.println("ARREGLO DESTINO DESPUES DE COPIAR:");
        for(int i = 0; i < arregloDestino.length; i++) {
            System.out.println("arregloDestino[" + i + "] = " + arregloDestino[i]);
        }

        // EJEMPLO DE COPIADO COMPLETO
        int[] copiaCompleta = new int[arregloOrigen.length];

        // Copiar todo el arreglo origen a copiaCompleta
        System.arraycopy(arregloOrigen,  // origen
                0,               // desde indice 0
                copiaCompleta,   // destino
                0,               // desde indice 0
                arregloOrigen.length);  // todos los elementos

        System.out.println("COPIA COMPLETA DEL ARREGLO ORIGEN:");
        for(int i = 0; i < copiaCompleta.length; i++) {
            System.out.println("copiaCompleta[" + i + "] = " + copiaCompleta[i]);
        }

        // EXPLICACION DE LOS PARAMETROS DE arraycopy
        System.out.println("EXPLICACION DE SYSTEM.ARRAYCOPY:");
        System.out.println("arraycopy(origen, desdeOrigen, destino, desdeDestino, cantidad)");
        System.out.println("origen: arreglo de donde se copian los datos");
        System.out.println("desdeOrigen: indice en el arreglo origen donde empezar a copiar");
        System.out.println("destino: arreglo donde se pegaran los datos");
        System.out.println("desdeDestino: indice en el arreglo destino donde empezar a pegar");
        System.out.println("cantidad: cuantos elementos copiar");
    }
}
