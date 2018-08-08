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

public class Paciente {
    
    
public static ResultSet resultado;

public static void Agregar_Paciente(String Nombre, String Apellido, float Peso, float Altura,
        int Edad, String Alergias, String Enfermedades, String TipoSangre, String Telefono, String Mail, String Genero, String Cedula, String Direccion){

    
        try {

            PreparedStatement consulta = Conexion.con.prepareStatement("INSERT INTO `paciente` (`Nombres`, `Apellidos`, `Peso`, `Altura`, `Edad`, `Telefono`, `Alergias`, `Enfermedades`, `Tipo_Sangre`, `Mail`, `Genero`, `Cedula`, `Direccion`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");

           
                        consulta.setString(1, Nombre);
                        consulta.setString(2, Apellido);
                        consulta.setFloat(3, Peso);
                        consulta.setFloat(4, Altura);
                        consulta.setInt(5, Edad);
                        consulta.setString(6, Telefono);
                        consulta.setString(7, Alergias);
                        consulta.setString(8, Enfermedades);
                        consulta.setString(9, TipoSangre);
                        
                        consulta.setString(10,Mail);
                        consulta.setString(11,Genero);
                        consulta.setString(12,Cedula);
                        consulta.setString(13,Direccion);
                        
                        
  
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Paciente guardado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

     }   catch (SQLException ex) {     
      JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
  }



        

    }


public static void Actualizar_Paciente(int ID, String Nombre, String Apellido, float Peso, float Altura,
        int Edad, String Alergias, String Enfermedades, String TipoSangre, String Telefono, String Mail, String Genero, String Cedula, String Direccion){
   
    
    
        try {

        PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `paciente` SET `Nombres` = ?, `Apellidos` = ?, `Peso` = ?, `Altura` = ?, `Edad` = ?, `Telefono` = ?, `Alergias` = ?, "
                + "                                                    `Enfermedades` = ?, `Tipo_Sangre` = ?, `Mail` = ?, `Genero` = ?, `Cedula` = ?, `Direccion` = ? WHERE `paciente`.`ID_Paciente` = ?");

                        
                        
                        consulta.setString(1, Nombre);
                        consulta.setString(2, Apellido);
                        consulta.setFloat(3, Peso);
                        consulta.setFloat(4, Altura);
                        consulta.setInt(5, Edad);
                        consulta.setString(6, Telefono);
                        consulta.setString(7, Alergias);
                        consulta.setString(8, Enfermedades);
                        consulta.setString(9, TipoSangre);
                        
                        consulta.setString(10,Mail);
                        consulta.setString(11,Genero);
                        consulta.setString(12,Cedula);
                        consulta.setString(13,Direccion);
                        consulta.setInt(14,ID);
                       

                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Paciente Actualizados Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }
}

public static void Activar_Paciente(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("UPDATE `paciente` SET `Estado` = 1 WHERE `paciente`.`ID_Paciente` = ?");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Activado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
            
            
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Desactivar_Paciente(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("UPDATE `paciente` SET `Estado` = 0 WHERE `paciente`.`ID_Paciente` = ?");

               consulta.setInt(1, ID);
               consulta.execute();
     JOptionPane.showMessageDialog(null,"Desactivado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
         
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

}
