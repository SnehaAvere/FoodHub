
import com.foodHub.entities.TableBooking;
import com.foodHub.interfaceImpl.TableBookingDAOImpl;
import com.foodHub.interfaces.TableBookingDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class tableBookingmain {
        public static void main(String[] args){
     TableBookingDAO tabbDAO = new TableBookingDAOImpl();
  //  int count = tabbDAO.addBookTable(new TableBooking (2,5,"5/4/2017",2));
  //      if(count>0)System.out.println("Record Added Successfully");
  //      else System.out.println("Record Failed to get added");
 //    int count=tabbDAO.deletebookedtable(2);
 //       if(count>0)System.out.println("Record Deleted Successfully");
 //     else System.out.println("Record Failed to get deleted");
        TableBooking tabb = new TableBooking(1,6,"6/4/2018",6);
        int count=tabbDAO.updatetabelBooking(1, tabb);
        if(count>0)System.out.println("Record Updated Successfully");
        else System.out.println("Record Failed to get updated");
    
}
    
}
