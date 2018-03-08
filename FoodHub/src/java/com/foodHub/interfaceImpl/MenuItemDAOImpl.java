/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.MenuItem;
import com.foodHub.interfaces.MenuItemDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SNEHA
 */
public class MenuItemDAOImpl implements MenuItemDAO {
    Connection con = DBconnection.getConnection();

    @Override
    public int addMenuItem(MenuItem menu) {
        int count=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into menuItem (menuItem_Name,menuItem_Price,menuItem_Stoke) values (?,?,?)");
            ps.setInt(1, menu.getMenuItem_ID());
            ps.setString(2, menu.getMenuItem_Name());
            ps.setInt(3, menu.getMenuItem_Price());
            ps.setInt(4, menu.getMenuItem_Stoke());
           
           
           count = ps.executeUpdate();
         
            System.out.println("menuItem Added successfully");
        } catch (Exception e) {
           
            System.out.println("menuItem does not added");
            System.out.println(e.getMessage());
           
        }
         return 0;
        }

    @Override
    public int deleteMenuItem(int menuItem_ID) {
         int count=0;
        try {
            
            
            PreparedStatement ps = con.prepareStatement("delete from menuItem where menuItem_ID=?");
            ps.setInt(1,menuItem_ID);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MenuItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
         }

    @Override
    public int updateMenuItem(int menuItem_ID, MenuItem menu) {
          int count=0;
        try {
            
            PreparedStatement ps = con.prepareStatement("update menuItem set menuItem_Name=?, menuItem_Price=?, menuItem_Stoke=?  where menuItem_ID=?");
           
            ps.setString(1,menu.getMenuItem_Name());
            ps.setInt(2,menu.getMenuItem_Price());
            ps.setInt(3, menu.getMenuItem_Stoke());
             ps.setInt(4,menu.getMenuItem_ID());
            count=ps.executeUpdate();
        } catch (SQLException ex) {
           
        }
        return count;
    }
        }
    

