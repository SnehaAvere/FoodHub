/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaceImpl;

import com.foodHub.entities.Employee;
import com.foodHub.interfaces.EmployeeDAO;
import java.sql.Connection;
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
public class EmployeeDAOImpl implements EmployeeDAO {
    Connection con = DBconnection.getConnection();

    @Override
    public int AddEmployee(Employee emp) {
        int count=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into employee (employee_Name,employee_PhoneNo,employee_Address,employee_EmailID,employee_LoginID,employee_Password,employee_Catagory,employee_Salary) values (?,?,?,?,?,?,?,?)");
          
            ps.setString(1, emp.getEmployee_Name());
            ps.setString(2, emp.getEmployee_PhoneNo());
            ps.setString(3, emp.getEmployee_Address());
            ps.setString(4, emp.getEmployee_EmailID());
            ps.setString(5, emp.getEmployee_LoginID());
            ps.setString(6, emp.getEmployee_Password());
            ps.setString(7, emp.getEmployee_Catagory());
            ps.setInt(8, emp.getEmployee_Salary());
            ps.execute(); 
         
            System.out.println("employee Added successfully");
        } catch (Exception e) {
           
            System.out.println("employee does not added");
            System.out.println(e.getMessage());
            
        }
        return 0;
    }

    

    @Override
    public int DeleteEmployee(int employee_ID) {
          int count=0;
        try {
            
            
            PreparedStatement preparedStatement = con.prepareStatement("delete from Employee where employee_ID=?");
            preparedStatement.setInt(1,employee_ID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            
        }
        return count;
    }

    @Override
    public int updateEmployee(int employee_ID, Employee emp) {
         int count=0;
        try {
            
            PreparedStatement ps = con.prepareStatement("update employee set employee_Name=?,employee_PhoneNo=?,employee_Address=?,employee_EmailID=?,employee_LoginID=?,employee_Password=?,employee_Catagory=?,employee_Salary=? where employee_ID=?");
            ps.setString(1, emp.getEmployee_Name());
            ps.setString(2, emp.getEmployee_PhoneNo());
            ps.setString(3, emp.getEmployee_Address());
            ps.setString(4, emp.getEmployee_EmailID());
            ps.setString(5, emp.getEmployee_LoginID());
            ps.setString(6, emp.getEmployee_Password());
            ps.setString(7, emp.getEmployee_Catagory());
            ps.setInt(8, emp.getEmployee_Salary());
            ps.setInt(9, emp.getEmployee_ID());
            count=ps.executeUpdate();
        } catch (SQLException ex) {
           
        }
        return count;
    }

    @Override
    public List<Employee> getAllEmployees() {
         List<Employee> empList = null;
        try {
          
            PreparedStatement preparedStatement = con.prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            empList = new ArrayList<Employee>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int employee_ID = resultSet.getInt(1);
                    String employee_Name = resultSet.getString(2);
                    String employee_PhoneNo = resultSet.getString(3);
                    String employee_Address = resultSet.getString(4);
                    String employee_EmailID = resultSet.getString(5);
                    String employee_LoginID = resultSet.getString(6);
                    String employee_Password = resultSet.getString(7);
                    String employee_Category = resultSet.getString(8);
                    int employee_Salary = resultSet.getInt(9);
                    Employee emp = new Employee(employee_ID,employee_Name,employee_PhoneNo,employee_Address,employee_EmailID,employee_LoginID,employee_Password,employee_Category,employee_Salary);
                    empList.add(emp);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return empList;}

    @Override
    public Employee getEmployeeByID(int employee_ID) {
         List<Employee> empList = null;
        try {
           
            PreparedStatement ps= con.prepareStatement("select * from employee where employee_ID=?");
            ps.setInt(1, employee_ID);
            ResultSet resultSet = ps.executeQuery();
            empList = new ArrayList<Employee>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int employee_Id = resultSet.getInt(1);
                    String employee_Name = resultSet.getString(2);
                    String employee_PhoneNo = resultSet.getString(3);
                    String employee_Address = resultSet.getString(4);
                    String employee_EmailID = resultSet.getString(5);
                    String employee_LoginID = resultSet.getString(6);
                    String employee_Password = resultSet.getString(7);
                    String employee_Category = resultSet.getString(8);
                     int employee_Salary = resultSet.getInt(9);
                    Employee emp = new Employee(employee_Id,employee_Name,employee_PhoneNo,employee_Address,employee_EmailID,employee_LoginID,employee_Password,employee_Category,employee_Salary);
                    empList.add(emp);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(empList.size()>0) return empList.get(0);
     else return null; }
       }
    

