/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class javaConnect {
    static Connection conn =  null;
    static ResultSet rs;
    static PreparedStatement pst;
    
    public static Connection ConnectDb(){
        try{
            //CONNECT TO THE DATABASE
            Class.forName("com.mysql.cj.jdbc.Driver");
            String host = "jdbc:mysql://localhost:3306/ems_database";
            String username = "root";
            String password = "";
            
            conn = DriverManager.getConnection(host, username, password);
            return conn;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }   
    }
}


