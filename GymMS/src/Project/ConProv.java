/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */       
package Project;

import java.sql.*;
/**
 *
 * @author Dell
 */
public class ConProv {
    public static Connection Getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/GMS","root","sep29AAK#");
            return con1;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
