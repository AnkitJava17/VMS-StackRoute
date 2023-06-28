import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from './config';
@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}

  //add user

  public addUser(user: any) {
    return this.http.post(`${environment.userServiceBaseUrl}/api/v1/users/register`, user);
  }
}
