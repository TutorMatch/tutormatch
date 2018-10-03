/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutormatch.beans;

/**
 *
 * @author hiromiakita
 */
public class Calificacion {
    private int idGrade;
    private int grade;
    private String emisor;
    private String receptor;

    public Calificacion() {
    }

    public Calificacion(int idGrade, int grade, String emisor, String receptor) {
        this.idGrade = idGrade;
        this.grade = grade;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    /**
     * @return the idGrade
     */
    public int getIdGrade() {
        return idGrade;
    }

    /**
     * @param idGrade the idGrade to set
     */
    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the emisor
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * @param emisor the emisor to set
     */
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    /**
     * @return the receptor
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * @param receptor the receptor to set
     */
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
    
    
    
   
    
}
