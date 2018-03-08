/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.Table;
import com.foodHub.interfaces.TableDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SNEHA
 */
public class TableDAOImpl implements TableDAO {
Connection con = DBconnection.getConnection();
    @Override
    public int addTable(Table tab) {
          int count=0;
        try {
            //return addEmployee(employee);
            
            PreparedStatement ps = con.prepareStatement("insert into table1(table_Numbers) values(?)");
           
            ps.setInt(1,tab.getTable_Numbers());
            
            count = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;   }

    @Override
    public int deleteTable(int table_ID) {
       int count=0;
        try {
            
           
            PreparedStatement ps = con.prepareStatement("delete from table1 where table_ID=?");
            ps.setInt(1,table_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;  }
   
    
}
