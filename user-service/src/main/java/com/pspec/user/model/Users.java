package com.pspec.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Users {

    @Id
    private Long userId;
    private String givenName , familyName , email;
    private String birthDate;
    private String gender;
    private String userType;

}
