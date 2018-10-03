/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutormatch.beans;

import java.sql.Blob;

/**
 *
 * @author hiromiakita
 */
public class Student {
    private int idUser;
    private String nameUser;
    private String emailUser;
    private String passUser;
    private int telUser;
    Blob imgUser;
    
    public Student(){}

    public Student(int idUser, String nameUser, String emailUser, String passUser, int telUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passUser = passUser;
        this.telUser = telUser;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the nameUser
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * @param nameUser the nameUser to set
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    /**
     * @return the emailUser
     */
    public String getEmailUser() {
        return emailUser;
    }

    /**
     * @param emailUser the emailUser to set
     */
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * @return the passUser
     */
    public String getPassUser() {
        return passUser;
    }

    /**
     * @param passUser the passUser to set
     */
    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    /**
     * @return the telUser
     */
    public int getTelUser() {
        return telUser;
    }

    /**
     * @param telUser the telUser to set
     */
    public void setTelUser(int telUser) {
        this.telUser = telUser;
    }
    
    
    
    
}
