/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;

/**
 *
 * @author LEGION
 */
public class Suppliers_Model {
//    private String Company_name,city,region,postal_code,phone;
    private String Company_name;
    private String city;
    private String region;
    private String postal_code;
    private String phone;
    private int supplier_id;

    public Suppliers_Model( int supplier_id, String Company_name, String city, String region, String postal_code, String phone) {
        this.supplier_id = supplier_id;
        this.Company_name = Company_name;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.phone = phone;
        
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String Company_name) {
        this.Company_name = Company_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
    
    
    
}
