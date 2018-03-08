/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Customer;
import java.util.List;

/**
 *
 * @author SNEHA
 */
public interface CustomerDAO {
    int addCustomer(Customer cust);
   int deleteCustomer(int customer_ID);
   int updateCustomerProfile(int customer_ID, Customer cust);
   public List<Customer> getAllCustomers();
   public Customer getcustomerByID(int customer_ID);
   int updateCust(int customer_ID, Customer cust);
   boolean isUserLogin(int customer_ID, String customer)
    
}
