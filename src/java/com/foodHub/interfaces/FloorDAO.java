/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Floor;

/**
 *
 * @author SNEHA
 */
public interface FloorDAO {
     int addFloor(Floor flo);
    int deleteFloor(int floor_ID);
    
}
