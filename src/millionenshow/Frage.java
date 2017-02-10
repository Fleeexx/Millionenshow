/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionenshow;

import java.sql.*;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Felix-Geier
 */
public class Frage {
    
    Statement s;
    private int frage_id;
    private Vector antworten;
    private String frage;
    private Random r;
    
    public Frage(int stufe) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Millionenshow", "postgres", "1");
            s = connection.createStatement();
            getRndFrage(stufe);
            getFrageAntworten();
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void getFrageAntworten() throws SQLException {
        ResultSet rs = s.executeQuery("SELECT antwort.antwort, antwort.richtig_oder_falsch FROM antwort, frage WHERE antwort.f_id = " + frage_id);
        while (rs.next()) {
            antworten.add(new Antwort(rs.getString(1), rs.getBoolean(2)));
        }
    }
    
    private void getRndFrage(int stufe) throws SQLException {
        ResultSet rs = s.executeQuery("SELECT count(stufe) FROM frage WHERE stufe = " + stufe);
        rs.next();
        int anzahl = rs.getInt(1);
        int rnd = getRnd(anzahl);
        rs = s.executeQuery("SELECT f_id, frage FROM frage WHERE stufe = " + stufe);
        for (int i = 0; i < anzahl; i++) {
            rs.next();
            if (i == rnd) {
                frage_id = rs.getInt(1);
                frage = rs.getString(2);
                break;
            }
        }
    }
    
    private int getRnd(int count) {
        r = new Random();
        return r.nextInt(count);
    }
    
    public String getFrage() {
        return this.frage;
    }
    
    public Vector getAntworten() {
        return this.antworten;
    }
    
}
