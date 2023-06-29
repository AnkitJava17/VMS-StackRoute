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
  navigateToCard(num: number){
    if (num == 1){
      this.routerService.toShare();
    }
  }
}
