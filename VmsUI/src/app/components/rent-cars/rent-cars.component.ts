import { Component, OnInit } from '@angular/core';
import { RentCars } from '../rent-cars/rentCar';
import { RentalService } from 'app/services/rental.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-rent-cars',
  templateUrl: './rent-cars.component.html',
  styleUrls: ['./rent-cars.component.css']
})
export class RentCarsComponent implements OnInit {
  constructor(private rentService: RentalService, private route: Router) { }
  ngOnInit(): void {
    this.getAvailableCars();
  }
  availableCars: RentCars[] = [];
  getAvailableCars() {
    this.rentService.getAvailableCars().subscribe(
      (rentCars: RentCars[]) => {
        this.availableCars = rentCars;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  bookCar(rentCars: RentCars) {

    alert("car booked");
    console.log('Booking car:', rentCars);
    this.route.navigate(['my-bookings']);
  }
}
