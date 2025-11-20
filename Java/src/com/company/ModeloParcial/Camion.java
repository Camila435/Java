package com.company.ModeloParcial;

/*
 * TEORÍA: Herencia (de Intro Conceptos POO.pptx y java 3.ppt)
 * 'public class Camion extends Vehiculo'
 * 'Camion' también ES UN 'Vehiculo'.
 */
public class Camion extends Vehiculo {

    // Atributos propios de Camion
    private double capacidadCargaToneladas;
    private int numeroEjes;

    /*
     * TEORÍA: Constructor de Subclase
     * Llama a 'super(...)' para pasar los datos al constructor de 'Vehiculo'.
     */
    public Camion(String marca, String modelo, int anio, String patente, String tipo, double kilometraje, double capacidadCargaToneladas, int numeroEjes) {
        super(marca, modelo, anio, patente, tipo, kilometraje);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.numeroEjes = numeroEjes;
    }

    // Getters y Setters para atributos propios
    public double getCapacidadCargaToneladas() {
        return capacidadCargaToneladas;
    }

    public void setCapacidadCargaToneladas(double capacidadCargaToneladas) {
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


    /*
     * TEORÍA: Polimorfismo por Sobrescritura (@Override)
     * Implementamos los mismos métodos de la interfaz 'Mantenimiento',
     * pero con una lógica de cálculo DIFERENTE a la de 'Auto'.
     * ¡Esto es polimorfismo!
     */
    @Override
    public double calcularCostoMantenimiento() {
        // Lógica simple para un camión:
        // $20000 base + $5 por km + $1000 por cada eje
        return 20000 + (getKilometraje() * 5) + (numeroEjes * 1000);
    }

    @Override
    public int getMesesProximoServicio() {
        // Lógica simple: servicio cada 6 meses.
        // (getKilometraje() % 50000) ...
        return 6; // Fijo para camiones
    }

    /*
     * TEORÍA: Sobrescritura de toString()
     * Añadimos la información extra de esta subclase.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" [Carga: %.1f Tn, %d ejes]", capacidadCargaToneladas, numeroEjes);
    }
}
