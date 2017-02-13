/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Felix-Geier
 */
public class Gui extends JFrame implements ActionListener{
    JPanel mainP;
    JButton []antwortenB;
    JLabel frageL, stufeL;
    JButton joker;
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
        //x = ,y =;
        //inizialisieren
        for (int i = 0; i < 4; i++){
            new JButton();
            //antwortenB[i].setBounds(i, i, i, i);
            antwortenB[i].addActionListener(this);
            antwortenB[i].setVisible(true);
            antwortenB[i].setContentAreaFilled( false );
            antwortenB[i].setBorder( null );
            mainP.add(antwortenB[i]);
        }
        for (int i = 0; i < 4; i++){
            joker = new JButton();
        }
        mainP = new JPanel();    
        frageL = new JLabel();
        stufeL = new JLabel();
        
        // adden
        mainP.add(frageL);
        mainP.add(stufeL);
        
        //set Bounds
        frageL.setBounds(y, y, y, y);
        stufeL.setBounds(y, y, y, y);
        
        
        //größen und farben
    }
    
    public void setAnwtort(int index, String value) {
        antwortenB[index].setText(value);
    }
    public void setFrage(String value) {
        frageL.setText(value);
    }
    public void setStufe(int stufe){
        stufeL.setText("" + stufe);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 4 ; i++){
            if (antwortenB[i] == ae.getSource()){
                
            }
        }
    }
    
}
