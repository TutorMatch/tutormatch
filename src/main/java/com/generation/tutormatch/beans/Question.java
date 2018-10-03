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
public class Question {
    private int idQuestion;
    private String question;

    public Question() {
    }

    public Question(int idQuestion, String question) {
        this.idQuestion = idQuestion;
        this.question = question;
    }

    /**
     * @return the idQuestion
     */
    public int getIdQuestion() {
        return idQuestion;
    }

    /**
     * @param idQuestion the idQuestion to set
     */
    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    
    
    
    
}
