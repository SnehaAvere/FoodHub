/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.Table;

/**
 *
 * @author SNEHA
 */
public interface TableDAO {
    int addTable(Table tab);
    int deleteTable(int table_ID);
   
    
}
