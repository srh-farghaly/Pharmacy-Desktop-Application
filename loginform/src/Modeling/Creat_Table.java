
package Modeling;
public class Creat_Table {
    public static void main(String []args)
    {
       /**** Tables ****/  
      //String Query="create table pharmacist(id int not null,firstname varchar(255) not null,lastname varchar(255) not null,age int not null,hired_date varchar(50) not null,pharmacist_gender varchar(50) not null,phoneNumber varchar(100) not null,email varchar(255) not null,password varchar(255) not null,salary int not null,mng_id int not null)";
      //String Query="create table products(med_name varchar(255) not null,price int not null,expired_date varchar(50) not null,quantity int not null,category varchar(255) not null,description varchar(255) not null )";
      //String Query="create table customer(customer_id int not null,firstname varchar(255) not null,lastname varchar(255) not null,city varchar(255) not null,street varchar(255) not null,gender varchar(50) not null,phoneNumber_1 varchar(100) not null)";
      //String Query="create table orders (order_number int not null,order_price int not null,date varchar(50) not null,Payment_Type varchar(50) not null,delivery_ID int not null)";     
      //String Query="create table order_relation(Ph_ID int not null, C_ID int not null, ProductName varchar(255) not null , order_ID int not null )";
      //String Query="create table Delivery (delivery_ID int not null, phoneNumber varchar(50) not null, name varchar(100) not null)";
      
      /****  Constrains ****/
      //String Query="alter table orders add constraint ppx FOREIGN KEY (delivery_ID) REFERENCES Delivery(delivery_ID)";  // relation between order and delivery
      //String Query="alter table order_relation add constraint fx FOREIGN KEY (Ph_ID) REFERENCES pharmacist(id)";                    //  ...
      //String Query="alter table order_relation add constraint fxx FOREIGN KEY (C_ID) REFERENCES customer(customer_id)";             //  ...  > relations of order_relation
      //String Query="alter table order_relation add constraint fxxx FOREIGN KEY (ProductName) REFERENCES products(med_name)";        //  ...  
      //String Query="alter table order_relation add constraint fxxxx FOREIGN KEY (order_ID) REFERENCES orders(order_number)";        //  ...
      String Query="alter table orders rename column price to order_price";        //  ...
     

//              String Query="insert into orders (price,date,Payment_Type) values ('1500' , '22/4/2023' , 'cash')";
       //       String Query="insert into order_relation (Ph_ID,C_ID,ProductName,order_ID) values ('19' ,'2' ,'panadol' , '3')";
        
    //      String Query="insert into Delivery (phoneNumber,name) values ('01111938585' ,' mohamed')";

              DBOperation.setDataOrDelete(Query,"created"); 
        
    }
}
