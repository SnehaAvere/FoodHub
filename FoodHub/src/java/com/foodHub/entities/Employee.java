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
public class Employee {
    public Employee(){}

    public Employee(int employee_ID, String employee_Name, String employee_Address, String employee_LoginID, String employee_Password, String employee_PhoneNo, String employee_Catagory, String employee_EmailID, int employee_Salary) {
        this.employee_ID = employee_ID;
        this.employee_Name = employee_Name;
        this.employee_Address = employee_Address;
        this.employee_LoginID = employee_LoginID;
        this.employee_Password = employee_Password;
        this.employee_PhoneNo = employee_PhoneNo;
        this.employee_Catagory = employee_Catagory;
        this.employee_EmailID = employee_EmailID;
        this.employee_Salary = employee_Salary;
    }
     public Employee( String employee_Name, String employee_Address, String employee_LoginID, String employee_Password, String employee_PhoneNo, String employee_Catagory, String employee_EmailID) {
        
        this.employee_Name = employee_Name;
        this.employee_Address = employee_Address;
        this.employee_LoginID = employee_LoginID;
        this.employee_Password = employee_Password;
        this.employee_PhoneNo = employee_PhoneNo;
        this.employee_Catagory = employee_Catagory;
        this.employee_EmailID = employee_EmailID;
       
    }
    int employee_ID;
String employee_Name ;
String employee_PhoneNo;
String employee_Address;

    public String getEmployee_Address() {
        return employee_Address;
    }

    public void setEmployee_Address(String employee_Address) {
        this.employee_Address = employee_Address;
    }
String employee_LoginID;
String employee_Password;

String employee_Catagory;
String employee_EmailID;
int employee_Salary;

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    public String getEmployee_LoginID() {
        return employee_LoginID;
    }

    public void setEmployee_LoginID(String employee_LoginID) {
        this.employee_LoginID = employee_LoginID;
    }

    public String getEmployee_Password() {
        return employee_Password;
    }

    public void setEmployee_Password(String employee_Password) {
        this.employee_Password = employee_Password;
    }

    public String getEmployee_PhoneNo() {
        return employee_PhoneNo;
    }

    public void setEmployee_PhoneNo(String employee_PhoneNo) {
        this.employee_PhoneNo = employee_PhoneNo;
    }

    public String getEmployee_Catagory() {
        return employee_Catagory;
    }

    public void setEmployee_Catagory(String employee_Catagory) {
        this.employee_Catagory = employee_Catagory;
    }

    public String getEmployee_EmailID() {
        return employee_EmailID;
    }

    public void setEmployee_EmailID(String employee_EmailID) {
        this.employee_EmailID = employee_EmailID;
    }

    public int getEmployee_Salary() {
        return employee_Salary;
    }

    public void setEmployee_Salary(int employee_Salary) {
        this.employee_Salary = employee_Salary;
    }
    
}
