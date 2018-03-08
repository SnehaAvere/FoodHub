
import com.foodHub.entities.Table;
import com.foodHub.interfaceImpl.TableDAOImpl;
import com.foodHub.interfaces.TableDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class tableMain {
     public static void main(String[] args){
     TableDAO tabDAO = new TableDAOImpl();
   //     int count = tabDAO.addTable(new Table (2,2));
   //     if(count>0)System.out.println("Record Added Successfully");
   //     else System.out.println("Record Failed to get added");
    int count=tabDAO.deleteTable(2);
       if(count>0)System.out.println("Record Deleted Successfully");
      else System.out.println("Record Failed to get deleted");
    
}
}
