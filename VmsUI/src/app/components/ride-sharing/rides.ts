import { Time } from "@angular/common";

export class Rides {
    ride_ID: number = 0;
    ride_source: string = "";

    ride_destination: string = "";

    depature_time: Time = { hours: 0, minutes: 0 };

    arrival_time: Time = { hours: 0, minutes: 0 };

    ride_duration: number = 0;

    ride_km: number = 0;

    ride_rate: number = 0;
}