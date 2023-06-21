package com.admin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {

    private int carId;

    private String carModel;

    private String carBrand;

    private int carYear;

    private boolean available;

    private int carCapacity;

    private String carImage;

    private String carDriver;

}
