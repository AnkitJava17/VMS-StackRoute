import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { HttpClient } from '@angular/common/http';
import { Rides } from './rides';


@Component({
  selector: 'app-ride-sharing',
  templateUrl: './ride-sharing.component.html',
  styleUrls: ['./ride-sharing.component.css']
})
export class RideSharingComponent {
  searchResult: any;
  source: string = "";
  destination: string = "";
  date: string = "";
  passengers: number = 0;
  //searchRides: Rides[] = [];
  constructor(private http: HttpClient) { }
  searchRide() {
    const apiUrl = 'http://localhost:8083/api/rides/getAllCars';
    const queryParams = `?source=${this.source}&destination=${this.destination}&date=${this.date}&passengers=${this.passengers}`;

    this.http.get(apiUrl + queryParams).subscribe(
      (response: any) => {
        this.searchResult = {
          date: this.date,
          source: this.source,
          destination: this.destination,
          passengers: this.passengers,
          carDetails: response
        };
        console.log(this.searchResult);
      },
      (error) => {
        console.error(error);
      }
    );
  }

}
