package com.generation.tutormatch.entities;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private String nombreUsuario;
    private String correoUsuario;
    private String passwordUsuario;
    private int telefonoUsuario;
    private Blob imgUser;
    @OneToOne
    private Promedio promedio;


    public Alumno() {}

    public Alumno(int idUsuario, String nombreUsuario, String correoUsuario, String passwordUsuario, int telefonoUsuario, Blob imgUser) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.passwordUsuario = passwordUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.imgUser = imgUser;
        this.promedio = promedio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public Blob getImgUser() {
        return imgUser;
    }

    public void setImgUser(Blob imgUser) {
        this.imgUser = imgUser;
    }

    public Promedio getPromedio() {
        return promedio;
    }

    public void setPromedio(Promedio promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", correoUsuario='" + correoUsuario + '\'' +
                ", passwordUsuario='" + passwordUsuario + '\'' +
                ", telefonoUsuario=" + telefonoUsuario +
                ", imgUser=" + imgUser +
                '}';
    }
}
