package Clases;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
public static Connection con;
public static Statement state,state1;
public static ResultSet result,result1;

public void Conectar(String user,String pass)throws SQLException,ClassNotFoundException
{  
    
//    try {
            // Get connection
            
            DriverManager.registerDriver( new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10241932",user, pass);
    
    state=con.createStatement(result.TYPE_SCROLL_SENSITIVE,result.CONCUR_UPDATABLE);

}//fin del constructor
 public static ResultSet consulta(String sql)throws SQLException{

        state1 = (Statement) con.createStatement();
        result1 = state1.executeQuery(sql);//aqui hago consultas y devuelvo los resultados
        return result1;
}
 
 
         }
