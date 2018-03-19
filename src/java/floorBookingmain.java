
import com.foodHub.entities.FloorBooking;
import com.foodHub.interfaceImpl.FloorBookingDAOImpl;
import com.foodHub.interfaces.FloorBookingDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class floorBookingmain {
     public static void main(String[] args){
     FloorBookingDAO floBDAO = new FloorBookingDAOImpl();
//    int count = floBDAO.addBookFloor(new FloorBooking (1,50,"birthday"));
//        if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
  //   int count=floBDAO.deleteBookFloor(1);
  //      if(count>0)System.out.println("Record Deleted Successfully");
  //    else System.out.println("Record Failed to get deleted");
        FloorBooking floB = new FloorBooking(1,100,"party");
        int count=floBDAO.updateFloorBooking(1, floB);
        if(count>0)System.out.println("Record Updated Successfully");
        else System.out.println("Record Failed to get updated");
    
}
}