/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author eljul
 */
public class Conexion {
    public static Connection cn;
    public static Statement st;
    public static ResultSet rs;
    
    public static void Conectar(){
        try {
            String url = "jdbc:oracle:thin:@localhost:1522:ORCL";
            cn = DriverManager.getConnection(url, "Bases2", "Maxito15");
            st = cn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexion, error: \n" + e.getMessage());
        }
    }
}
