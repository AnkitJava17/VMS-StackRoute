import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { LoginComponent } from './components/login/login.component';
import { MyBookingsComponent } from './components/my-bookings/my-bookings.component';
import { ProfileComponent } from './components/profile/profile.component';
import { RideSharingComponent } from './components/ride-sharing/ride-sharing.component';
import { TripDivisionComponent } from './components/trip-division/trip-division.component';
import { VehicleRentalComponent } from './components/vehicle-rental/vehicle-rental.component';
import { AdminComponent } from './components/admin/admin.component';
import { AppComponent } from './app.component';
import { RideShareComponent } from './components/ride-share/ride-share.component';
import { FooterComponent } from './components/footer/footer.component';
import { AdminRideShareComponent } from './components/admin-ride-share/admin-ride-share.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'dashboard' },
  { path: 'about-us', component: AboutUsComponent },
  { path: 'contact-us', component: ContactUsComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'login', component: LoginComponent },
  { path: 'my-bookings', component: MyBookingsComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'ride-sharing', component: RideSharingComponent },
  { path: 'trip-division', component: TripDivisionComponent },
  { path: 'ride-share', component: RideShareComponent },
  { path: 'admin', component: AdminComponent },
  {path: 'rent', component:VehicleRentalComponent}
  { path: 'footer', component: FooterComponent },
  { path: 'admin-ride-share', component: AdminRideShareComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})

export class AppRoutingModule { }
