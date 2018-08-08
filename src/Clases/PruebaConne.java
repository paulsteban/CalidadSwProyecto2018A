/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Kevin
 */
public class PruebaConne {
    PasswordAuthentication seg = new PasswordAuthentication();
    public static void main(String[] args) {
        
        try
{
Class.forName("com.mysql.jdbc.Driver");
    Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10241932","sql10241932", "QZNg66bWXK");
System.out.print("Database is connected !");

conn.close();
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
}
}
        
        
    
    
    
}
