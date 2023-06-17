import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Rides } from '../components/ride-sharing/rides';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl = "http://localhost:8080/cars/bookingDetails";

  constructor(private httpClient: HttpClient) { }

  getRides(): Observable<Rides[]> {
    return this.httpClient.get<Rides[]>(this.baseUrl);
  }


}
