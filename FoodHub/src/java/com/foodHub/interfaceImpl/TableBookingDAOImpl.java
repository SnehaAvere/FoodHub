/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;


import com.foodHub.entities.TableBooking;
import com.foodHub.interfaces.TableBookingDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SNEHA
 */
public class TableBookingDAOImpl implements TableBookingDAO  {
 Connection con = DBconnection.getConnection();
    @Override
    public int addBookTable(TableBooking tabb) {
         int count=0;
        try {
            //return addEmployee(employee);
           
            PreparedStatement ps = con.prepareStatement("insert into tableBooking(tableBooking_Num,tableBooking_Date,tableBooking_Time) values(?,?,?)");
          
            ps.setInt(1,tabb.getTableBooking_Num());
            java.util.Date tableBooking_Date = new java.util.Date(tabb.getTableBooking_Date());
            ps.setDate(2,new Date(tableBooking_Date.getYear(),tableBooking_Date.getMonth(),tableBooking_Date.getDate()));
            ps.setInt(3,tabb.getTableBooking_Time());
            
            count = ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
          }

    @Override
    public int deletebookedtable(int tableBooking_ID) {
          int count=0;
        try {
            
           
            PreparedStatement ps = con.prepareStatement("delete from tableBooking where tableBooking_ID=?");
            ps.setInt(1,tableBooking_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
        }

    @Override
    public int updatetabelBooking(int tableBooking_ID, TableBooking tabb) {
         int count=0;
        try {
          
            PreparedStatement ps = con.prepareStatement("update tableBooking set tableBooking_Num=?,tableBooking_Date=?,tableBooking_Time=? where tableBooking_ID=?");
           
            ps.setInt(1,tabb.getTableBooking_Num());
            java.util.Date tableBooking_Date = new java.util.Date(tabb.getTableBooking_Date());
            ps.setDate(2,new Date(tableBooking_Date.getYear(),tableBooking_Date.getMonth(),tableBooking_Date.getDate()));
            ps.setInt(3,tabb.getTableBooking_Time());
              ps.setInt(4,tabb.getTableBooking_ID());
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
         }
 

