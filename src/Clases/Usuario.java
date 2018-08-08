/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jvnet.substance.fonts.Fonts;


public class Usuario {
    
    
public static ResultSet resultado;
private static PasswordAuthentication seg=new PasswordAuthentication();

public static void Agregar_Usuario(String Nombre, String Contrasena, String Rol){

    
        try {

            PreparedStatement consulta = Conexion.con.prepareStatement("INSERT INTO `usuario` (`Nombre_Usuario`, `Contrasena_Usuario`, `Rol_Usuario`) VALUES (?,?,?)");

                        consulta.setString(1, Nombre);
                        consulta.setString(2,seg.hashing(Contrasena));
                        consulta.setString(3, Rol);    
  
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Usuario guardado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

     }   catch (Exception ex) {     
      JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
  }

     

    }


public static void Actualizar_Usuario(int ID, String Nombre, String Contrasena, String Rol){
   
    
    
        try {

        PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `usuario` SET `Nombre_Usuario` = ?, `Contrasena_Usuario` = ?, `Rol_Usuario` = ? WHERE `usuario`.`ID_Usuario` = ?");

                        
                        consulta.setString(1, Nombre);
                        consulta.setString(2, seg.hashing(Contrasena));
                        consulta.setString(3, Rol);  
                        consulta.setInt(4,ID);
       
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Usuario Actualizados Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {

        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }
}
 
public static void Activar_Usuario(int ID){
  

    
    try{
        
               PreparedStatement consulta = Conexion.con.prepareStatement("{call Activar_Usuario (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Activado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
            
            
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Desactivar_Usuario(int ID){
  

    
    try{
        
               PreparedStatement consulta = Conexion.con.prepareStatement("{call Desactivar_Usuario (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Desactivado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
         
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

}
