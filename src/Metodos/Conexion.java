/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jandr
 */
public class Conexion {
    
    public Connection getConexion(){
        Connection con=null;
        //la URL de mi base de datos
        String urlBD = "jdbc:postgresql://localhost:5432/Base";
        try{
            Class.forName("org.postgresql.Driver");
            // Se valida el nombre de la base y la contrasenia
            con = DriverManager.getConnection(urlBD,"postgres","1234");
        }catch(Exception exc){
              JOptionPane.showMessageDialog(null, exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

}
