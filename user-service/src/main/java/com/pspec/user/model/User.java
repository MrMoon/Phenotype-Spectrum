package com.pspec.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

@Data
public class User {

    @Id
    private String userId = UUID.randomUUID().toString();
    private String givenName , familyName , email;
    private Date birthDate;
    private Gender gender;
    private UserType userType;

}
