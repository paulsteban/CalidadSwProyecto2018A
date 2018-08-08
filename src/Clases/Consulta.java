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


public class Consulta {
    
    
public static ResultSet resultado;

public static void Agregar_Consulta(int ID_Cita, String Consulta, String Diagnostico, String Receta){

    
        try {

        CallableStatement consulta = Conexion.con.prepareCall("{call AgregarConsulta (?,?,?,?)}");

           
                        consulta.setInt(1, ID_Cita);
                        consulta.setString(2, Consulta);
                        consulta.setString(3, Diagnostico);
                        consulta.setString(4, Receta);
                        
  
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos de la Consulta guardado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

     }   catch (SQLException ex) {     
      JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
  }



        

    }


public static void Actualizar_Consulta(int ID, String Consulta, String Diagnostico, String Receta){
   
    
    
        try {

        CallableStatement consulta = Conexion.con.prepareCall("{call ModificarConsulta (?,?,?,?) }");

                        consulta.setInt(1, ID);
                        consulta.setString(2, Consulta);
                        consulta.setString(3, Diagnostico);
                        consulta.setString(4, Receta);
                        
                       

                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos de La Consulta Actualizados Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }
}
public static void Activar_Consulta(int ID){
  

    
    try{
        
               PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `especialidad` SET `Estado` = 1 WHERE `especialidad`.`ID_Especialidad` = ?");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Activada Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
            
            
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Desactivar_Consulta(int ID){
    
    try{
        
               PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `especialidad` SET `Estado` = 0 WHERE `especialidad`.`ID_Especialidad` = ?");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Desactivada Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
         
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

}
