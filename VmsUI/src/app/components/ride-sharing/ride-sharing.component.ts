
/// <reference types="@types/googlemaps" />

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { MatDialog, MatDialogRef, MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';


declare const google: any;
declare global {
  interface Window {
    initializeMap: () => void;
  }
}

@Component({
  selector: 'app-ride-sharing',
  templateUrl: './ride-sharing.component.html',
  styleUrls: ['./ride-sharing.component.css'],
})
export class RideSharingComponent implements OnInit {
  openDialog(enterAnimationDuration: string, exitAnimationDuration: string): void {
    this.dialog.open(DialogAnimationsExampleDialog, {
      width: '400px',
      height: '500px',
      enterAnimationDuration,
      exitAnimationDuration,
    });
  }



  searchResult: any;
  source: string = "";
  destination: string = "";
  date: string = "";
  passengers: number = 0;

  map: any;
  directionsService: any;
  directionsDisplay: any;

  constructor(private http: HttpClient, public dialog: MatDialog) { }

  ngOnInit(): void {
    window.initializeMap = () => {
      const myLatLng = { lat: 18.5204, lng: 73.8567 };
      const mapOptions = {
        center: myLatLng,
        zoom: 7,
        mapTypeId: google.maps.MapTypeId.ROADMAP
      };
      this.map = new google.maps.Map(document.getElementById('googleMap'), mapOptions);

      this.directionsService = new google.maps.DirectionsService();
      this.directionsDisplay = new google.maps.DirectionsRenderer();

      const input1 = document.getElementById("source") as HTMLInputElement;
      const src = new google.maps.places.Autocomplete(input1);

      const input2 = document.getElementById("destination") as HTMLInputElement;
      const dist = new google.maps.places.Autocomplete(input2);

      google.maps.event.addListener(src, 'place_changed', () => {
        const source = src.getPlace().name;
        const latSrc = src.getPlace().geometry.location.lat();
        const longSrc = src.getPlace().geometry.location.lng();
      });

      google.maps.event.addListener(dist, 'place_changed', () => {
        const destination = dist.getPlace().name;
        const latDest = dist.getPlace().geometry.location.lat();
        const longDest = dist.getPlace().geometry.location.lng();
      });

      const request = {
        origin: this.source,
        destination: this.destination,
        travelMode: google.maps.TravelMode.DRIVING,
        unitSystem: google.maps.UnitSystem.IMPERIAL
      };

      this.directionsService.route(request, (result: any, status: any) => {
        if (status == google.maps.DirectionsStatus.OK) {
          const output = document.getElementById("output");
          if (output != null) {
            output.innerHTML = "<div class='alert-info'>From: " + this.source + ".<br />To: " + this.destination + ".<br /> Driving distance <i class='fas fa-road'></i> : " + result.routes[0].legs[0].distance.text + ".<br />Duration <i class='fas fa-hourglass-start'></i> : " + result.routes[0].legs[0].duration.text + ".</div>";
          }
          this.directionsDisplay.setDirections(result);
        } else {
          this.directionsDisplay.setDirections({ routes: [] });
          const output = document.getElementById("output");
          if (output != null) {
            output.innerHTML = "<div class='alert-danger'><i class='fas fa-exclamation-triangle'></i> Could not retrieve driving distance.</div>";
          }
        }
      });

      this.directionsDisplay.setMap(this.map);
    };

    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = `https://maps.googleapis.com/maps/api/js?key=AIzaSyCx4VpvSh6mgFuyRbGGjoPUV9973fUqW6o&libraries=places&callback=initializeMap`;
    document.body.appendChild(script);
  }

  calcRoute(): void {
    const request = {
      origin: this.source,
      destination: this.destination,
      travelMode: google.maps.TravelMode.DRIVING,
      unitSystem: google.maps.UnitSystem.IMPERIAL
    };

    this.directionsService.route(request, (result: any, status: any) => {
      if (status == google.maps.DirectionsStatus.OK) {
        const output = document.getElementById("output");
        if (output != null) {
          output.innerHTML = "<div class='alert-info'>From: " + this.source + ".<br />To: " + this.destination + ".<br /> Driving distance <i class='fas fa-road'></i> : " + result.routes[0].legs[0].distance.text + ".<br />Duration <i class='fas fa-hourglass-start'></i> : " + result.routes[0].legs[0].duration.text + ".</div>";
        }
        this.directionsDisplay.setDirections(result);
      } else {
        this.directionsDisplay.setDirections({ routes: [] });
        const output = document.getElementById("output");
        if (output != null) {
          output.innerHTML = "<div class='alert-danger'><i class='fas fa-exclamation-triangle'></i> Could not retrieve driving distance.</div>";
        }
      }
    });
  }
}
import { NgIf } from '@angular/common';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'dialog-animations-example-dialog',
  templateUrl: 'dialog-animations-example-dialog.html',
  standalone: true,
  imports: [MatDialogModule, MatButtonModule, CommonModule],

})
export class DialogAnimationsExampleDialog {
  constructor(public dialogRef: MatDialogRef<DialogAnimationsExampleDialog>, private http: HttpClient) { }
  searchResult: any;
  date: string = "";
  passengers: number = 0;
  searchRide() {
    const apiUrl = 'http://localhost:8083/api/rides/getAllCars';
    const queryParams = `?date=${this.date}&passengers=${this.passengers}`;

    this.http.get(apiUrl + queryParams).subscribe(
      (response: any) => {
        this.searchResult = {
          date: this.date,
          passengers: this.passengers,
          carDetails: response
        };
        console.log(this.searchResult);
      },
      (error) => {
        console.error(error);
      }
    );
  }

}





















