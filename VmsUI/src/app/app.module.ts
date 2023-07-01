import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatMenuModule } from '@angular/material/menu';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AuthService } from './services/auth.service';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { AdminComponent } from './components/admin/admin.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';

import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/login/login.component';
import { MyBookingsComponent } from './components/my-bookings/my-bookings.component';
import { ProfileComponent } from './components/profile/profile.component';
import { RideSharingComponent } from './components/ride-sharing/ride-sharing.component';
import { TripDivisionComponent } from './components/trip-division/trip-division.component';
import { VehicleRentalComponent } from './components/vehicle-rental/vehicle-rental.component';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatCardModule } from '@angular/material/card';
import { MatDialogModule } from '@angular/material/dialog';
import { RideShareCarsComponent } from './components/ride-share-cars/ride-share-cars.component';
import { MatList, MatListModule } from '@angular/material/list';
import { RideShareComponent } from './components/ride-share/ride-share.component';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { AdminRideShareComponent } from './components/admin-ride-share/admin-ride-share.component';

import { MatSidenavModule } from '@angular/material/sidenav';
// import { MdbModalModule } from 'mdb-angular-ui-kit/modal';
// import { ModalModule } from 'mdb-angular-ui-kit/modal';

import { MatSelectModule } from '@angular/material/select';
import { CarouselModule } from 'primeng/carousel';
import { RentBikeComponent } from './components/rent-bike/rent-bike.component';
import { RentCarsComponent } from './components/rent-cars/rent-cars.component';
import { DashBoardComponent } from './components/dash-board/dash-board.component';

import { DashServicesComponent } from './components/dash-services/dash-services.component';



@NgModule({
  declarations: [
    AppComponent,
    AboutUsComponent,
    ContactUsComponent,
    FooterComponent,
    HeaderComponent,
    LoginComponent,
    MyBookingsComponent,
    ProfileComponent,
    RideSharingComponent,
    TripDivisionComponent,
    VehicleRentalComponent,
    AdminComponent,
    RideShareCarsComponent,
    RideShareComponent,
    AdminRideShareComponent,

    RentBikeComponent,
    RentCarsComponent,
    DashBoardComponent,
  
    DashServicesComponent,
  ],
  imports: [
    BrowserModule,
    MatListModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatTabsModule,
    MatButtonModule,
    MatIconModule,
    MatMenuModule,
    HttpClientModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatCardModule,
    MatDialogModule,
    MatSnackBarModule,
    MatGridListModule,
    MatListModule,
    MatCheckboxModule,
    MatSidenavModule,
    MatNativeDateModule,
    MatFormFieldModule,
    MatSelectModule,
    CarouselModule
  ],
  providers: [
    AuthService,

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
