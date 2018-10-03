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
public class Tutor extends Student{
    private int idTutor;

    public Tutor() {
    }

    public Tutor(int idTutor) {
        this.idTutor = idTutor;
    }

    /**
     * @return the idTutor
     */
    public int getIdTutor() {
        return idTutor;
    }

    /**
     * @param idTutor the idTutor to set
     */
    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }
    
    
    
}
