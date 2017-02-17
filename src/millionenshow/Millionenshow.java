/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import java.util.Vector;
/**
 *
 * @author Felix-Geier
 */
public class Millionenshow {
    private int geld;
    private int[] geldstufe;
    private Frage frage;
    private Vector<Antwort> antworten = new Vector();
    private boolean richtig;
    String frageLabel;
    int stufe;
    
    
    public Millionenshow() {
        geld = 0;
        geldstufe = new int[] {100, 200, 300, 400, 500, 1000, 2000, 5000, 10000, 15000, 30000, 75000, 150000, 300000, 1000000};
        stufe = 0;
        getNeueFrage();
    }
    
    public Boolean antwortUeberprufen (int i) {
        
        if (antworten.elementAt(i).isCorrect()) {
            geld = geld + geldstufe[stufe];
            stufe++;
            return true;
        } else {
            if (geldstufe[stufe] > 15000){
                geld = 15000;
            } else if (geldstufe[stufe] > 500){
                geld = 500;
            } else {
                geld = 0;
            }
            return false;
        }
        
    }
    
    public int getStufe() {
        return stufe;
    }
    
    public Frage getNeueFrage() {
        return new Frage(stufe);
    }
    
    private void musik(){
        
    }
}
