package com.rent.RentalService.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long bikeID;

    private String name;

    private String model;

    private String brand;

    private Date year;

    private boolean available;

    private String bike_image;

}
