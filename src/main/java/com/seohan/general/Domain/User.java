package com.seohan.general.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

    @Id 
    private String username;
    private String password;
    private String email;
    private String role;
    public User() {
    }
 
    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }	
}