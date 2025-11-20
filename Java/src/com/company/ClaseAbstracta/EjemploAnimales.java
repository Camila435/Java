package com.company.ClaseAbstracta;

public class EjemploAnimales {
    public static void main(String[] args) {
        
        // No puedes hacer esto: 
        // Animal a = new Animal(); // Error: ¡Animal es abstracto!

        // Pero sí puedes crear las clases hijas:
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Probamos el método abstracto (cada uno lo hace a su manera)
        miPerro.hacerSonido(); 
        miGato.hacerSonido();

        // Probamos el método heredado (es igual para ambos)
        miPerro.dormir();
        miGato.dormir();
    }
}