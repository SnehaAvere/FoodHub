/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.foodHub.entities.Customer;
import com.foodHub.interfaces.CustomerDAO;
import com.foodHub.interfaceImpl.CustomerDAOImpl;
import java.util.List;
/**
 *
 * @author SNEHA
 */
public class ApplicationClass {
    public static void main(String[] args){
        CustomerDAO custDAO = new CustomerDAOImpl();
        int count = custDAO.addCustomer(new Customer("pooja","gore","borivli","05/06/1997","disha@niit.com","45682196","disha","disha123"));
        if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");
   //    int count = custDAO.deleteCustomer(5);
   //     if(count>0)System.out.println("Record Deleted Successfully");
   //     else System.out.println("Record Failed to get deleted");
   //     Customer cust = new Customer("raj","gore","kandivli","05/06/1997","disha@niit.com","45682196","disha","disha123");
   //    int count=custDAO.updateCustomerProfile(5, cust);
   //     if(count>0)System.out.println("Record Updated Successfully");
   //     else System.out.println("Record Failed to get updated");
   //   List<Customer> custlist = custDAO.getAllCustomers();
   //    for(Customer cust : custlist){
   //         System.out.println(cust.getCustomer_ID() + "|" + cust.getCustomer_Fname() + "|" + cust.getCustomer_Lname() + "|" + cust.getCustomer_Address() + "|" + cust.getCustomer_DOB() + "|" + cust.getCustomer_EmailID() + "|" + cust.getCustomer_PhoneNo() + "|" + cust.getCustomer_LoginID() + "|" + cust.getCustomer_Password());
   //     }
   //     Customer cust = custDAO.getcustomerByID(4);
   //         System.out.println(cust.getCustomer_ID() + "|" + cust.getCustomer_Fname() + "|" + cust.getCustomer_Lname() + "|" + cust.getCustomer_Address() + "|" + cust.getCustomer_DOB() + "|" + cust.getCustomer_EmailID() + "|" + cust.getCustomer_PhoneNo() + "|" + cust.getCustomer_LoginID() + "|" + cust.getCustomer_Password());
  //Customer cust = new Customer("dhruv","gore","kandivli","05/06/1997","disha@niit.com","45682196","disha","disha123");
  //    int count=custDAO.updateCust(5, cust);
  //      if(count>0)System.out.println("Record Updated Successfully");
  //      else System.out.println("Record Failed to get updated");
    }
    
}
