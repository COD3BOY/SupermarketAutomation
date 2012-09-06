/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SupermarketAutomation;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author student
 */
class DBConnection {
    
    static Connection con = null;
    static Statement stmt = null;
    private ResultSet rs = null;
    //private InetAddress Adds = null;
   // private String computerIP = null;

    /**
     * Creates a new instance of DBConnection
     */
    public DBConnection() {
    }

    public Connection DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails","root","mysql");
            stmt = (Statement) con.createStatement();
          
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

    
}
