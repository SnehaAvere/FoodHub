/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.MenuItem;

/**
 *
 * @author SNEHA
 */
public interface MenuItemDAO {
    int addMenuItem(MenuItem menu);
   int deleteMenuItem(int menuItem_ID);
   public int updateMenuItem(int menuItem_ID, MenuItem menu);
    
}
