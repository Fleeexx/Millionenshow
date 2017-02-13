package millionenshow;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Random;
import java.util.Vector;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Placeholder {
    
    
    
        public Placeholder(){
           try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Millionenshow", "postgres", "1");
               Statement s = connection.createStatement();
            //select * from schwierigkeitsstufe;
            int id = 1;
            ResultSet rs = s.executeQuery("select count(stufe) from frage where stufe = " + id );
            rs.next();
            System.out.println(rs.getInt(1));
            int e = rs.getInt(1);
            rs.close();
            Random r = new Random();
            e = r.nextInt(e)+ 1;
            ResultSet rs1 = s.executeQuery("select frage, f_id from frage where stufe = " + id);
            int frage;
            while(rs1.next()){
                String s1 = rs1.getString(1);
                id = rs1.getInt(2);
                System.out.print(s1);
            }
            ResultSet rs2 = s.executeQuery("select antwort.antwort, antwort.richtig_oder_falsch from antwort, frage where antwort.f_id = " + frage + "");
            while(rs2.next()){
                String s1 = rs2.getString(1);
                String s2 = rs2.getString(2);
                System.out.print(s1 + " " + s2 + "\t");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //select frage.frage from frage, schwierigkeitsstufe as s where frage.s_id = s.s_id; 
}
