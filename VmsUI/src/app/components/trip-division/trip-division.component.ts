import { ViewportScroller } from '@angular/common';
import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';




interface Card {
  image: string;
  title: string;
  subtitle: string;
  description: string;
}




@Component({
  selector: 'app-trip-division',
  templateUrl: './trip-division.component.html',
  styleUrls: ['./trip-division.component.css']
})
export class TripDivisionComponent {
  cards: Card[] = [
    {
      image: '../../assets/tripAssets/bus1.jpg',
      title: 'Card 1',
      subtitle: 'Subtitle 1',
      description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'
    },
    {
      image: '../../assets/tripAssets/bus2.jpg',
      title: 'Card 2',
      subtitle: 'Subtitle 2',
      description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'
    },
    {
      image: '../../assets/tripAssets/bus3.jpg',
      title: 'Card 3',
      subtitle: 'Subtitle 3',
      description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'
    }
    // Add more cards as needed
  ];

  constructor(private viewportScroller: ViewportScroller) {}

  scrollToCards(): void {
    const element = document.getElementById('cardsSection');
    if (element) {
      element.scrollIntoView({ behavior: 'smooth' });
    }
  }
}
