import { Component } from '@angular/core';

import { RentalService } from 'app/services/rental.service';
import { Router } from '@angular/router';
import { RentBikes } from '../rent-bike/rentBike';
@Component({
  selector: 'app-rent-bike',
  templateUrl: './rent-bike.component.html',
  styleUrls: ['./rent-bike.component.css']
})
export class RentBikeComponent {
  constructor(private rentService: RentalService, private route: Router) { }
  ngOnInit(): void {
    this.getAvailableBikes();
  }
  availableBikes: RentBikes[] = [];
  getAvailableBikes() {
    this.rentService.getAvailableBikes().subscribe(
      // (rentBikes: RentBikes[]) => {
      //   this.availableBikes = rentBikes;
      // },
      (error) => {
        console.error(error);
      }
    );
  }

  bookBike(rentBikes: RentBikes) {

    alert("car booked");
    console.log('Booking car:', rentBikes);
    this.route.navigate(['my-bookings']);
  }
}
