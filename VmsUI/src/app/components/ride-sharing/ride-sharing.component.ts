/// <reference types="@types/googlemaps" />

import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Rides } from './rides';
import { } from "googlemaps";


// declare function rideMap(): void;
declare const google: any;
// declare function calcRoute(): void;
declare global {
  interface Window {
    initializeMap: () => void;
  }
}

// const calcRoute = app.calcRoute;

@Component({
  selector: 'app-ride-sharing',
  templateUrl: './ride-sharing.component.html',
  styleUrls: ['./ride-sharing.component.css']
})
export class RideSharingComponent implements OnInit {
  searchResult: any;
  source: string = "";
  destination: string = "";
  date: string = "";
  passengers: number = 0;
  //searchRides: Rides[] = [];
  map: any;
  result: any;
  status: any;
  output: any;
  latSrc: any;
  longSrc: any;
  latDist: any;
  longDist: any;
  constructor(private http: HttpClient) { }

  //Maps
  ngOnInit(): void {

    window.initializeMap = () => {
      const myLatLng = { lat: 18.5204, lng: 73.8567 };
      const mapOptions = {
        center: myLatLng,
        zoom: 7,
        mapTypeId: google.maps.MapTypeId.ROADMAP
      };

      this.map = new google.maps.Map(document.getElementById('googleMap'), mapOptions);
      console.log(this.map);

      var input1 = document.getElementById("source");
      var src = new google.maps.places.Autocomplete(input1);

      var input2 = document.getElementById("destination");
      var dist = new google.maps.places.Autocomplete(input2);
      google.maps.event.addListener(src, 'place_changed', function () {
        var place = src.getPlace();
        console.log(place.name);
        const latSrc = place.geometry.location.lat();
        const longSrc = place.geometry.location.lng();
        console.log(latSrc);
        console.log(longSrc);
      });

    }

    const script = document.createElement('script');
    // console.log(script);
    script.type = 'text/javascript';
    script.src = `https://maps.googleapis.com/maps/api/js?key=AIzaSyCx4VpvSh6mgFuyRbGGjoPUV9973fUqW6o&libraries=places&callback=initializeMap`;


    document.body.appendChild(script);

  }
  calcRoute() {
    //create request
    var request = {
      origin: document.getElementById("souce"),
      destination: document.getElementById("destination"),
      travelMode: google.maps.TravelMode.DRIVING,
      unitSystem: google.maps.UnitSystem.IMPERIAL
    }

    var directionsService = new google.maps.DirectionsService();

    //create a DirectionsRenderer object which we will use to display the route
    var directionsDisplay = new google.maps.DirectionsRenderer();

    //pass the request to the route method
    directionsService.route(request, this.methodNew(directionsDisplay));


    //bind the DirectionsRenderer to the map
    directionsDisplay.setMap(this.map);
  }
  methodNew(directionsDisplay: any) {
    if (status == google.maps.DirectionsStatus.OK) {


      //Get distance and time
      this.output = document.querySelector('#output');
      if (this.output != null) {
        this.output.innerHTML = "<div class='alert-info'>From: " + document.getElementById("from") + ".<br />To: " + document.getElementById("to") + ".<br /> Driving distance <i class='fas fa-road'></i> : " + this.result.routes[0].legs[0].distance.text + ".<br />Duration <i class='fas fa-hourglass-start'></i> : " + this.result.routes[0].legs[0].duration.text + ".</div>";

      }
      //display route
      directionsDisplay.setDirections(this.result);
    } else {
      //delete route from map
      directionsDisplay.setDirections({ routes: [] });
      //center map in London
      this.map.setCenter({ lat: 18.5204, lng: 73.8567 });

      //show error message
      this.output.innerHTML = "<div class='alert-danger'><i class='fas fa-exclamation-triangle'></i> Could not retrieve driving distance.</div>";
    }
  }
}



























//   // searchRide() {
//   //   const apiUrl = 'http://localhost:8083/api/rides/getAllCars';
//   //   const queryParams = `?source=${this.source}&destination=${this.destination}&date=${this.date}&passengers=${this.passengers}`;

