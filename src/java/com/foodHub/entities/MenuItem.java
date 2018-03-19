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
public class MenuItem {
    public MenuItem(){}

    public int getMenuItem_ID() {
        return menuItem_ID;
    }

    public void setMenuItem_ID(int menuItem_ID) {
        this.menuItem_ID = menuItem_ID;
    }

    public String getMenuItem_Name() {
        return menuItem_Name;
    }

    public void setMenuItem_Name(String menuItem_Name) {
        this.menuItem_Name = menuItem_Name;
    }

   

    public int getMenuItem_Stoke() {
        return menuItem_Stoke;
    }

    public void setMenuItem_Stoke(int menuItem_Stoke) {
        this.menuItem_Stoke = menuItem_Stoke;
    }
     public int getMenuItem_Price() {
        return menuItem_Price;
    }

    public void setMenuItem_Price(int menuItem_Price) {
        this.menuItem_Price = menuItem_Price;
    }
int menuItem_ID;
String menuItem_Name;
int menuItem_Price ;
int menuItem_Stoke;

   


    public MenuItem(int menuItem_ID, String menuItem_Name, int menuItem_Price, int menuItem_Stoke) {
        this.menuItem_ID = menuItem_ID;
        this.menuItem_Name = menuItem_Name;
        this.menuItem_Price = menuItem_Price;
        this.menuItem_Stoke = menuItem_Stoke;
    }
     public MenuItem(String menuItem_Name) {
        this.menuItem_Name = menuItem_Name;
    }

   
     
}
