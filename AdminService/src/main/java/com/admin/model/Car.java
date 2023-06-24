package com.admin.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="cars")
@Entity
public class Car {


    @GeneratedValue
    @Column(name = "car_ID")
    @Id
    private int carId;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_year")
    private int carYear;

    @Column(name = "car_availability")
    private boolean available;

    @Column(name = "car_capacity")
    private int carCapacity;


    private String carImage;

    @Column(name="car_driver")
    private String carDriver;
}
