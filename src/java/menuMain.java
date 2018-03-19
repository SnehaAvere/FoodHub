
import com.foodHub.entities.MenuItem;
import com.foodHub.interfaceImpl.MenuItemDAOImpl;
import com.foodHub.interfaces.MenuItemDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class menuMain {
 public static void main(String[] args){
     MenuItemDAO menuDAO = new MenuItemDAOImpl();
//        int count = menuDAO.addMenuItem(new MenuItem (1,"pizza",50,50));
  //      if(count>0)System.out.println("Record Added Successfully");
    //    else System.out.println("Record Failed to get added");
 //    int count=menuDAO.deleteMenuItem(4);
 //       if(count>0)System.out.println("Record Deleted Successfully");
 //     else System.out.println("Record Failed to get deleted");
        MenuItem menu = new MenuItem(1,"chicken",100,50);
        int count=menuDAO.updateMenuItem(1, menu);
        if(count>0)System.out.println("Record Updated Successfully");
        else System.out.println("Record Failed to get updated");
 //       List<Employee> emplist = empDAO.getAllEmployees();
 //       for(Employee emp : emplist){
 //           System.out.println(emp.getEmployee_ID() + "|" + emp.getEmployee_Name() + "|" + emp.getEmployee_PhoneNo() + "|" + emp.getEmployee_Address() + "|" + emp.getEmployee_EmailID() + "|" + emp.getEmployee_LoginID() + "|" + emp.getEmployee_Password() + "|" + emp.getEmployee_Catagory() + "|" + emp.getEmployee_Salary());
 //       }
 //       Employee emp = empDAO.getEmployeeByID(1);
 //           System.out.println(emp.getEmployee_ID() + "|" + emp.getEmployee_Name() + "|" + emp.getEmployee_PhoneNo() + "|" + emp.getEmployee_Address() + "|" + emp.getEmployee_EmailID() + "|" + emp.getEmployee_LoginID() + "|" + emp.getEmployee_Password() + "|" + emp.getEmployee_Catagory() + "|" + emp.getEmployee_Salary());
    }
}

