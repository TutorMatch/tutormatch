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
public class Topic {
    private int idTopic;
    private String nameTopic;

    public Topic() {
    }

    public Topic(int idTopic, String nameTopic) {
        this.idTopic = idTopic;
        this.nameTopic = nameTopic;
    }

    /**
     * @return the idTopic
     */
    public int getIdTopic() {
        return idTopic;
    }

    /**
     * @param idTopic the idTopic to set
     */
    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    /**
     * @return the nameTopic
     */
    public String getNameTopic() {
        return nameTopic;
    }

    /**
     * @param nameTopic the nameTopic to set
     */
    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
    }
    
    
    
    
}
