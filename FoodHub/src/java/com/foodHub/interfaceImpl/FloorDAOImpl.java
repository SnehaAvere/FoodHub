/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.Floor;
import com.foodHub.interfaces.FloorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SNEHA
 */
public class FloorDAOImpl implements FloorDAO {
Connection con = DBconnection.getConnection();
    @Override
    public int addFloor(Floor flo) {
        int count=0;
        try {
            //return addEmployee(employee);
            
            PreparedStatement ps = con.prepareStatement("insert into floor(floor_Num) values(?)");
            
          
            ps.setInt(1,flo.getFloor_Num());
            count = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FloorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count; 
       }

    @Override
    public int deleteFloor(int floor_ID) {
         int count=0;
        try {
            
           
            PreparedStatement ps = con.prepareStatement("delete from floor where floor_ID=?");
            ps.setInt(1,floor_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
        }
    
}
