/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;
//constraint px foreign key(ph_id) references pharmacist(id)
public class Creat_Table {
    public static void main(String []args)
    {
      //String Query= "create table login_info(ph_id int not null,email varchar(255) not null,password varchar(255) not null)";
      //String Query="create table pharmacist(id int not null,firstname varchar(255) not null,lastname varchar(255) not null,age int not null,hired_date varchar(50) not null,gender varchar(50) not null,phoneNumber varchar(100) not null,email varchar(255) not null,password varchar(255) not null,salary int not null,mng_id int not null)";
      //String  Query="create table products(med_id int not null,med_name varchar(255) not null,price int not null,expired_date varchar(50) not null,quantity int not null,category varchar(255) not null,description varchar(255) not null )";
      String Query="create table customers(customer_id int not null,firstname varchar(255) not null,lastname varchar(255) not null,city varchar(255) not null,street varchar(255) not null,gender varchar(50) not null,phoneNumber_1 varchar(100) not null,phoneNumber_2 varchar(100) not null)";

      //String Query="alter table login_info add constraint fx foreign key(ph_id) references pharmacist(id)";
        
              DBOperation.setDataOrDelete(Query,"created"); 
        
    }
}
