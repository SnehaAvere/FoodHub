/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Floor;
import com.foodHub.entities.FloorBooking;

/**
 *
 * @author SNEHA
 */
public interface FloorBookingDAO {
    int addBookFloor(FloorBooking floB);
     int deleteBookFloor(int floorBooking_ID);
     int updateFloorBooking(int floorBooking_ID, FloorBooking floB);
}
