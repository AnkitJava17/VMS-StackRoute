import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';

import { LoginComponent } from './components/login/login.component';
import { MyBookingsComponent } from './components/my-bookings/my-bookings.component';
import { ProfileComponent } from './components/profile/profile.component';
import { RideSharingComponent } from './components/ride-sharing/ride-sharing.component';
import { TripDivisionComponent } from './components/trip-division/trip-division.component';
import { VehicleRentalComponent } from './components/vehicle-rental/vehicle-rental.component';
import { AdminComponent } from './components/admin/admin.component';

import { RideShareComponent } from './components/ride-share/ride-share.component';
import { FooterComponent } from './components/footer/footer.component';
import { AdminRideShareComponent } from './components/admin-ride-share/admin-ride-share.component';
import { RideShareCarsComponent } from './components/ride-share-cars/ride-share-cars.component';

import { DashBoardComponent } from './components/dash-board/dash-board.component';
import { DashServicesComponent } from './components/dash-services/dash-services.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'dashboard' },
  { path: 'about-us', component: AboutUsComponent },
  { path: 'contact-us', component: ContactUsComponent },
  
  { path: 'login', component: LoginComponent },
  { path: 'my-bookings', component: MyBookingsComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'ride-sharing', component: RideSharingComponent },
  { path: 'trip-division', component: TripDivisionComponent },
  { path: 'ride-share', component: RideShareComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'rent', component: VehicleRentalComponent },
  { path: 'admin-ride-share', component: AdminRideShareComponent },
  { path: 'dash-services', component: DashServicesComponent },
  { path: 'dash-board', component: DashBoardComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})

export class AppRoutingModule { }
