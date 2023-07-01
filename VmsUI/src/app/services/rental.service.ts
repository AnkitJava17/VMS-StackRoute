import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RentCars } from 'app/components/rent-cars/rentCar';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RentalService {
  private apiUrl = 'http://localhost:8082/api/rentals';
  constructor(private http: HttpClient) { }

  getAvailableCars(): Observable<RentCars[]> {
    return this.http.get<RentCars[]>(`${this.apiUrl}/cars/available`);
  }
  getAvailableBikes(): Observable<RentCars[]> {
    return this.http.get<RentCars[]>(`${this.apiUrl}/bikes/available`);
  }
}
