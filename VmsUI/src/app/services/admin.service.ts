import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Car } from 'app/components/admin-ride-share/admin';



@Injectable({
  providedIn: 'root'
})
export class AdminService {



  private apiUrl = 'http://localhost:8080/admin//rides/saveCarDetails'; // Replace with your API endpoint

  constructor(private http: HttpClient) { }

  saveCarDetails(car: Car): Observable<Car> {
    return this.http.post<Car>(this.apiUrl, car);
  }
}
