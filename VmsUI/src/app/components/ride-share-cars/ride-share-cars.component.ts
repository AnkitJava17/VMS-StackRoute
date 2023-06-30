import { Component, OnInit } from '@angular/core';
import { Car } from './car';
import { ShareCarService } from 'app/services/share-car.service';

import { Router } from '@angular/router';
@Component({
  selector: 'app-ride-share-cars',
  templateUrl: './ride-share-cars.component.html',
  styleUrls: ['./ride-share-cars.component.css']
})
export class RideShareCarsComponent implements OnInit {
  // availableCars: Car[] = [];
  availableCars: Car[] = [
    {
      carBrand: 'Toyota',
      carModel: 'Corolla',
      carYear: 2020,
      carDriver: 'John Doe',
    },
    {
      carBrand: 'Honda',
      carModel: 'Civic',
      carYear: 2018,
      carDriver: 'Jane Smith',
    },
    // Add more car objects as needed
  ];

  constructor(private shareCarService: ShareCarService, private route: Router) { }

  ngOnInit() {
    this.getAvailableCars();
  }

  getAvailableCars() {
    this.shareCarService.getAvailableCars().subscribe(
      (cars: Car[]) => {
        this.availableCars = cars;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  bookCar(car: Car) {

    alert("car booked");
    console.log('Booking car:', car);
    this.route.navigate(['my-bookings']);
  }
}
