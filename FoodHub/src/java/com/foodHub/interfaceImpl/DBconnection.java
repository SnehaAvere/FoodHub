/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author SNEHA
 */
public class DBconnection {
     public static Connection getConnection(){
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ","system","sneha");
            System.out.println("Connection Successful");
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            ex.printStackTrace();
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
