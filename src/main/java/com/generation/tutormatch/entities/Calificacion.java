package com.generation.tutormatch.entities;

import javax.persistence.*;

@Entity
@Table(name="calificacion")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;

    private int calificacion;
    private Tutor idTutor;
    private Alumno idAlumno;


    public Calificacion(){}

    public Calificacion(int calificacion, Tutor idTutor, Alumno idAlumno) {
        this.calificacion = calificacion;
        this.idTutor = idTutor;
        this.idAlumno = idAlumno;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Tutor getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Tutor idTutor) {
        this.idTutor = idTutor;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "idCalificacion=" + idCalificacion +
                ", calificacion=" + calificacion +
                ", idTutor=" + idTutor +
                ", idAlumno=" + idAlumno +
                '}';
    }
}


