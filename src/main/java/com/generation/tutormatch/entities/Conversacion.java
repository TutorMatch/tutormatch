package com.generation.tutormatch.entities;

import javax.persistence.*;

@Entity
@Table(name="conversacion")
public class Conversacion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idConversacion;
        private Mensaje idMensaje;


        public Conversacion() {}

        public Conversacion(int idConversacion, Mensaje idMensaje) {

            this.idConversacion = idConversacion;
            this.idMensaje = idMensaje;
        }

        public int getIdConversacion() {
            return idConversacion;
        }

        public void setIdConversacion(int idConversacion) {
            this.idConversacion = idConversacion;
        }

        public Mensaje getIdMensaje() {
            return idMensaje;
        }

        public void setIdMensaje(Mensaje idMensaje) {
            this.idMensaje = idMensaje;
        }

    }


