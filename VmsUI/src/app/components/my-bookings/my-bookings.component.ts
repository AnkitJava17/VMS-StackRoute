import { Component } from '@angular/core';
import { Booking } from './booking';

@Component({
  selector: 'app-my-bookings',
  templateUrl: './my-bookings.component.html',
  styleUrls: ['./my-bookings.component.css']
})
export class MyBookingsComponent {
  bookings: Booking[] = [
    {
      bookingId: 1,
      bookingType: "Type 1",
      bookingDate: "02/02/2022",
      bookingAmount: 100
    },
    {
      bookingId: 2,
      bookingType: "Type 2",
      bookingDate: "03/02/2022",
      bookingAmount: 200
    },
    {
      bookingId: 3,
      bookingType: "Type 3",
      bookingDate: "04/02/2022",
      bookingAmount: 300
    }
  ];}
