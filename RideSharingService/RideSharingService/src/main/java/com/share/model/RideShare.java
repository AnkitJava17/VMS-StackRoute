package com.share.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ride_sharing")
public class RideShare {

    @Id
    @GeneratedValue
    private int ride_ID;

    private String ride_source;

    private String ride_destination;

    private Time depature_time;

    private Time arrival_time;

    private int ride_duration;

    private float ride_km;

    private float ride_rate;
}
