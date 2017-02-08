/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Vector;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Felix-Geier
 */
public class Millionenshow extends JFrame {
    
    private Statement s;
    
    private JPanel mainP = new JPanel();
    private JLabel frage = new JLabel("123 TEssssssssssstfdasfdas");
    private JPanel antwortP = new JPanel();
    private JPanel sideP = new JPanel();
    
    private JLabel stufen = new JLabel();
    
    private Vector antworten = new Vector();
    
    public Millionenshow() {
        super("Wer wird Millionaer? - Die Millionenshow");
//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Millionenshow", "postgres", "1");
//            s = connection.createStatement();
            defineFrame();
            setVisible(true);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
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
        
        // Layout
        GridBagConstraints c;
        
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        mainP.add(frage, c);
        
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        mainP.add(antwortP, c);
        
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        sideP.setSize(150, height);
        mainP.add(sideP, c);
        
        c = new GridBagConstraints();
    }
    
    
}
