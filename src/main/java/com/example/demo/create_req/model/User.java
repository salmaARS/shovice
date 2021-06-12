package com.example.demo.create_req.model;
import javax.persistence.Entity;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatric() {
        return this.matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
