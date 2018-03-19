
import com.foodHub.entities.Order;
import com.foodHub.interfaceImpl.OrderDAOImpl;
import com.foodHub.interfaces.OrderDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class ordermain {
    
  public static void main(String[] args){
     OrderDAO OrdDAO = new OrderDAOImpl();
   //     int count = OrdDAO.addOrder(new Order (2,"first",11,"6/8/2018",10100125,200));
   //     if(count>0)System.out.println("Record Added Successfully");
   //     else System.out.println("Record Failed to get added");
 //    int count=OrdDAO.deleteOrder(2);
 //      if(count>0)System.out.println("Record Deleted Successfully");
 //     else System.out.println("Record Failed to get deleted");
        Order Ord = new Order(1,"second",12,"6/8/2017",10100125,250);
        int count=OrdDAO.updateOrder(4, Ord);
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
    

