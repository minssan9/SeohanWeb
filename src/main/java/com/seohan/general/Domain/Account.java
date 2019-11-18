package com.seohan.general.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;
 
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}