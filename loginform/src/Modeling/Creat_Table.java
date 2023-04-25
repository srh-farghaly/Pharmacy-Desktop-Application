
package Modeling;
public class Creat_Table {
    public static void main(String []args)
    {
       /**** Tables ****/  
     String Query="create table pharmacist(id int not null,firstname varchar(255) not null,lastname varchar(255) not null,age int not null,hired_date varchar(50) not null,pharmacist_gender varchar(50) not null,phoneNumber varchar(100) not null,email varchar(255) not null,password varchar(255) not null,salary int not null,mng_id int not null)";
      //String Query="create table products(med_name varchar(255) not null,price int not null,expired_date varchar(50) not null,quantity int not null,category varchar(255) not null,description varchar(255) not null )";
     // String Query="create table customer(customer_id int not null,customer_firstname varchar(255) not null,customer_lastname varchar(255) not null,city varchar(255) not null,street varchar(255) not null,gender varchar(50) not null,phoneNumber_1 varchar(100) not null)";
     // String Query="create table orders (order_number int not null,order_price int not null,date varchar(50) not null,Payment_Type varchar(50) not null,delivery_ID int not null)";     
     // String Query="create table order_relation(Ph_ID int not null, C_ID int not null, ProductName varchar(255) not null , order_ID int not null )";
      //String Query="create table delivery (delivery_ID int not null, delivery_phoneNumber varchar(50) not null, name varchar(100) not null)";
     

       /*** DataBase Configurations ***/ 

//        Please Pay attention to the following :
//         1- Delete all tables in database and re- create it to make sure every thing working as it should be.
//         2- Run Each Query separatly , First Create Tables. 
//         3- Second Make Following Constrains: 
//            - Make (id) in pharmacist table primary key , AND DON'T MAKE IT AUTO INCREMENT 
//            - Make (delivery_ID) in delivery table primary key , AND DON'T MAKE IT AUTO INCREMENT 
//            - Make (customer_id) in customer table primary key and auto increment 
//            - Make (order_number) in orders table primary key and auto increment 
//            - Make (med_name) in products table primary key 
//         4- Then Run the Following Constrains Statments:
            //  String Query="alter table orders add constraint ppx FOREIGN KEY (delivery_ID) REFERENCES Delivery(delivery_ID)";  // relation between order and delivery
              //String Query="alter table order_relation add constraint fx FOREIGN KEY (Ph_ID) REFERENCES pharmacist(id)";                    //  ...
             // String Query="alter table order_relation add constraint fxx FOREIGN KEY (C_ID) REFERENCES customer(customer_id)";             //  ...  > relations of order_relation
             // String Query="alter table order_relation add constraint fxxx FOREIGN KEY (ProductName) REFERENCES products(med_name)";        //  ...  
             // String Query="alter table order_relation add constraint fxxxx FOREIGN KEY (order_ID) REFERENCES orders(order_number)";        //  ...         
//         5- Run the Follwing queryies as it is: 
               //String Query="insert into customer (customer_firstname,customer_lastname,city,street,gender,phoneNumber_1) values ('No Info' ,' ' ,'No Info' , 'No Info','No Info','No Info')";
              //String Query="insert into delivery (delivery_ID, delivery_phoneNumber , name) values ('0' , 'NO INFO', 'NO INFO')";
              DBOperation.setDataOrDelete(Query,"created"); 
        
    }
}
