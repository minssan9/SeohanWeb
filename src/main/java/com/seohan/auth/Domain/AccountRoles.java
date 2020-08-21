package com.seohan.auth.Domain;

import lombok.*;

import javax.persistence.*;

@Data
public class AccountRoles {
    private String accountid;
    private String roles;
}