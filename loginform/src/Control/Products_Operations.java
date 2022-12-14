/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modeling.DBOperation;
import Modeling.Products_Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author lenovo
 */
public class Products_Operations {
    
    public  static void insert_ProductData(int med_id ,String med_name,int price,String expired_date,int quantity,String category,String description )
   {
       String query="insert into products (med_id,med_name,price,expired_date,quantity,category,description) values ('"+med_id+"' , '"+med_name+"' , '"+price+"' , '"+ expired_date+"' , '"+quantity+"' , '"+category+"', '"+description+"')";
       DBOperation.setDataOrDelete(query, "New Product has been Inserted Successfully");
   }
    
    public static Products_Model Search_Product(int med_id)
    {   
        Products_Model obj=null;
        String Query="select *from products where med_id='"+med_id+"'";
        ResultSet Ps=DBOperation.getData(Query);
        try {
            while(Ps.next())
            {
           //  obj= new Products_Model(Ps.getInt("med_id"),Ps.getString("med_name"),Ps.getInt("price"),Ps.getInt("quantity"),Ps.getString("expired_date"),Ps.getString("category"),Ps.getString("description"));     
            }       
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
         obj=null;
        }
         return obj;    
    }
    
}
