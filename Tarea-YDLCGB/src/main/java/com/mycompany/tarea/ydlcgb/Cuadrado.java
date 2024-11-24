/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea.ydlcgb;

/**
 * Implementación de una figura geométrica tipo Cuadrado
 * @author Yeray
 */
public class Cuadrado implements Figura {

    private int lado;

    /**
     * *
     * Constructor
     *
     * @param lado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /* Getters and Setters */
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    /* Implementación de la interfaz */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}