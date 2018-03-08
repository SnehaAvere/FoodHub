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
public class Order {

    public int getorder_ID() {
        return order_ID;
    }

    public void setorder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    public String getorder_Status() {
        return order_Status;
    }

    public void setorder_Status(String order_Status) {
        this.order_Status = order_Status;
    }

    public int getorder_time() {
        return order_time;
    }

    public void setorder_time(int order_time) {
        this.order_time = order_time;
    }

    public String getorder_Date() {
        return order_Date;
    }

    public void setorder_Date(String order_Date) {
        this.order_Date = order_Date;
    }

    public int getBill_No() {
        return Bill_No;
    }

    public void setBill_No(int Bill_No) {
        this.Bill_No = Bill_No;
    }
    public int getOrder_Total() {
        return order_Total;
    }

    public void setOrder_Total(int order_Total) {
        this.order_Total = order_Total;
    }

    
int order_ID;
String order_Status ;
int order_time ;
String order_Date ;

int Bill_No ;
int order_Total;

    public Order(String order_Status, String order_Date) {
        this.order_Status = order_Status;
        this.order_Date = order_Date;
    }

    public Order(int order_ID, String order_Status, int order_time, String order_Date, int Bill_No, int order_Total) {
        this.order_ID = order_ID;
        this.order_Status = order_Status;
        this.order_time = order_time;
        this.order_Date = order_Date;
        this.Bill_No = Bill_No;
        this.order_Total = order_Total;
    }

    
    
}
