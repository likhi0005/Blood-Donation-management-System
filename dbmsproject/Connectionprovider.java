/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproject;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class Connectionprovider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodBankManagement","root","tiger");
            return conn;
        }
        catch(Exception e)
        {
           return null;
        }
    }

    public static Connection ConnecrDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
