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
//      String  Query="create table products(med_name varchar(255) not null,price int not null,expired_date varchar(50) not null,quantity int not null,category varchar(255) not null,description varchar(255) not null )";
//      String Query="create table supplier_prod_rel(ph_id int FOREIGN KEY REFERENCES pharmacist(id),supp_id int FOREIGN KEY REFERENCES supplier(supplier_id),prod_name VARCHAR(50) FOREIGN KEY REFERENCES products(med_name))";
//    String Query= "CREATE TABLE supplier_prod_rel(prod_name VARCHAR(255),supp_id INT,ph_id INT,date varchar(255), FOREIGN KEY (ph_id) REFERENCES pharmacist(id),FOREIGN KEY (supp_id) REFERENCES supplier(supplier_id),FOREIGN KEY (prod_name) REFERENCES products(med_name))";
//      String Query="alter table login_info add constraint fx foreign key(ph_id) references pharmacist(id)";
//        String Query="ALTER TABLE supplier CHANGE supplier_id supplier_id INT(11) NOT NULL AUTO_INCREMENT";
//        String Query="drop table supplier_prod_rel";
//        String Query="insert into supplier_prod_rel values('panadol',2,1)";
//        String Query="alter table supplier_prod_rel supp_id int not null";
//        String Query="alter table supplier add date varchar(255)";
        String Query="delete from supplier_prod_rel where date= 12/12/3030";
//        String Query="alter table supplier drop date ";
       
              DBOperation.setDataOrDelete(Query,"created"); 
        
    }
}
