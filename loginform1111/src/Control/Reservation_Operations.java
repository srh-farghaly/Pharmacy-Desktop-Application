/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modeling.DBOperation;
import java.time.LocalDate;

/**
 *
 * @author Ahmed Sherif
 */
public class Reservation_Operations {

    public static void insert_reservation(int PH_ID, int CU_ID, String Product_Name, int Quantity) {
        LocalDate currentDate = LocalDate.now();
        String query = "insert into reservation(pharmacist_ID ,Customer_ID ,Product_Name ,Quantity,Reservation_date) values('" + PH_ID + "','" + CU_ID + "','" + Product_Name + "','" + Quantity + "','" + currentDate.toString() + "')";
        DBOperation.setDataOrDelete(query, "New reservation has been Added Successfully");
        //test
    }
}
