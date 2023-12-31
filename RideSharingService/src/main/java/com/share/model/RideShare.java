package com.share.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="ride_sharing")
public class RideShare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ride_ID;

    private String ride_source;

    private String ride_destination;

    private Time depature_time;

    private Time arrival_time;

    private int ride_duration;

    private float ride_km;

    private float ride_rate;

}
