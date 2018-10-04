package com.generation.tutormatch.entities;

import javax.persistence.*;

@Entity
@Table(name="statusClase")
public class StatusClase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatusClase;

    private String nombreStatus;

    public StatusClase() {
    }

    public StatusClase(int idStatusClase, String nombreStatus) {
        this.idStatusClase = idStatusClase;
        this.nombreStatus = nombreStatus;
    }

    public int getIdStatusClase() {
        return idStatusClase;
    }

    public void setIdStatusClase(int idStatusClase) {
        this.idStatusClase = idStatusClase;
    }

    public String getNombreStatus() {
        return nombreStatus;
    }

    public void setNombreStatus(String nombreStatus) {
        this.nombreStatus = nombreStatus;
    }
}
