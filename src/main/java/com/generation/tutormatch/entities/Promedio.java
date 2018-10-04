package com.generation.tutormatch.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Promedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromedio;
    private int contador;
    private int promedio;
    private int suma;
    private Calificacion calificacion;

    public Promedio() {}

    public Promedio(int idPromedio, int contador, int promedio, int suma) {
        this.idPromedio = idPromedio;
        this.contador = contador;
        this.promedio = promedio;
        this.suma = suma;
        this.calificacion = calificacion;
    }

    public int getIdPromedio() {
        return idPromedio;
    }

    public void setIdPromedio(int idPromedio) {
        this.idPromedio = idPromedio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
}
