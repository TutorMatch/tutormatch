package com.generation.tutormatch.entities;

import javax.persistence.*;

@Entity
@Table(name="pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    private String pregunta;
    private StatusClase nombreStatus;
    private Tema nombreTema;
    private Alumno idAlumno;
    private Tutor idTutor;
    private Conversacion idConversacion;


    public Pregunta() {}


    public Pregunta(String pregunta, StatusClase nombreStatus, Tema nombreTema, Alumno idAlumno, Tutor idTutor, Conversacion idConversacion) {
        this.pregunta = pregunta;
        this.nombreStatus = nombreStatus;
        this.nombreTema = nombreTema;
        this.idAlumno = idAlumno;
        this.idTutor = idTutor;
        this.idConversacion = idConversacion;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public StatusClase getNombreStatus() {
        return nombreStatus;
    }

    public void setNombreStatus(StatusClase nombreStatus) {
        this.nombreStatus = nombreStatus;
    }

    public Tema getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(Tema nombreTema) {
        this.nombreTema = nombreTema;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Tutor getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Tutor idTutor) {
        this.idTutor = idTutor;
    }

    public Conversacion getIdConversacion() {
        return idConversacion;
    }

    public void setIdConversacion(Conversacion idConversacion) {
        this.idConversacion = idConversacion;
    }
}
