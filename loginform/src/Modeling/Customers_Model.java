/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;

/**
 *
 * @author lenovo
 */
public class Customers_Model {
    
    private String firstname,lastname,city,street,gender,phoneNumber_1,phoneNumber_2;
    private int customer_id; 

    public Customers_Model(String firstname, String lastname, String city, String street, String gender, String phoneNumber_1, String phoneNumber_2, int customer_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.street = street;
        this.gender = gender;
        this.phoneNumber_1 = phoneNumber_1;
        this.phoneNumber_2 = phoneNumber_2;
        this.customer_id = customer_id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber_1(String phoneNumber_1) {
        this.phoneNumber_1 = phoneNumber_1;
    }

    public void setPhoneNumber_2(String phoneNumber_2) {
        this.phoneNumber_2 = phoneNumber_2;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber_1() {
        return phoneNumber_1;
    }

    public String getPhoneNumber_2() {
        return phoneNumber_2;
    }

    public int getCustomer_id() {
        return customer_id;
    }
    
    
    
}
