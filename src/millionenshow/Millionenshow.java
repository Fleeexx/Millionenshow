/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import javax.swing.JFrame;
import java.sql.*;
/**
 *
 * @author Felix-Geier
 */
public class Millionenshow extends JFrame {
    
    Statement s;
    
    public Millionenshow() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Millionenshow", "postgres", "1");
        s = connection.createStatement();
        
    }
    
    
    
    
}
