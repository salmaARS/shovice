package com.example.demo.create_req.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    private long id;

    private String name;
    private String matric;
    private String phone;
    private String email;
    private String gender;
    private String address;
    private String faculty;
    private String password;

    public User() {
    }

    public User(long id, String name, String matric, String phone, String email, String gender,
            String address, String faculty, String password) {
        this.id = id;
        this.name = name;
        this.matric = matric;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.faculty = faculty;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReq_name() {
        return this.name;
    }

    public void setReq_name(String req_name) {
        this.req_name = req_name;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestee() {
        return this.requestee;
    }

    public void setRequestee(String requestee) {
        this.requestee = requestee;
    }

    public String getStats() {
        return this.stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }
}
