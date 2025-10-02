package com.company;
// Esta línea define una clase llamada 'Main'
// 'public' significa que es accesible desde cualquier parte
// 'class' es la palabra clave para crear una clase
// 'Main' es el nombre de la clase (debe coincidir con el nombre del archivo)
public class Main {

    // Esta línea define una clase interna llamada 'Coche'
    // 'static' significa que pertenece a la clase Main, no a objetos individuales
    // 'class' crea una nueva clase
    // 'Coche' es el nombre de esta clase auxiliar
    static class Coche {
        // 'private' significa que solo se puede acceder desde dentro de esta clase
        // 'String' es el tipo de dato (cadena de texto)
        // 'marca' es el nombre del atributo que almacenará la marca del coche
        private String marca;

        // Otro atributo privado para almacenar el color del coche
        private String color;

        // 'int' es el tipo de dato (número entero)
        // 'velocidad' almacenará la velocidad actual del coche
        private int velocidad;

        // MÉTODO GETTER para obtener la marca
        // 'public' significa que se puede llamar desde cualquier clase
        // 'String' es el tipo de dato que devuelve este método
        // 'getMarca()' es el nombre del método
        public String getMarca() {
            // 'return' devuelve el valor almacenado en el atributo 'marca'
            return marca;
        }

        // MÉTODO SETTER para asignar una marca
        // 'void' significa que no devuelve ningún valor
        // 'setMarca' es el nombre del método
        // '(String m)' define un parámetro 'm' de tipo String que recibirá el método
        public void setMarca(String m) {
            // 'this.marca' se refiere al atributo 'marca' de ESTE objeto
            // 'm' es el valor que recibimos como parámetro
            // Esta línea asigna el valor de 'm' al atributo 'marca'
            this.marca = m;
        }

        // Getter para el color - similar al de marca
        public String getColor() {
            return color;
        }

        // Setter para el color - asigna el valor recibido al atributo color
        public void setColor(String c) {
            this.color = c;
        }

        // Getter para la velocidad - devuelve el valor actual de velocidad
        public int getVelocidad() {
            return velocidad;
        }

        // MÉTODO PARA ACELERAR EL COCHE
        // Recibe un parámetro 'km' que indica cuánto acelerar
        public void acelerar(int km) {
            // 'this.velocidad += km' es igual a 'this.velocidad = this.velocidad + km'
            // Suma 'km' a la velocidad actual y guarda el resultado en 'velocidad'
            this.velocidad += km;

            // Imprime un mensaje mostrando la nueva velocidad
            System.out.println("Acelerando... Velocidad: " + this.velocidad + " km/h");
        }

        // MÉTODO PARA MOSTRAR TODA LA INFORMACIÓN DEL COCHE
        public void mostrarInfo() {
            // Concatena todos los valores y los muestra en una línea
            System.out.println("Marca: " + marca + " Color: " + color + " Velocidad: " + velocidad + " km/h");
        }
    }

    // MÉTODO MAIN - PUNTO DE INICIO DEL PROGRAMA
    // 'public static void main(String[] args)' es la firma obligatoria del método principal
    // 'public' - accesible desde fuera
    // 'static' - pertenece a la clase, no necesita crear objeto
    // 'void' - no devuelve valor
    // 'main' - nombre del método
    // 'String[] args' - parámetro que puede recibir argumentos de línea de comandos
    public static void main(String[] args) {
        // CREAR UN NUEVO OBJETO COCHE
        // 'Coche' es el tipo de variable
        // 'miCoche' es el nombre de la variable que guardará el objeto
        // 'new Coche()' crea una nueva instancia (objeto) de la clase Coche
        Coche miCoche = new Coche();

        // LLAMAR AL MÉTODO SETTER PARA ASIGNAR LA MARCA
        // 'miCoche' es el objeto que creamos
        // '.setMarca("Toyota")' llama al método setMarca del objeto miCoche
        // "Toyota" es el valor que enviamos al método
        miCoche.setMarca("Toyota");

        // ASIGNAR EL COLOR USANDO EL SETTER
        miCoche.setColor("Rojo");

        // LLAMAR AL MÉTODO ACELERAR
        // Enviamos el valor 50 para aumentar la velocidad en 50 km/h
        miCoche.acelerar(50);

        // LLAMAR AL MÉTODO QUE MUESTRA TODA LA INFORMACIÓN
        miCoche.mostrarInfo();

        // Usar la clase PersonaSimple
        PersonaSimple persona = new PersonaSimple("Ana", 25);

        // Probar los getters
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Probar los setters
        persona.setNombre("Maria");
        persona.setEdad(30);

        // Probar la validación (edad negativa no funciona)
        persona.setEdad(-5);

        // Mostrar información final
        persona.mostrarInfo();
    }
}