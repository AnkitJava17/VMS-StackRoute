package com.share.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars")
public class Cars {
    @Id
    @GeneratedValue
    private int car_ID;

    private String car_model;

    private String car_brand;

    private int car_year;

    private boolean available;

    private String car_image;

    private int car_capacity;
}
