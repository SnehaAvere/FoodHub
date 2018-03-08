
import com.foodHub.entities.Floor;
import com.foodHub.interfaceImpl.FloorDAOImpl;
import com.foodHub.interfaces.FloorDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SNEHA
 */
public class floorMain {
     public static void main(String[] args){
     FloorDAO floDAO = new FloorDAOImpl();
  //      int count = floDAO.addFloor(new Floor (2,2));
  //      if(count>0)System.out.println("Record Added Successfully");
  //      else System.out.println("Record Failed to get added");
     int count=floDAO.deleteFloor(2);
       if(count>0)System.out.println("Record Deleted Successfully");
      else System.out.println("Record Failed to get deleted");
    
}
}
