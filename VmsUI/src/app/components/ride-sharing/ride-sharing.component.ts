import { Component, OnInit } from '@angular/core';
import { Rides } from './rides';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'app/services/auth.service';
@Component({
  selector: 'app-ride-sharing',
  templateUrl: './ride-sharing.component.html',
  styleUrls: ['./ride-sharing.component.css']
})
export class RideSharingComponent implements OnInit {
  rides: Rides[];
  rideSharing: FormGroup;
  constructor(private fb: FormBuilder, private authService: AuthService, private route: Router) {
    this.rides = [];
    this.rideSharing = this.fb.group({
      ride_source: ['', [Validators.required]],
      ride_destination: ['', Validators.required],
    });

  }

  ngOnInit(): void {
    this.authService.getRides().subscribe((data: Rides[]) => {
      console.log(data);
      this.rides = data;
    });
  }
  onSubmit(RideSharing: FormGroup) {
    this.route.navigate(['/profile']);
  }
}
