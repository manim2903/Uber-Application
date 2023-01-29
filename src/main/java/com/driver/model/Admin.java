package com.driver.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.persistence.*;

@Entity
@Table(name = "admin")

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int adminId;
    private String username;
    private String password;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}