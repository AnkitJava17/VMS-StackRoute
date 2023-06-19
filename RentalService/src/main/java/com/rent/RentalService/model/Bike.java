package com.rent.RentalService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int car_ID;

    private String bike_model;

    private String bike_brand;

    private int bike_year;

    private boolean available;

    private String bike_image;

}
