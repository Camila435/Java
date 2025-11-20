package com.company.ModeloParcial;
/*
 * TEORÍA: Herencia (de Intro Conceptos POO.pptx y java 3.ppt)
 * 'public class Auto extends Vehiculo'
 * Esto significa que 'Auto' ES UN 'Vehiculo'.
 * Hereda todos los atributos (marca, modelo, etc.) y métodos (getPatente, etc.)
 * de la clase Vehiculo.
 */
public class Auto extends Vehiculo {

    // Atributo propio de Auto
    private int numeroPuertas;

    /*
     * TEORÍA: Constructor de Subclase
     * Recibe todos los datos (los del Vehiculo + los del Auto).
     * 'super(marca, modelo, ...)' llama al constructor de la clase padre (Vehiculo)
     * para inicializar los atributos que se heredan.
     */
    public Auto(String marca, String modelo, int anio, String patente, String tipo, double kilometraje, int numeroPuertas) {
        super(marca, modelo, anio, patente, tipo, kilometraje); // Llama al constructor de Vehiculo
        this.numeroPuertas = numeroPuertas;
    }

    // Getter y Setter para el atributo propio
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /*
     * TEORÍA: Polimorfismo por Sobrescritura (@Override)
     * Aquí implementamos los métodos de la interfaz 'Mantenimiento'.
     * Un Auto calcula su costo de forma diferente a un Camión.
     *
     * @Override le indica al compilador que estamos intentando
     * sobrescribir un método de la clase padre o de una interfaz.
     */

    @Override
    public double calcularCostoMantenimiento() {
        // Lógica simple para un auto:
        // $5000 base + $1.5 por cada km
        return 5000 + (getKilometraje() * 1.5);
    }

    @Override
    public int getMesesProximoServicio() {
        // Lógica simple: servicio cada 10,000 km o 12 meses.
        // Asumimos que un auto anda 15,000 km/año (aprox 1250/mes)
        // (10000 - (km % 10000)) / 1250
        double kmSobrantes = 10000 - (getKilometraje() % 10000);
        int meses = (int) (kmSobrantes / 1250.0);
        return Math.max(1, meses); // Mínimo 1 mes
    }

    /*
     * TEORÍA: Sobrescritura de toString()
     * Podemos añadir la información extra de esta subclase.
     * 'super.toString()' llama al método toString() de la clase padre (Vehiculo)
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" [%d puertas]", numeroPuertas);
    }
}