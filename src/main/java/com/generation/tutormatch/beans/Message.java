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
public class Message {
    private int idMessage;
    private String message;
    private int hour;

    public Message() {
    }

    public Message(int idMessage, String message, int hour) {
        this.idMessage = idMessage;
        this.message = message;
        this.hour = hour;
    }

    /**
     * @return the idMessage
     */
    public int getIdMessage() {
        return idMessage;
    }

    /**
     * @param idMessage the idMessage to set
     */
    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
    
}
