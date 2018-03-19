/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Employee;
import java.util.List;

/**
 *
 * @author SNEHA
 */
public interface EmployeeDAO {
 int AddEmployee(Employee emp);
 
int DeleteEmployee(int employee_ID);
public int updateEmployee(int employee_ID, Employee emp);
 public List<Employee> getAllEmployees();
 public Employee getEmployeeByID(int employee_ID);
    
}
