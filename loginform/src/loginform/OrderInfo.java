package loginform;

import Modeling.Customers_Model;
import Modeling.Orders_Model;
import Modeling.Pharmacist_Model;
import Modeling.Products_Model;

/**
 *
 * @author Seifeldin Ahmed
 */
public class OrderInfo extends javax.swing.JFrame {

    /**
     * Creates new form OrderInfo
     */
    public OrderInfo() {
        initComponents();
        // order info
        Orders_Model obj1 =  rond.order_object.All_data.order_arr.get(Orders.getRow_number()); // from the same page of (rond.order_object) access (All_data) then access array of orders and return the selected object
         OrderNumber.setText(obj1.getOrder_number()+" ");
         price.setText(obj1.getPrice()+" ");
         Date.setText(obj1.getDate());
         PaymentType.setText(obj1.getPayment_Type());
         
         // customer info 
         Customers_Model obj2=  rond.order_object.All_data.Customers_arr.get(Orders.getRow_number()); // from the same page of (rond.order_object) access (All_data) then access array of Customers and return the selected object
           customer_ID.setText(obj2.getCustomer_id()+" ");
           FirstName.setText(obj2.getFirstname());
           LastName.setText(obj2.getLastname());
           PhoneNumber.setText(obj2.getPhoneNumber_1());
           Customer_Gender.setText(obj2.getGender());
           Address.setText(obj2.getStreet()+" , "+obj2.getCity());
           
         // product info 
          Products_Model obj3=  rond.order_object.All_data.Products_arr.get(Orders.getRow_number()); // from the same page of (rond.order_object) access (All_data) then access array of Products and return the selected object
          ProductName.setText(obj3.getMed_name());
          Quantity.setText(obj3.getQuantity()+"");
          Product_Price.setText(obj3.getPrice()+"");
          Expired_Date.setText(obj3.getExpired_date());
          ProductCategory.setText(obj3.getCategory());
          
          // Pharmacist info 
          Pharmacist_Model obj4=  rond.order_object.All_data.Pharmacist_arr.get(Orders.getRow_number()); // from the same page of (rond.order_object) access (All_data) then access array of Pharmacists and return the selected object
          phar_id.setText(obj4.getId()+"");
          phar_name.setText(obj4.getFirstname()+" "+obj4.getLastname());
          email.setText(obj4.getEmail());

          
           
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OrderNumber = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        PaymentType = new javax.swing.JLabel();
        customer_ID = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        Customer_Gender = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        ProductName = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        Product_Price = new javax.swing.JLabel();
        Expired_Date = new javax.swing.JLabel();
        ProductCategory = new javax.swing.JLabel();
        phar_id = new javax.swing.JLabel();
        phar_name = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        CustomerID.setBackground(new java.awt.Color(6, 107, 138,80));
        CustomerID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Number : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date : ");

        Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("Payment Type : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pharmacist ID : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pharmacist Name:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer ID : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("First Name : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone Number : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Name : ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Quantity : ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price : ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Product Category :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Expired Date : ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Order Information ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Customer Information ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Product Information ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pharmacist Information ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled-1 (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(122, 115));

        OrderNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OrderNumber.setForeground(new java.awt.Color(255, 255, 255));

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));

        Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));

        PaymentType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PaymentType.setForeground(new java.awt.Color(255, 255, 255));

        customer_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customer_ID.setForeground(new java.awt.Color(255, 255, 255));

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));

        LastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));

        PhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(255, 255, 255));

        Customer_Gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Customer_Gender.setForeground(new java.awt.Color(255, 255, 255));

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));

        ProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductName.setForeground(new java.awt.Color(255, 255, 255));

        Quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Quantity.setForeground(new java.awt.Color(255, 255, 255));

        Product_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Product_Price.setForeground(new java.awt.Color(255, 255, 255));

        Expired_Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Expired_Date.setForeground(new java.awt.Color(255, 255, 255));

        ProductCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductCategory.setForeground(new java.awt.Color(255, 255, 255));

        phar_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phar_id.setForeground(new java.awt.Color(255, 255, 255));

        phar_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phar_name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email : ");

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CustomerIDLayout = new javax.swing.GroupLayout(CustomerID);
        CustomerID.setLayout(CustomerIDLayout);
        CustomerIDLayout.setHorizontalGroup(
            CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerIDLayout.createSequentialGroup()
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OrderNumber))
                            .addComponent(Price))
                        .addGap(169, 169, 169)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phar_name))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phar_id))))
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel22))
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel21))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customer_ID))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FirstName))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LastName))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PhoneNumber))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Customer_Gender))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(PaymentType))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Address)))))
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Product_Price))
                                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Expired_Date))
                                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Quantity))
                                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ProductName)))
                                        .addGap(406, 406, 406)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CustomerIDLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ProductCategory))))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CustomerIDLayout.setVerticalGroup(
            CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerIDLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(phar_id))
                    .addComponent(OrderNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(price)
                    .addComponent(phar_name))
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Date)
                            .addComponent(jLabel25)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price)
                            .addComponent(PaymentType)))
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerIDLayout.createSequentialGroup()
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(customer_ID)
                            .addComponent(jLabel16)
                            .addComponent(ProductName))
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(FirstName)
                                    .addComponent(jLabel17)
                                    .addComponent(Quantity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(LastName)))
                            .addGroup(CustomerIDLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(Product_Price))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(PhoneNumber)
                            .addComponent(jLabel20)
                            .addComponent(Expired_Date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Customer_Gender)
                            .addComponent(jLabel19)
                            .addComponent(ProductCategory)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomerIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Address))
                .addGap(25, 25, 25))
        );

        getContentPane().add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 680, 480));
        CustomerID.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/17973908.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Orders od = new Orders();
        od.setVisible(true);
        od.show_table();
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JPanel CustomerID;
    private javax.swing.JLabel Customer_Gender;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Expired_Date;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel OrderNumber;
    private javax.swing.JLabel PaymentType;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel ProductCategory;
    private javax.swing.JLabel ProductName;
    private javax.swing.JLabel Product_Price;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel customer_ID;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel phar_id;
    private javax.swing.JLabel phar_name;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
