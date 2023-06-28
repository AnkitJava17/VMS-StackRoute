package com.rent.RentalService.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long carId;
    private String name;
    private String model;
    private String brand;
    private String year;
    private boolean available;
    private String car_image;
    private int capacity;
}
