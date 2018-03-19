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
public class TableBooking {
    public TableBooking(){}
    int tableBooking_ID;
    int tableBooking_Num;

    public TableBooking(String tableBooking_Date) {
        this.tableBooking_Date = tableBooking_Date;
    }
    String tableBooking_Date;
    int tableBooking_Time;

    public TableBooking(int tableBooking_ID, int tableBooking_Num, String tableBooking_Date, int tableBooking_Time) {
        this.tableBooking_ID = tableBooking_ID;
        this.tableBooking_Num = tableBooking_Num;
        this.tableBooking_Date = tableBooking_Date;
        this.tableBooking_Time = tableBooking_Time;
    }

    public int getTableBooking_ID() {
        return tableBooking_ID;
    }

    public void setTableBooking_ID(int tableBooking_ID) {
        this.tableBooking_ID = tableBooking_ID;
    }

    public int getTableBooking_Num() {
        return tableBooking_Num;
    }

    public void setTableBooking_Num(int tableBooking_Num) {
        this.tableBooking_Num = tableBooking_Num;
    }

    public String getTableBooking_Date() {
        return tableBooking_Date;
    }

    public void setTableBooking_Date(String tableBooking_Date) {
        this.tableBooking_Date = tableBooking_Date;
    }

    public int getTableBooking_Time() {
        return tableBooking_Time;
    }

    public void setTableBooking_Time(int tableBooking_Time) {
        this.tableBooking_Time = tableBooking_Time;
    }
    
}
