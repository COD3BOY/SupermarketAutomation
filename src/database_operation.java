/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;



/**
 *
 * @author Reshma
 */


public class database_operation {

Connection con=null;
Statement stmt;
ResultSet rs;
//ResultSet rs;
public void DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","mysql");
            stmt = con.createStatement();
            } catch (Exception ex) {
            ex.printStackTrace();
            }
            }
            public void select_data() throws SQLException
            {
            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from user "); 
            while(results.next()){
            String user = results.getString("username");
            String phone =  results.getString("phone");

            System.out.println("data from database "+user);
            System.out.println("data from database "+phone);
            
           
            }
           }
            public void add_user() throws SQLException
            {
            String user="vinod";
            String pass="54163";
                
           stmt=con.createStatement();
           String sql2 ="INSERT INTO USER(username,phone)VALUES('"+user+"','"+pass+"')";
           stmt.executeUpdate(sql2);
           JOptionPane.showMessageDialog(null,"user added");
           }
           public static void main(String args[]) throws SQLException
            {
            
            try
            {
                
                
                
            }
            catch(Exception e)
            {
              System.out.println(e);  
                  }
            
            database_operation db=new database_operation();
            db.DBConnect();
            db.select_data();
            db.add_user();
            
            }
            
            
        }
  
         


