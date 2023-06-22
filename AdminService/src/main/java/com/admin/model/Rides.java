package com.admin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rides {
    private int ride_ID;

    private String ride_source;

    private String ride_destination;

    private Time depature_time;

    private Time arrival_time;

    private int ride_duration;

    private float ride_km;

    private float ride_rate;
}
