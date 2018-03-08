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
public class Floor {
    public Floor(){}

    public Floor(int floor_ID, int floor_Num) {
        this.floor_ID = floor_ID;
        this.floor_Num = floor_Num;
    }
    int floor_ID ;
    int floor_Num;
    

    
    public int getFloor_Num() {
        return floor_Num;
    }

    public void setFloor_Num(int floor_Num) {
        this.floor_Num = floor_Num;
    }
    

    
    public int getFloor_ID() {
        return floor_ID;
    }

    public void setFloor_ID(int floor_ID) {
        this.floor_ID = floor_ID;
    }
    
}
