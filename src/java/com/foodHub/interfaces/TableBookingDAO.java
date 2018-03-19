/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodHub.interfaces;

import com.foodHub.entities.TableBooking;

/**
 *
 * @author SNEHA
 */
public interface TableBookingDAO {
    int addBookTable(TableBooking tabb);
    int deletebookedtable(int tableBooking_ID);
    int updatetabelBooking(int tableBooking_ID, TableBooking tabb);
}
