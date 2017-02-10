/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

/**
 *
 * @author Felix-Geier
 */
public class Antwort {
    
    private String antwort;
    private Boolean correct;
    
    public Antwort(String antwort, Boolean correct) {
        this.antwort = antwort;
        this.correct = correct;
    }
    
    public String getAntwort() {
        return this.antwort;
    }
    
    public Boolean isCorrect() {
        return this.correct;
    }
    
}
