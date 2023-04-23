/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modeling.DBOperation;
import Modeling.Suppliers_Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGION
 */
public class supplier_operations {
    public  static void insert_SupplierData(String Company_name, String city, String region, String postal_code, String phone )
   {
       String query="insert into supplier (Company_name,city,region,postal_code,phone) values ('"+Company_name+"' , '"+city+"' , '"+region+"' , '"+postal_code+"', '"+phone+"')";
       DBOperation.setDataOrDelete(query, "New Supplier has been Inserted Successfully");
   }
               //get data
    public  static ArrayList<Suppliers_Model> get_suppliersData()
    {
          String query="select * from supplier";
          ResultSet rs=DBOperation.getData(query);
          ArrayList<Suppliers_Model> arr= new ArrayList();

        try {
            while(rs.next())
            {
                arr.add(new Suppliers_Model(rs.getInt("supplier_id"),
                        rs.getString("Company_name"),
                        rs.getString("city"),
                        rs.getString("region"),
                        rs.getString("postal_code"),
                        rs.getString("phone")));
            }
            return arr;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try {
                rs.close();
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
       return null;
        
    }
       public static Suppliers_Model Search_supplier(int supplier_id)
    {   
        Suppliers_Model obj=null;
        String Query="select *from supplier where supplier_id='"+supplier_id+"'";
        ResultSet rs=DBOperation.getData(Query);
        try {
            while(rs.next())
            {
              obj= new Suppliers_Model(rs.getInt("supplier_id"),
                      rs.getString("Company_name"),
                      rs.getString("city"),
                      rs.getString("region"),
                      rs.getString("postal_code"),
                      rs.getString("phoneNumber_1"));  
            }       
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
         obj=null;
        }
         return obj;    
    }
       public static void Delete_supplier(int supplier_id)
    {
        String Query="delete from supplier where supplier_id='"+supplier_id+"'";
       DBOperation.setDataOrDelete(Query, "");
    }
     
}
