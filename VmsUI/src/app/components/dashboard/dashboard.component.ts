import { Component } from '@angular/core';
import { RouterService } from 'app/services/router.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  constructor(private routerService:RouterService){
    
  }
  rent(){
    this.routerService.toRent();
  }
  ride(){
    this.routerService.toRideShare();
  }
  trip(){
    this.routerService.toTripDivision();
  }
}

