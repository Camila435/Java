package com.company;

public class AlcanceVariables {

    // Variable de instancia - alcance en TODA la clase
    int variableInstancia = 100;

    public static void main(String[] args) {

        // Variable LOCAL del metodo main - alcance en todo el main
        int variableMain = 50;

        System.out.println("Variable main: " + variableMain);

        // BLOQUE 1 - if
        if(true) {
            // Variable LOCAL del bloque if - solo existe dentro del if
            int variableIf = 10;
            System.out.println("Dentro del if - variableIf: " + variableIf);
            System.out.println("Dentro del if - variableMain: " + variableMain);

            // variableIf solo existe aqui dentro
        }
        // System.out.println(variableIf); // ERROR - variableIf no existe aqui

        // BLOQUE 2 - for
        for(int i = 0; i < 3; i++) {
            // Variable LOCAL del for - 'i' solo existe dentro del for
            int variableFor = i * 2;
            System.out.println("Dentro del for - i: " + i + ", variableFor: " + variableFor);
            System.out.println("Dentro del for - variableMain: " + variableMain);

            // 'i' y variableFor solo existen aqui dentro
        }
        // System.out.println(i); // ERROR - 'i' no existe aqui
        // System.out.println(variableFor); // ERROR - variableFor no existe aqui

        // BLOQUE 3 - otro bloque independiente
        {
            int variableBloque = 99;
            System.out.println("Dentro del bloque - variableBloque: " + variableBloque);

            // variableBloque solo existe aqui dentro
        }
        // System.out.println(variableBloque); // ERROR - variableBloque no existe aqui

        // Puedo reusar nombres en bloques diferentes
        {
            int variableReusada = 200;  // Esta es DIFERENTE de la anterior
            System.out.println("Segundo bloque - variableReusada: " + variableReusada);
        }

        // Variable con mismo nombre en bloque diferente
        for(int i = 0; i < 2; i++) {
            int variableReusada = i + 100;  // Diferente variable, mismo nombre
            System.out.println("For - variableReusada: " + variableReusada);
        }

        System.out.println("Fin main - variableMain: " + variableMain);
    }

    public void otroMetodo() {
        // Esta variable es LOCAL de otroMetodo
        int variableOtroMetodo = 77;
        System.out.println("En otroMetodo - variableOtroMetodo: " + variableOtroMetodo);

        // Puedo acceder a variableInstancia desde cualquier metodo
        System.out.println("En otroMetodo - variableInstancia: " + variableInstancia);

        // NO puedo acceder a variables de otros metodos
        // System.out.println(variableMain); // ERROR - variableMain es del main
    }
}
