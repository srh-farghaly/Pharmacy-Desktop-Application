package Control;

import Modeling.Customers_Model;
import Modeling.DBOperation;
import Modeling.Orders_Model;
import Modeling.Pharmacist_Model;
import Modeling.Products_Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Orders_Operations {
        
      public    ArrayList<Pharmacist_Model>  Pharmacist_arr= new ArrayList();
      public    ArrayList<Customers_Model>   Customers_arr= new ArrayList();
      public    ArrayList<Products_Model>    Products_arr= new ArrayList();
      public    ArrayList<Orders_Model>      order_arr= new ArrayList();
//    public  static void insert_OrderData(int price, String date,String Payment_Type)
//   {    
//       String query="insert into orders (price,date,Payment_Type) values ('"+price+"' , '"+date+"' , '"+Payment_Type+"')";
//       DBOperation.setDataOrDelete(query, "New order has been Inserted Successfully");
//   }
//   
    public  boolean get_OrderData()
    {
          String query="select * from pharmacist,customer,products,orders,order_relation where order_relation.Ph_ID = pharmacist.id and order_relation.C_ID = customer.customer_id and order_relation.ProductName = products.med_name and order_relation.order_ID = orders.order_number";
          ResultSet Pr=DBOperation.getData(query);

        try {
            while(Pr.next())
            {
                Pharmacist_arr.add(new Pharmacist_Model(Pr.getInt("id"),Pr.getString("hired_date"),Pr.getString("firstname"),Pr.getString("lastname"),Pr.getString("pharmacist_gender"),Pr.getString("phonenumber"),Pr.getString("email"),Pr.getString("password"),Pr.getInt("salary"),Pr.getInt("age")));
                Customers_arr.add(new Customers_Model(Pr.getInt("customer_id"),Pr.getString("firstname"),Pr.getString("lastname"),Pr.getString("city"),Pr.getString("street"),Pr.getString("gender"),Pr.getString("phoneNumber_1")));
                Products_arr.add(new Products_Model(Pr.getString("med_name"),Pr.getInt("price"),Pr.getString("expired_date"),Pr.getInt("quantity"),Pr.getString("category"),Pr.getString("description")));
                order_arr.add(new Orders_Model(Pr.getInt("order_number"),Pr.getInt("order_price"),Pr.getString("date"),Pr.getString("Payment_Type")));
            }
            
            return true;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try {
                Pr.close();
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
       return false;
        
    }

    public static Orders_Model Search_Order(int order_number)
    {   
        Orders_Model obj=null;
        String Query="select * from orders where order_number='"+order_number+"' ";
        ResultSet Pr=DBOperation.getData(Query);
        try {
            while(Pr.next())
            {
             obj= new Orders_Model(Pr.getInt("order_number"),Pr.getInt("price"),Pr.getString("date"),Pr.getString("Payment_Type"));
            }       
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
         obj=null;
        }
         return obj;    
    }
    
    
//    public static void Edit_Product(String med_name,int new_price,String new_expired_date,int quantity)
//    {        
//        String query="UPDATE products set price='"+new_price+"',quantity='"+quantity+"', expired_date='"+new_expired_date+"' where med_name='"+med_name+"'";
//        DBOperation.setDataOrDelete(query, "");
//    }
}
