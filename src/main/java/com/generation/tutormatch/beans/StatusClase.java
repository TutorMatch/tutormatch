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
public class StatusClase {
    private int idStatusClase;
    private String nameStatus;

    public StatusClase() {
    }

    public StatusClase(int idStatusClase, String nameStatus) {
        this.idStatusClase = idStatusClase;
        this.nameStatus = nameStatus;
    }

    /**
     * @return the idStatusClase
     */
    public int getIdStatusClase() {
        return idStatusClase;
    }

    /**
     * @param idStatusClase the idStatusClase to set
     */
    public void setIdStatusClase(int idStatusClase) {
        this.idStatusClase = idStatusClase;
    }

    /**
     * @return the nameStatus
     */
    public String getNameStatus() {
        return nameStatus;
    }

    /**
     * @param nameStatus the nameStatus to set
     */
    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }
    
    
    
}
