package com.trip.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

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
    private long trip_ID;
    private String trip_name;
    private Date start_date;
    private Date end_date;

    @OneToMany
    private TripDivisionInfo trip_divisons;
}