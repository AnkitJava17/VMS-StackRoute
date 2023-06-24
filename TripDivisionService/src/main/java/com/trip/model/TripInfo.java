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
@Table(name="trip_division")
public class TripInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trip_ID;
    private String trip_name;
    private Date start_date;
    private Date end_date;
    TripDivisionInfo trip_divisons;
}