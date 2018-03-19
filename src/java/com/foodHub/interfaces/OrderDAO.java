/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Order;

/**
 *
 * @author SNEHA
 */
public interface OrderDAO {
int addOrder(Order Ord);
 int deleteOrder(int order_ID);
 
 public int updateOrder(int order_ID, Order Ord);
 
 
    
}
