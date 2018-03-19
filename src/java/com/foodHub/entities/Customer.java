/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.entities;

/**
 *
 * @author SNEHA
 */
public class Customer {

   
int customer_ID;
String customer_Fname;
String customer_Lname;

String customer_Address;
String customer_DOB;
String customer_EmailID ;
String customer_PhoneNo;

String customer_LoginID;
String customer_Password;

    public Customer(String customer_Fname, String customer_Lname, String customer_Address, String customer_DOB, String customer_EmailID, String customer_PhoneNo, String customer_LoginID, String customer_Password) {
        this.customer_Fname = customer_Fname;
        this.customer_Lname = customer_Lname;
        this.customer_Address = customer_Address;
        this.customer_DOB = customer_DOB;
        this.customer_EmailID = customer_EmailID;
        this.customer_PhoneNo = customer_PhoneNo;
        this.customer_LoginID = customer_LoginID;
        this.customer_Password = customer_Password;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_Fname() {
        return customer_Fname;
    }

    public void setCustomer_Fname(String customer_Fname) {
        this.customer_Fname = customer_Fname;
    }

    public String getCustomer_Lname() {
        return customer_Lname;
    }

    public void setCustomer_Lname(String customer_Lname) {
        this.customer_Lname = customer_Lname;
    }

    public String getCustomer_EmailID() {
        return customer_EmailID;
    }

    public void setCustomer_EmailID(String customer_EmailID) {
        this.customer_EmailID = customer_EmailID;
    }

    public String getCustomer_Address() {
        return customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {
        this.customer_Address = customer_Address;
    }

    public String getCustomer_PhoneNo() {
        return customer_PhoneNo;
    }

    public void setCustomer_PhoneNo(String customer_PhoneNo) {
        this.customer_PhoneNo = customer_PhoneNo;
    }

    public String getCustomer_DOB() {
        return customer_DOB;
    }

    public void setCustomer_DOB(String customer_DOB) {
        this.customer_DOB = customer_DOB;
    }

    public String getCustomer_LoginID() {
        return customer_LoginID;
    }

    public void setCustomer_LoginID(String customer_LoginID) {
        this.customer_LoginID = customer_LoginID;
    }

    public String getCustomer_Password() {
        return customer_Password;
    }

    public void setCustomer_Password(String customer_Password) {
        this.customer_Password = customer_Password;
    }
    public Customer(){}

    public Customer(int customer_ID, String customer_Fname, String customer_Lname, String customer_Address, String customer_DOB, String customer_EmailID,String customer_PhoneNo, String customer_LoginID, String customer_Password ) {
        this.customer_ID = customer_ID;
        this.customer_Fname = customer_Fname;
        this.customer_Lname = customer_Lname;
        
        this.customer_Address = customer_Address;
        this.customer_DOB = customer_DOB;
        this.customer_EmailID = customer_EmailID;
        this.customer_PhoneNo = customer_PhoneNo;
        
        this.customer_LoginID = customer_LoginID;
        this.customer_Password = customer_Password;
    }

   

    
}
