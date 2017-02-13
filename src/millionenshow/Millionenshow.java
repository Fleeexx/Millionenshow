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
    private int geld, geldstufe;
    private Frage frage;
    private Vector antworten = new Vector();
    private boolean richtig;
    String frageLabel;
    int stufe;
    
    
    public Millionenshow() {
        geld = 0;
        geldstufe = 0;
        stufe = 1;
        stufe();
        fragenHolen();
    }
    public void fragenHolen(){
        
        
        if(richtig){
            stufe++;
            geld = geld + geldstufe;
            //geldstufe =
        }
        
    }
    public void stufe(){
        frage = new Frage(stufe);
        frageLabel = frage.getFrage();
        antworten = frage.getAntworten();
    }
    public void musik(){
        
    }
}
