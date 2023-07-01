import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-vehicle-rental',
  templateUrl: './vehicle-rental.component.html',
  styleUrls: ['./vehicle-rental.component.css']
})
export class VehicleRentalComponent {
  cities = ['City 1', 'City 2', 'City 3'];
  constructor(private http: HttpClient) { }

}
