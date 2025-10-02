package com.company;

public class SentenciaIf {
    public static void main(String[] args) {

        System.out.println("SENTENCIA IF - EJEMPLOS");

        // EJEMPLO 1: IF SIMPLE
        // Un if simple ejecuta el codigo solo si la condicion es verdadera
        System.out.println("1. IF SIMPLE:");
        int edad = 18;
        System.out.println("Edad: " + edad);

        // Si la condicion (edad >= 18) es true, se ejecuta el bloque entre llaves
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // EJEMPLO 2: IF-ELSE
        // Ejecuta un bloque si la condicion es true, otro bloque si es false
        System.out.println("2. IF-ELSE:");
        int numero = 10;
        System.out.println("Numero: " + numero);

        // Si numero > 0 es true, ejecuta el primer bloque
        // Si es false, ejecuta el bloque del else
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo o cero");
        }

        // EJEMPLO 3: IF-ELSE IF-ELSE
        // Permite evaluar multiples condiciones en secuencia
        System.out.println("3. IF-ELSE IF-ELSE:");
        int calificacion = 85;
        System.out.println("Calificacion: " + calificacion);

        // Se evaluan las condiciones en orden
        // La primera que sea true ejecuta su bloque y salta las demas
        if (calificacion >= 90) {
            System.out.println("Calificacion: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificacion: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificacion: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificacion: D");
        } else {
            System.out.println("Calificacion: F");
        }

        // EJEMPLO 4: IF CON EXPRESION BOOLEANA COMPLEJA
        System.out.println("4. IF CON EXPRESION BOOLEANA COMPLEJA:");

        // Creamos una variable booleana con una expresion
        boolean expresionBooleana = (4 < 2);  // Esto evalua a false
        System.out.println("expresionBooleana = (4 < 2) = " + expresionBooleana);

        // Usamos el operador ! para negar la expresion
        // !false se convierte en true, por eso entra al if
        if (!expresionBooleana) {
            System.out.println("La expresion negada es true - entra al if");
        }

        // EJEMPLO 5: IF CON OPERADORES LOGICOS
        System.out.println("5. IF CON OPERADORES LOGICOS:");
        int x = 5;
        int y = 10;
        System.out.println("x = " + x + ", y = " + y);

        // AND logico (&&): ambas condiciones deben ser true
        if (x > 3 && y < 15) {
            System.out.println("x > 3 Y y < 15 - ambas true");
        }

        // OR logico (||): al menos una condicion debe ser true
        if (x > 10 || y > 5) {
            System.out.println("x > 10 O y > 5 - al menos una true");
        }

        // EJEMPLO 6: IF ANIDADO
        System.out.println("6. IF ANIDADO:");
        int temperatura = 25;
        boolean esVerano = true;
        System.out.println("Temperatura: " + temperatura + ", Es verano: " + esVerano);

        // Un if dentro de otro if
        // Primero evalua la condicion externa
        if (temperatura > 20) {
            // Si la externa es true, evalua la condicion interna
            if (esVerano) {
                System.out.println("Hace calor y es verano");
            } else {
                System.out.println("Hace calor pero no es verano");
            }
        } else {
            System.out.println("Hace frio");
        }

        // EJEMPLO 7: IF SIN LLAVES
        System.out.println("7. IF SIN LLAVES:");
        int valor = 7;
        System.out.println("Valor: " + valor);

        // Cuando el bloque tiene solo una linea, las llaves son opcionales
        // Pero es mejor practica usarlas siempre para evitar errores
        if (valor % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");

        // EJEMPLO 8: IF CON VARIAS CONDICIONES
        System.out.println("8. IF CON VARIAS CONDICIONES:");
        int hora = 14;
        System.out.println("Hora: " + hora);

        // Podemos combinar multiples condiciones
        if (hora >= 6 && hora < 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}
