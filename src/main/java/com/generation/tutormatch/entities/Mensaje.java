package com.generation.tutormatch.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mensaje")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;

    private String mensaje;
    private Date hora;
    private Alumno idAlumno;
    private Tutor idTutor;
    public Mensaje() {
    }


    public Mensaje(String mensaje, Date hora, Alumno idAlumno, Tutor idTutor) {
        this.mensaje = mensaje;
        this.hora = hora;
        this.idAlumno = idAlumno;
        this.idTutor = idTutor;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
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
}
