package com.rent.RentalService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int car_ID;

    private String car_name;

    private String car_model;

    private String car_brand;

    private int car_year;

    private boolean available;

    private String car_image;

    private int car_capacity;
}
