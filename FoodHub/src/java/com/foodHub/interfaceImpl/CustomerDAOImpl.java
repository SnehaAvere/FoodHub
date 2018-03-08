/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;
import com.foodHub.entities.Customer;
import com.foodHub.interfaces.CustomerDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SNEHA
 */
public class CustomerDAOImpl implements CustomerDAO{
Connection con = DBconnection.getConnection();
    @Override
    public int addCustomer(Customer cust) {
        int count=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into customer (customer_Fname,customer_Lname,customer_Address,customer_DOB,customer_EmailID,customer_PhoneNo,customer_LoginID,customer_Password) values (?,?,?,?,?,?,?,?)");
           
            ps.setString(1, cust.getCustomer_Fname());
            ps.setString(2, cust.getCustomer_Lname());
            ps.setString(3, cust.getCustomer_Address());
            java.util.Date customer_DOB = new java.util.Date(cust.getCustomer_DOB());
            ps.setDate(4,new Date(customer_DOB.getYear(),customer_DOB.getMonth(),customer_DOB.getDate()));
            ps.setString(5, cust.getCustomer_EmailID());
            ps.setString(6, cust.getCustomer_PhoneNo());
            ps.setString(7, cust.getCustomer_LoginID());
            ps.setString(8, cust.getCustomer_Password());
            ps.execute(); 
         
            System.out.println("customer Added successfully");
        } catch (Exception e) {
           
            System.out.println("customer does not added ");
            System.out.println(e.getMessage());
           
        }
         return 0;
    }

  //  @Override
   // public int loginCustomer(int customer_ID, String customer_Password) {
   //     }

    @Override
    public int deleteCustomer(int customer_ID) {
        
         int count=0;PreparedStatement ps=null;
        
        try {
            ps = con.prepareStatement("DELETE FROM CUSTOMER WHERE customer_ID = ?");
            try {
            ps.setInt(1,customer_ID );
            System.out.println("First ps "+ps.executeUpdate());
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread Sleep error:\n"+ex.getMessage());
        }
           
            
            
        } catch (SQLException ex) {
            System.out.println("Failed To Delete \n"+ex.getMessage());
        }
        return 0;   
    }

    @Override
    public int updateCustomerProfile(int customer_ID, Customer cust) {
         int count=0;PreparedStatement ps=null;
         System.out.println("helllllllllll");
        try {
            System.out.println("xxxxxxx");
            ps = con.prepareStatement("update customer set customer_Fname=?,customer_Lname=?,customer_Address=?,customer_DOB=?,customer_EmailID=?,customer_PhoneNo=?,customer_LoginID=?,customer_Password=? where customer_ID=?");
            
            ps.setString(1, cust.getCustomer_Fname());
            ps.setString(2, cust.getCustomer_Lname());
           
            ps.setString(3, cust.getCustomer_Address());
            java.util.Date customer_DOB = new java.util.Date(cust.getCustomer_DOB());
            ps.setDate(4,new Date(customer_DOB.getYear(),customer_DOB.getMonth(),customer_DOB.getDate()));
            ps.setString(5, cust.getCustomer_EmailID());
            ps.setString(6, cust.getCustomer_PhoneNo());
            
            ps.setString(7, cust.getCustomer_LoginID());
            ps.setString(8, cust.getCustomer_Password()); 
            ps.setInt(9, cust.getCustomer_ID());
            
            System.out.println("ssdsdfjsdfd");
           
            count=ps.executeUpdate();
            System.out.println("jkjkdfkjfgkjfj");
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
       return count;
    }

    @Override
    public List<Customer> getAllCustomers() {
         List<Customer> custList = null;
        try {
           
            PreparedStatement preparedStatement = con.prepareStatement("select * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            custList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int customer_ID = resultSet.getInt(1);
                    String customer_Fname = resultSet.getString(2);
                    String customer_Lname = resultSet.getString(3);
                    
                    String customer_Address = resultSet.getString(4);
                    String customer_DOB = resultSet.getDate(5).toString();
                    String customer_EmailID = resultSet.getString(6);
                    String customer_PhoneNo = resultSet.getString(7);
                    
    ;                String customer_LoginID = resultSet.getString(8);
                    String customer_Password = resultSet.getString(9);
                   
                    Customer cust = new Customer(customer_ID,customer_Fname,customer_Lname,customer_PhoneNo,customer_Address,customer_EmailID,customer_DOB,customer_LoginID,customer_Password);
                    custList.add(cust);
                }
            }
              } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return custList;
    }
     @Override
    public Customer getcustomerByID(int customer_ID) {
          List<Customer> custList = null;
        try {
            
            PreparedStatement preparedStatement = con.prepareStatement("select * from customer where customer_ID=?");
            preparedStatement.setInt(1, customer_ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            custList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int customer_Id = resultSet.getInt(1);
                    String customer_Fname = resultSet.getString(2);
                    String customer_Lname = resultSet.getString(3);
                    
                    String customer_Address = resultSet.getString(4);
                    String customer_DOB = resultSet.getDate(5).toString();
                    String customer_EmailID = resultSet.getString(6);
                    String customer_PhoneNo = resultSet.getString(7);
                    
                    String customer_LoginID = resultSet.getString(8);
                    String customer_Password = resultSet.getString(9);
                   
                    Customer cust = new Customer(customer_Id,customer_Fname,customer_Lname,customer_Address,customer_DOB,customer_EmailID,customer_PhoneNo,customer_LoginID,customer_Password);
                    custList.add(cust);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(custList.size()>0) return custList.get(0);
     else return null;
    }

    @Override
    public int updateCust(int customer_ID, Customer cust) {
        int count=0;PreparedStatement ps=null;
       
        try {
           
            ps = con.prepareStatement("update customer set customer_Fname=?,customer_Lname=?,customer_Address=?,customer_DOB=?,customer_EmailID=?,customer_PhoneNo=?,customer_LoginID=?,customer_Password=? where customer_ID=?");
            
            ps.setString(1, cust.getCustomer_Fname());
            ps.setString(2, cust.getCustomer_Lname());
           
            ps.setString(3, cust.getCustomer_Address());
            java.util.Date customer_DOB = new java.util.Date(cust.getCustomer_DOB());
            ps.setDate(4,new Date(customer_DOB.getYear(),customer_DOB.getMonth(),customer_DOB.getDate()));
            ps.setString(5, cust.getCustomer_EmailID());
            ps.setString(6, cust.getCustomer_PhoneNo());
            
            ps.setString(7, cust.getCustomer_LoginID());
            ps.setString(8, cust.getCustomer_Password()); 
            ps.setInt(9, customer_ID);
            
         
             
            count=ps.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
       return count;
    }

    

}
         

        
        

    
    
    
    