//   //   this.http.get(apiUrl + queryParams).subscribe(
//   //     (response: any) => {
//   //       this.searchResult = {
//   //         date: this.date,
//   //         source: this.source,
//   //         destination: this.destination,
//   //         passengers: this.passengers,
//   //         carDetails: response
//   //       };
//   //       console.log(this.searchResult);
//   //     },
//   //     (error) => {
//   //       console.error(error);
//   //     }
//   //   );
//   // }

// }
/// <reference types="@types/googlemaps" />
// import { Component, OnInit } from '@angular/core';
// import { HttpClient } from '@angular/common/http';

// declare const google: any;

// interface CustomWindow extends Window {
//   initializeMap: () => void;
// }

// declare let window: CustomWindow;

// @Component({
//   selector: 'app-ride-sharing',
//   templateUrl: './ride-sharing.component.html',
//   styleUrls: ['./ride-sharing.component.css']
// })
// export class RideSharingComponent implements OnInit {
//   searchResult: any;
//   source: string = "";
//   destination: string = "";
//   date: string = "";
//   passengers: number = 0;

//   constructor(private http: HttpClient) { }

//   ngOnInit(): void {
//     document.addEventListener("DOMContentLoaded", () => {
//       window.initializeMap = () => {
//         const myLatLng = { lat: 18.5204, lng: 73.8567 };
//         const mapOptions = {
//           center: myLatLng,
//           zoom: 7,
//           mapTypeId: google.maps.MapTypeId.ROADMAP
//         };
//         const map = new google.maps.Map(document.getElementById('googleMap'), mapOptions);

//         // create a DirectionsService object to use the route method and get a result for our request
//         const directionsService = new google.maps.DirectionsService();

//         // create a DirectionsRenderer object which we will use to display the route
//         const directionsDisplay = new google.maps.DirectionsRenderer();

//         // bind the DirectionsRenderer to the map
//         directionsDisplay.setMap(map);

//         // define calcRoute function
//         interface DirectionsResponse {
//           routes: google.maps.DirectionsRoute[];
//         }

//         interface google.maps.DirectionsRoute {
//           legs: google.maps.DirectionsLeg[];
//         }

//         interface google.maps.DirectionsLeg {
//           distance: {
//             text: string;
//           };
//           duration: {
//             text: string;
//           };
//         }

//         const calcRoute = () => {
//           const sourceElement = <HTMLInputElement>document.getElementById("source");
//           const destinationElement = <HTMLInputElement>document.getElementById("destination");

//           if (sourceElement && destinationElement) {
//             const source = sourceElement.value;
//             const destination = destinationElement.value;

//             // create request
//             const request = {
//               origin: source,
//               destination: destination,
//               travelMode: google.maps.TravelMode.DRIVING,
//               unitSystem: google.maps.UnitSystem.IMPERIAL
//             };

//             // pass the request to the route method
//             directionsService.route(request, (result: DirectionsResponse, status: google.maps.DirectionsStatus) => {
//               if (status == google.maps.DirectionsStatus.OK) {
//                 // Get distance and time
//                 const output = document.querySelector('#output');
//                 if (output) {
//                   output.innerHTML = "<div class='alert-info'>From: " + source + ".<br />To: " + destination + ".<br /> Driving distance <i class='fas fa-road'></i> : " + result.routes[0].legs[0].distance.text + ".<br />Duration <i class='fas fa-hourglass-start'></i> : " + result.routes[0].legs[0].duration.text + ".</div>";
//                 }

//                 // display route
//                 directionsDisplay.setDirections(result);
//               } else {
//                 // delete route from map
//                 directionsDisplay.setDirections({ routes: [] });
//                 // center map in London
//                 map.setCenter(myLatLng);

//                 // show error message
//                 const output = document.querySelector('#output');
//                 if (output) {
//                   output.innerHTML = "<div class='alert-danger'><i class='fas fa-exclamation-triangle'></i> Could not retrieve driving distance.</div>";
//                 }
//               }
//             });
//           }
//         };

//         const searchButton = document.getElementById("searchButton");
//         if (searchButton) {
//           searchButton.addEventListener("click", calcRoute);
//         }
//       };

//       const script = document.createElement('script');
//       script.type = 'text/javascript';
//       script.src = `https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initializeMap`;
//       document.body.appendChild(script);
//     });
//   }
// }
