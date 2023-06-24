package com.trip.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import java.sql.Date;

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
	int division_ID;
//	TripInfo trip_ID;
//	User user_ID;
//	LocationID started_at;
//	LocationID ended_at;
//	PaymentInfo payment_ID;
	
	
}
