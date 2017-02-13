/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Felix-Geier
 */
public class Gui extends JFrame {
    
    public Gui() {
        super("Wer wird Millionaer? - Die Millionenshow");
    }
    
    private void defineFrame() { // 1.
        
        // Holt sich Bildschirmgröße
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        
        int x, y, width, height;
        width = 500;
        height = 400;
        
        // Berechnet Bildschirmmittelpunkt - Fenstergröße
        x = (int) ((d.getWidth() - width) / 2);
        y = (int) ((d.getHeight()- height) / 2);
        
        // Setzt Fensterposition
        setBounds(x, y, width, height);
        
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Hauptpanel hinzufügen
        add(mainP);
    }
    
}
