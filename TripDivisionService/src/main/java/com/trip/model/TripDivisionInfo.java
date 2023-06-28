package com.trip.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="trip_division_info")
public class TripDivisionInfo {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long division_ID;

	private TripInfo trip_ID;

	private int User ;

	private int arrivalId;

	private int destinationId;

	private int payment_ID;
	
}
