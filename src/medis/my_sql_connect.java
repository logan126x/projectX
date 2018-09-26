/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medis;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author KHSCI5MCA16126
 */
public class my_sql_connect {
    Connection con=null;
    public static Connection connectdb()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MEDIS","project","projectmedis");
        return con;
         }
        catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null,e);
                  return null;  
                }
   
}
}
