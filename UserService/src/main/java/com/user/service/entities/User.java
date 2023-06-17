package com.user.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

//    @Id
//    private String userId;

    @Id
    private String userEmail;
    private String userFullName;
    private String userCity;
    private String userMobile;
    private String userPassword;

//    private LocationInfo locationID;
//    private PaymentInfo paymentID;
}