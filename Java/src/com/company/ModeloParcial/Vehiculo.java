package com.company.ModeloParcial;
import java.util.Objects;

/*
 * TEORÍA: Clase Abstracta (de Intro Conceptos POO.pptx)
 * Hacemos esta clase 'abstract' porque no queremos que nadie cree un "Vehiculo" genérico.
 * Solo se podrán crear sus clases hijas (Auto, Camion).
 *
 * TEORÍA: Interfaz (de java 3.ppt / java 5.ppt)
 * 'implements Mantenimiento' obliga a esta clase (o a sus hijas) a implementar
 * los métodos definidos en la interfaz Mantenimiento.java.
 */
public abstract class Vehiculo implements Mantenimiento {

    /*
     * TEORÍA: Encapsulamiento (de Intro Conceptos POO.pptx y java 3.ppt)
     * Los atributos son 'private'. Solo se puede acceder a ellos mediante
     * métodos públicos (getters y setters).
     */
    private String marca;
    private String modelo;
    private int anio;
    private String patente; // ABC123 o AB123CD
    private String tipo; // Ej: "Sedán", "Carga", "Urbana"
    private double kilometraje;

    /*
     * TEORÍA: Constructor Parametrizado (Requisito)
     * Este método especial se llama al crear un objeto (new Vehiculo(...))
     * e inicializa sus atributos. 'this.marca' se refiere al atributo de la clase,
     * y 'marca' se refiere al parámetro que llega al método.
     */
    public Vehiculo(String marca, String modelo, int anio, String patente, String tipo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.patente = patente.toUpperCase(); // Guardamos la patente en mayúsculas (uso de String method)
        this.tipo = tipo;
        this.kilometraje = kilometraje;
    }

    // --- Getters y Setters (Encapsulamiento) ---
    // Permiten leer (get) y escribir (set) los atributos privados.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente.toUpperCase();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    // --- Métodos Requeridos por el Enunciado ---

    /*
     * TEORÍA: Sobrecarga de Métodos (Polimorfismo)
     * Dos métodos con el mismo nombre ('mostrarInfo') pero diferentes parámetros.
     * Java sabe cuál llamar basado en los argumentos que le pasas.
     */
    
    /**
     * Muestra información detallada del vehículo.
     */
    public void mostrarInfo() {
        System.out.printf("  Patente: %s\n", this.patente);
        System.out.printf("  Marca/Modelo: %s %s (%d)\n", this.marca, this.modelo, this.anio);
        System.out.printf("  Tipo: %s\n", this.tipo);
        System.out.printf("  Kilometraje: %.1f km\n", this.kilometraje);
    }

    /**
     * Muestra información simple (si simple=true) o detallada (si simple=false).
     * @param simple Si es true, muestra solo patente y marca/modelo.
     */
    public void mostrarInfo(boolean simple) {
        if (simple) {
            System.out.printf("- %s (%s %s)\n", this.patente, this.marca, this.modelo);
        } else {
            this.mostrarInfo(); // Llama al otro método mostrarInfo()
        }
    }

    /*
     * TEORÍA: Sobrescritura de equals() y hashCode() (Requisito)
     * Le enseñamos a Java cómo comparar dos objetos Vehiculo.
     * Dos vehículos son "iguales" si su patente es la misma.
     * Esto es VITAL para que ArrayList.contains() o remove() funcionen bien.
     */

    @Override
    public boolean equals(Object o) {
        // 1. Si es el mismo objeto en memoria, es igual
        if (this == o) return true;
        // 2. Si el otro es nulo o no es de la misma clase, no es igual
        if (o == null || getClass() != o.getClass()) return false;
        // 3. Comparamos lo importante: la patente
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        // Usamos la patente para generar el "código hash"
        return Objects.hash(patente);
    }

    /*
     * TEORÍA: Sobrescritura (Polimorfismo)
     * Sobrescribimos el método toString() que viene de la clase Object.
     * Esto permite que hagamos System.out.println(miVehiculo) y se vea bonito.
     */
    @Override
    public String toString() {
        return String.format("[%s] %s %s (%d) - %.1f km", patente, marca, modelo, anio, kilometraje);
    }
}
