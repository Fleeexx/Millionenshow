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
    //       try{
//            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Millionenshow", "postgres", "1");
//            s = connection.createStatement();
//            //select * from schwierigkeitsstufe;
//            ResultSet rs = s.executeQuery("Select * from schwierigkeitsstufe");
//            while(rs.next()){
//                String s1 = rs.getString(1);
//                String s2 = rs.getString(2);
//                String s3 = rs.getString(3);
//                System.out.print(s1+"\t" +s2+"\t" +s3+"\t");
//            }
//            int id;
//             ResultSet rs1 = s.executeQuery("select frage.frage, frage.f_id from frage, schwierigkeitsstufe as s where frage.s_id = s.s_id");
//            while(rs1.next()){
//                String s1 = rs1.getString(1);
//                id = rs1.getInt(2);
//                System.out.print(s1);
//            }
//            ResultSet rs2 = s.executeQuery("select antwort.antwort, antwort.richtig_oder_falsch from antwort, frage where antwort.a_id = " + id + "");
//            while(rs2.next()){
//                String s1 = rs2.getString(1);
//                String s2 = rs2.getString(2);
//                System.out.print(s1 + " " + s2 + "\t");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    //select frage.frage from frage, schwierigkeitsstufe as s where frage.s_id = s.s_id; 
}
