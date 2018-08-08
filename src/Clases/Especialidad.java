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


public class Especialidad {

    public static ResultSet resultado;

    public static void Agregar_Especialidad(String Nombre, String Descripcion) {

        try {
            
            PreparedStatement consulta = Conexion.con.prepareStatement("INSERT INTO `especialidad` (`Nombre`, `Descripcion`) VALUES (?,?)");

            consulta.setString(1, Nombre);
            consulta.setString(2, Descripcion);

            consulta.execute();

            JOptionPane.showMessageDialog(null, "Datos de la Especialidad guardado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void Actualizar_Especialidad(int ID, String Nombre, String Descripcion) {

        try {

            PreparedStatement consulta = Conexion.con.prepareStatement("UPDATE `especialidad` SET `Nombre` = ?, `Descripcion` = ? WHERE `ID_Especialidad` = ?");

                System.out.println(ID+" "+Nombre+" "+Descripcion);
            consulta.setString(1, Nombre);
            consulta.setString(2, Descripcion);
            consulta.setInt(3, ID);

            consulta.execute();

            JOptionPane.showMessageDialog(null, "Datos de La Especialidad Actualizados Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

 
    public static void Activar_Especialidad(int ID) {

        try {

            CallableStatement consulta = Conexion.con.prepareCall("UPDATE `especialidad` SET `Estado` = 1 WHERE `especialidad`.`ID_Especialidad` = ?");

            consulta.setInt(1, ID);
            consulta.execute();
      JOptionPane.showMessageDialog(null,"Activado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void Desactivar_Especialidad(int ID) {

        try {

            CallableStatement consulta = Conexion.con.prepareCall("UPDATE `especialidad` SET `Estado` = 0 WHERE `especialidad`.`ID_Especialidad` = ?");

            consulta.setInt(1, ID);
            consulta.execute();
      JOptionPane.showMessageDialog(null,"Desactivado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
