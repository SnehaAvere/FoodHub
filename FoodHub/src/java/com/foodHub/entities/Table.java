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
public class Table {
    public Table(){}
    int table_ID ;
    int table_Numbers ;   

    public Table(int table_ID, int table_Numbers) {
        this.table_ID = table_ID;
        this.table_Numbers = table_Numbers;
    }

    public int getTable_ID() {
        return table_ID;
    }

    public void setTable_ID(int table_ID) {
        this.table_ID = table_ID;
    }

    public int getTable_Numbers() {
        return table_Numbers;
    }

    public void setTable_Numbers(int table_Numbers) {
        this.table_Numbers = table_Numbers;
    }
}
