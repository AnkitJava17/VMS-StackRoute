import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-vehicle-rental',
  templateUrl: './vehicle-rental.component.html',
  styleUrls: ['./vehicle-rental.component.css']
})
export class VehicleRentalComponent {
<<<<<<< HEAD
  showSideBar(){}
=======
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
      (err:Error) => {
        console.error(err);
      }
    );
  }
>>>>>>> b6b893039d6a27de0697028ba457421cad61f3bc

  searchCar(){}

  showPopup(){}

  setPickUp(){}

  setDropOff(){}
}
