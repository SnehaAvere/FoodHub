/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.Order;
import com.foodHub.interfaces.OrderDAO;
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
public class OrderDAOImpl implements OrderDAO {
Connection con = DBconnection.getConnection();
    @Override
    public int addOrder(Order Ord) {
        int count=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into order1 (order_Status,order_Time,order_Date,bill_No,order_Total) values (?,?,?,?,?)");
            
            ps.setString(1, Ord.getorder_Status());
            ps.setInt(2,Ord.getorder_time());
             java.util.Date order_Date = new java.util.Date(Ord.getorder_Date());
            ps.setDate(3,new Date(order_Date.getYear(),order_Date.getMonth(),order_Date.getDate()));
            ps.setInt(4, Ord.getBill_No());
            ps.setInt(5, Ord.getOrder_Total());
           
           count = ps.executeUpdate(); 
         
            System.out.println("order Added successfully");
        } catch (Exception e) {
           
            System.out.println("order does not added");
            System.out.println(e.getMessage());
            
        }
        return 0;
         }

    @Override
    public int deleteOrder(int order_ID) {
        int count=0;
        try {
            
            
            PreparedStatement ps = con.prepareStatement("delete from order1 where order_ID=?");
            ps.setInt(1,order_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
        }

    

    @Override
    public int updateOrder(int order_ID, Order Ord) {
         int count=0;
        try {
          
            PreparedStatement ps = con.prepareStatement("update order1 set order_Status=?,order_Time=?,order_Date=?,bill_No=?,order_Total=? where order_ID=?");
       
            ps.setString(1, Ord.getorder_Status());
            ps.setInt(2,Ord.getorder_time());
             java.util.Date order_Date = new java.util.Date(Ord.getorder_Date());
            ps.setDate(3,new Date(order_Date.getYear(),order_Date.getMonth(),order_Date.getDate()));
            ps.setInt(4, Ord.getBill_No());
            ps.setInt(5, Ord.getOrder_Total());
             ps.setInt(6, Ord.getorder_ID());
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
        }  
}
