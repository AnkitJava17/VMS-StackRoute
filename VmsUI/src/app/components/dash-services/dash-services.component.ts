import { Component } from '@angular/core';
import { RouterService } from 'app/services/router.service';

@Component({
  selector: 'app-dash-services',
  templateUrl: './dash-services.component.html',
  styleUrls: ['./dash-services.component.css']
})
export class DashServicesComponent {
  constructor(private routerService: RouterService) {

  }
  rent() {
    this.routerService.toRent();
  }
  ride() {
    this.routerService.toRideShare();
  }
  trip() {
    this.routerService.toTripDivision();
  }
}
