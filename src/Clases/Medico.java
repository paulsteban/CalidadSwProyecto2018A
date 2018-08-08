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


public class Medico {
    
    
public static ResultSet resultado;

public static void Agregar_Medico(String Nombre, String Apellido, int ID_Especialidad, String Cedula){

    
        try {

            PreparedStatement consulta = Conexion.con.prepareStatement("INSERT INTO `medico` (`Nombres`, `Apellidos`, `ID_Especialidad`,`cedula`) VALUES (?,?,?,?)");

           
                        consulta.setString(1, Nombre);
                        consulta.setString(2, Apellido);
                        consulta.setInt(3, ID_Especialidad);
                        consulta.setString(4, Cedula);
                       
                        
  
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Medico guardado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

     }   catch (SQLException ex) {     
      JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
  }



        

    }


public static void Actualizar_Medico(int ID, String Nombre, String Apellido, int ID_Especialidad,String Cedula){
   
    
    
        try {

        PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `medico` SET `Nombres` = ?, `Apellidos` = ?, `ID_Especialidad` = ?, `cedula` = ? WHERE `medico`.`ID_Medico` = ?");

                        
                        consulta.setString(1, Nombre);
                        consulta.setString(2, Apellido);
                        consulta.setInt(3, ID_Especialidad);
                        consulta.setString(4, Cedula);
                        consulta.setInt(5,ID);
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Medico Actualizados Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }
}
 
public static void Usuario_Medico(int ID_M, int ID_U, String Usuario){
  

    
    try{
        
               PreparedStatement consulta = Conexion.con.prepareStatement("{call UsuarioMedico (?,?)}");

               consulta.setInt(1, ID_M);
               consulta.setInt(2, ID_U);
               consulta.execute();
     JOptionPane.showMessageDialog(null,"Medico agregado con Nombre Usuario: "+Usuario,
             "Información",JOptionPane.INFORMATION_MESSAGE); 
            
            
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Desactivar_Medico(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("{call Desactivar_Medico (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Desactivado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
         
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Activar_Medico(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("{call Activar_Medico (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Activado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
        
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

}
