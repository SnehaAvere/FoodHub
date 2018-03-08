/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.foodHub.entities.Employee;
import com.foodHub.interfaceImpl.EmployeeDAOImpl;
import com.foodHub.interfaces.EmployeeDAO;
import java.util.List;
/**
 *
 * @author SNEHA
 */
public class EmployeeMain {
     public static void main(String[] args){
     EmployeeDAO empDAO = new EmployeeDAOImpl();
  //      int count = empDAO.AddEmployee(new Employee (4,"shweta","7045250159","borivali","shweta@niit.com","shweta","shweta123","staff",40000));
  //      if(count>0)System.out.println("Record Added Successfully");
  //      else System.out.println("Record Failed to get added");
 //    int count=empDAO.DeleteEmployee(3);
//        if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
 //       Employee emp = new Employee(4,"raj","7045250159","borivali","shweta@niit.com","shweta","shweta123","staff",40000);
 //       int count=empDAO.updateEmployee(4, emp);
 //       if(count>0)System.out.println("Record Updated Successfully");
 //       else System.out.println("Record Failed to get updated");
 //       List<Employee> emplist = empDAO.getAllEmployees();
 //       for(Employee emp : emplist){
 //           System.out.println(emp.getEmployee_ID() + "|" + emp.getEmployee_Name() + "|" + emp.getEmployee_PhoneNo() + "|" + emp.getEmployee_Address() + "|" + emp.getEmployee_EmailID() + "|" + emp.getEmployee_LoginID() + "|" + emp.getEmployee_Password() + "|" + emp.getEmployee_Catagory() + "|" + emp.getEmployee_Salary());
 //       }
        Employee emp = empDAO.getEmployeeByID(1);
            System.out.println(emp.getEmployee_ID() + "|" + emp.getEmployee_Name() + "|" + emp.getEmployee_PhoneNo() + "|" + emp.getEmployee_Address() + "|" + emp.getEmployee_EmailID() + "|" + emp.getEmployee_LoginID() + "|" + emp.getEmployee_Password() + "|" + emp.getEmployee_Catagory() + "|" + emp.getEmployee_Salary());
    }
}
    

