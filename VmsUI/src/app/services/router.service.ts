import { Injectable } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouterService {

  constructor(private router: Router) { }

  toShare(){
    this.router.navigate(['ride-sharing']);
  }
}
// { path: '', pathMatch: 'full', redirectTo: 'dashboard' },
// { path: 'about-us', component: AboutUsComponent },
// { path: 'contact-us', component: ContactUsComponent },
// { path: 'dashboard', component: DashboardComponent },
// { path: 'login', component: LoginComponent },
// { path: 'my-bookings', component: MyBookingsComponent },
// { path: 'profile', component: ProfileComponent },
// { path: 'register', component: RegisterComponent },
// { path: 'ride-sharing', component: RideSharingComponent },
// { path: 'trip-divison', component: TripDivisionComponent },
// { path: 'vehicle-rental', component: VehicleRentalComponent },
// { path: 'admin', component: AdminComponent },