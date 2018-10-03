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
public class Conversation {
    private int idConversation;

    public Conversation() {
    }

    public Conversation(int idConversation) {
        this.idConversation = idConversation;
    }

    /**
     * @return the idConversation
     */
    public int getIdConversation() {
        return idConversation;
    }

    /**
     * @param idConversation the idConversation to set
     */
    public void setIdConversation(int idConversation) {
        this.idConversation = idConversation;
    }
    
    
    
}
