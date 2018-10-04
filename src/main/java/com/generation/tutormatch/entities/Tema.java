package com.generation.tutormatch.entities;

import javax.persistence.*;

@Entity
@Table(name="tema")
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTema;

    private String nombreTema;

    public Tema() {
    }

    public Tema(int idTema, String nombreTema) {
        this.idTema = idTema;
        this.nombreTema = nombreTema;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }
}
