package com.company.ModeloParcial;
/*
 * TEORÍA: Interfaz (de java 3.ppt / java 5.ppt)
 * Una interfaz es un "contrato" 100% abstracto.
 * Define un conjunto de métodos que una clase DEBE implementar si "firma" este contrato.
 * No dice CÓMO hacerlo, solo QUÉ debe hacer.
 *
 * Enunciado: "Crear al menos una interfaz, por ejemplo: calcularCostoMantenimiento()"
 */
public interface Mantenimiento {
    
    /**
     * Calcula el costo estimado del próximo mantenimiento.
     * La implementación dependerá de cada tipo de vehículo.
     * @return El costo en pesos.
     */
    double calcularCostoMantenimiento();
    
    /**
     * Calcula cuántos meses faltan para el próximo servicio.
     * @return Número de meses.
     */
    int getMesesProximoServicio();
}