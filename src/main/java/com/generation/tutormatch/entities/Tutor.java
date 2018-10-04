package com.generation.tutormatch.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name="tutor")
public class Tutor extends Alumno{
    private int idTutor;
    private Tema nombreTema;
    private Promedio promedio;

    public Tutor(Tema nombreTema, Promedio promedio) {
        this.nombreTema = nombreTema;
        this.promedio = promedio;
    }

    public Tutor(int idTutor, int idUsuario, String nombreUsuario, String correoUsuario, String passwordUsuario, int telefonoUsuario, Blob imgUser, Tema nombreTema, Promedio promedio) {
        super(idUsuario, nombreUsuario, correoUsuario, passwordUsuario, telefonoUsuario, imgUser);
        this.idTutor = idTutor;
        this.nombreTema = nombreTema;
        this.promedio = promedio;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public Tema getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(Tema nombreTema) {
        this.nombreTema = nombreTema;
    }

    @Override
    public Promedio getPromedio() {
        return promedio;
    }

    @Override
    public void setPromedio(Promedio promedio) {
        this.promedio = promedio;
    }
}
