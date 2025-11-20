package com.company.ClaseAbstracta;

// 1. La clase abstracta (El concepto general)
abstract class Animal {
    String nombre;

    // Método abstracto (sin cuerpo)
    public abstract void hacerSonido();

    // Método normal (con cuerpo)
    public void dormir() {
        System.out.println("Zzzzz... (durmiendo)");
    }
}

// 2. Clase hija Perro
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau guau!");
    }
}

// 3. Clase hija Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau miau!");
    }
}



/*Un método abstracto no tiene cuerpo (no usa { ... }), termina en ;.
Si una clase tiene al menos un método abstracto, la clase entera debe ser abstracta (abstract class).
Cualquier clase que herede de una clase abstracta debe escribir el código de esos métodos (o volverse abstracta también).*/