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
    
    private String med_name,expired_date,category,description;
    private int med_id,price,quantity ;

    public Products_Model(String med_name, String expired_date, String category, String description, int med_id, int price, int quantity) {
        this.med_name = med_name;
        this.expired_date = expired_date;
        this.category = category;
        this.description = description;
        this.med_id = med_id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getMed_name() {
        return med_name;
    }

    public String getExpired_date() {
        return expired_date;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getMed_id() {
        return med_id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }

    public void setExpired_date(String expired_date) {
        this.expired_date = expired_date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
