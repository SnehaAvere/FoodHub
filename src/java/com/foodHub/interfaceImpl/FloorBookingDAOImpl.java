/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.FloorBooking;
import com.foodHub.interfaces.FloorBookingDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SNEHA
 */
public class FloorBookingDAOImpl implements FloorBookingDAO {
Connection con = DBconnection.getConnection();
    @Override
    public int addBookFloor(FloorBooking floB) {
         int count=0;
        try {
            //return addEmployee(employee);
           
            PreparedStatement ps = con.prepareStatement("insert into floorBooking (floorBooking_Capacity,floorBooking_Event) values(?,?)");
            
            ps.setInt(1,floB.getFloorBooking_Capacity());
            ps.setString(2,floB.getFloorBooking_Event());
           
            count = ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
         }

    @Override
    public int deleteBookFloor(int floorBooking_ID) {
          int count=0;
        try {
            
           
            PreparedStatement ps = con.prepareStatement("delete from floorBooking where floorBooking_ID=?");
            ps.setInt(1,floorBooking_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
           
        }
        return count;
        }

    @Override
    public int updateFloorBooking(int floorBooking_ID, FloorBooking floB) {
        int count=0;
        try {
          
            PreparedStatement ps = con.prepareStatement("update floorBooking set floorBooking_Capacity=?, floorBooking_Event=? where floorBooking_ID=?");
           
            ps.setInt(1,floB.getFloorBooking_Capacity());
            ps.setString(2,floB.getFloorBooking_Event());
             ps.setInt(3,floB.getFloorBooking_ID());
            
            count=ps.executeUpdate();
        } catch (SQLException ex) {
           
        }
        return count;
    }}
        

    