/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.entities;

/**
 *
 * @author SNEHA
 */
public class FloorBooking {
    public FloorBooking(){}

    public FloorBooking(int floorBooking_ID, int floorBooking_Capacity, String floorBooking_Event) {
        this.floorBooking_ID = floorBooking_ID;
        this.floorBooking_Capacity = floorBooking_Capacity;
        this.floorBooking_Event = floorBooking_Event;
    }

    public FloorBooking(String floorBooking_Event) {
        this.floorBooking_Event = floorBooking_Event;
    }
    
    int floorBooking_ID;
    int floorBooking_Capacity;
    String floorBooking_Event;

    public int getFloorBooking_Capacity() {
        return floorBooking_Capacity;
    }

    public void setFloorBooking_Capacity(int floorBooking_Capacity) {
        this.floorBooking_Capacity = floorBooking_Capacity;
    }

    public String getFloorBooking_Event() {
        return floorBooking_Event;
    }

    public void setFloorBooking_Event(String floorBooking_Event) {
        this.floorBooking_Event = floorBooking_Event;
    }

    public int getFloorBooking_ID() {
        return floorBooking_ID;
    }

    public void setFloorBooking_ID(int floorBooking_ID) {
        this.floorBooking_ID = floorBooking_ID;
    }

    
    
}
