package com.user.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class UserRole {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int userRoleId;

@ManyToOne(fetch = FetchType.EAGER)
private User user;

@ManyToOne
private Role role;
}
