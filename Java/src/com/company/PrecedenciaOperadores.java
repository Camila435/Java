package com.company;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        System.out.println("=== PRECEDENCIA DE OPERADORES ===");

        // ============================================
        // TEORIA: Los operadores * y / tienen mayor precedencia que + y -
        // Esto significa que en una expresion sin parentesis,
        // la multiplicacion y division se ejecutan antes que la suma y resta
        // ============================================

        System.out.println("1. PRECEDENCIA NATURAL:");

        // TEORIA: En esta expresion, 5 * 2 se ejecuta primero porque
        // la multiplicacion tiene mayor precedencia que la suma
        int a = 10 + 5 * 2;
        System.out.println("int a = 10 + 5 * 2;");
        System.out.println("TEORIA: * tiene precedencia sobre +");
        System.out.println("Se calcula: 5 * 2 = 10, luego 10 + 10 = " + a);

        // TEORIA: Los parentesis alteran la precedencia natural
        // Forzan a que la operacion dentro de ellos se ejecute primero
        int b = (10 + 5) * 2;
        System.out.println("\nint b = (10 + 5) * 2;");
        System.out.println("TEORIA: Los parentesis cambian el orden de evaluacion");
        System.out.println("Se calcula: (10 + 5) = 15, luego 15 * 2 = " + b);

        // ============================================
        // TEORIA: Las expresiones se evaluan de izquierda a derecha
        // Cuando hay operadores de igual precedencia, se resuelven en orden
        // ============================================

        System.out.println("\n2. EVALUACION IZQUIERDA A DERECHA:");

        // TEORIA: Division y multiplicacion tienen igual precedencia
        // Se evaluan de izquierda a derecha
        int c = 20 / 4 + 3;
        System.out.println("int c = 20 / 4 + 3;");
        System.out.println("TEORIA: / y + tienen diferente precedencia");
        System.out.println("Se calcula: 20 / 4 = 5, luego 5 + 3 = " + c);

        // TEORIA: Los parentesis crean sub-expresiones que se calculan primero
        int d = 20 / (4 + 3);
        System.out.println("\nint d = 20 / (4 + 3);");
        System.out.println("TEORIA: Parentesis crean una sub-expresion prioritaria");
        System.out.println("Se calcula: (4 + 3) = 7, luego 20 / 7 = " + d);

        // TEORIA: Cuando hay operadores de igual precedencia,
        // se evaluan de izquierda a derecha
        int e = 10 + 6 / 2 * 3;
        System.out.println("\nint e = 10 + 6 / 2 * 3;");
        System.out.println("TEORIA: / y * tienen igual precedencia, se evaluan izquierda a derecha");
        System.out.println("Se calcula: 6 / 2 = 3, luego 3 * 3 = 9, luego 10 + 9 = " + e);

        // ============================================
        // TEORIA: En operadores compuestos, primero se evalua TODA la expresion
        // del lado derecho, luego se aplica la operacion compuesta
        // ============================================

        System.out.println("\n3. OPERADORES COMPUESTOS:");

        int valor = 10;
        System.out.println("Valor inicial: " + valor);

        // TEORIA: En operadores compuestos como *=, +=, etc.
        // Primero se evalua completamente el lado derecho, luego se aplica la operacion
        valor *= 2 + 5;
        System.out.println("\nvalor *= 2 + 5;");
        System.out.println("TEORIA: Primero se evalua (2 + 5), luego se aplica *=");
        System.out.println("Equivale a: valor = valor * (2 + 5)");
        System.out.println("Resultado: " + valor);

        // ============================================
        // TEORIA: Los operadores logicos tambien tienen precedencia
        // && tiene mayor precedencia que ||
        // ============================================

        System.out.println("\n4. PRECEDENCIA DE OPERADORES LOGICOS:");

        // TEORIA: && tiene mayor precedencia que ||
        // Por eso se evalua primero el &&, luego el ||
        boolean resultado1 = true || false && false;
        System.out.println("boolean resultado1 = true || false && false;");
        System.out.println("TEORIA: && tiene mayor precedencia que ||");
        System.out.println("Se evalua: false && false = false, luego true || false = " + resultado1);

        // TEORIA: Los parentesis pueden cambiar la precedencia de operadores logicos
        boolean resultado2 = (true || false) && false;
        System.out.println("\nboolean resultado2 = (true || false) && false;");
        System.out.println("TEORIA: Parentesis cambian el orden de evaluacion logica");
        System.out.println("Se evalua: (true || false) = true, luego true && false = " + resultado2);

        // ============================================
        // TEORIA: Tabla de precedencia general
        // Los operadores se agrupan por niveles de prioridad
        // ============================================

        System.out.println("\n5. TABLA DE PRECEDENCIA (DE MAYOR A MENOR):");
        System.out.println("TEORIA: Los operadores de nivel superior se ejecutan primero");
        System.out.println("1. () - Parentesis (maxima prioridad)");
        System.out.println("2. *, /, % - Multiplicacion, Division, Modulo");
        System.out.println("3. +, - - Suma, Resta");
        System.out.println("4. =, *=, /=, +=, -= - Asignacion (menor prioridad)");

        // ============================================
        // TEORIA: En expresiones complejas, se aplican todas las reglas:
        // 1. Parentesis primero
        // 2. Precedencia de operadores
        // 3. Evaluacion izquierda a derecha para igual precedencia
        // ============================================

        System.out.println("\n6. EJEMPLO COMPLEJO APLICANDO TODAS LAS REGLAS:");

        int x = 5;
        int y = 10;
        int z = 2;

        int resultadoComplejo = x + y * z / 2 - 1;
        System.out.println("int resultadoComplejo = x + y * z / 2 - 1;");
        System.out.println("TEORIA: Se aplican todas las reglas de precedencia");
        System.out.println("Pasos de evaluacion:");
        System.out.println("1. y * z = 10 * 2 = 20  ( * tiene precedencia)");
        System.out.println("2. 20 / 2 = 10          ( / tiene igual precedencia que *, izquierda a derecha)");
        System.out.println("3. x + 10 = 5 + 10 = 15 ( + se ejecuta ahora)");
        System.out.println("4. 15 - 1 = " + resultadoComplejo + "           ( - se ejecuta al final)");

        System.out.println("\n=== REGLA GENERAL: USAR PARENTESIS PARA CLARIDAD ===");
        System.out.println("TEORIA: Es mejor usar parentesis para hacer explicito el orden");
        System.out.println("Esto evita errores y hace el codigo mas legible");
    }
}
