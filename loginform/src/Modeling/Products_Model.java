/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;

/**
 *
 * @author lenovo
 */
public class Products_Model {
    
    
    private int med_id ,quantity,price;
    private String med_name,expired_date,category,description;

    public Products_Model(int med_id, String med_name, int price, String expired_date, int quantity, String category, String description) {
        this.med_id = med_id;
        this.med_name = med_name;
        this.price = price;
        this.expired_date = expired_date;
        this.quantity = quantity;
        this.category = category;
        this.description = description;
    }

    public int getMed_id() {
        return med_id;
    }

    public String getMed_name() {
        return med_name;
    }

    public int getPrice() {
        return price;
    }

    public String getExpired_date() {
        return expired_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setExpired_date(String expired_date) {
        this.expired_date = expired_date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
