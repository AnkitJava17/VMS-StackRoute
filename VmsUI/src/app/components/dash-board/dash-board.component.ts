import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dash-board',
  templateUrl: './dash-board.component.html',
  styleUrls: ['./dash-board.component.css']
})
export class DashBoardComponent implements OnInit {
  images: any;
  responsiveOptions;
  constructor() {
    this.responsiveOptions = [{
      breakpoint: '1024px',
      numVisible: 1,
      numScroll: 3
    }];
  }
  ngOnInit(): void {
    this.images = [
      { random: 'Car on rentals provides us very good service that they helped us to reach out the destination without any problem and also without stress.', picture: 'https://picsum.photos/id/944/900/500' },
      { random: 'The rates were moderate, driver was acceptable, and the general experience was additionally marvelous.', picture: 'https://picsum.photos/id/1011/900/500' },
      { random: 'Tonga', picture: 'https://picsum.photos/id/984/900/500' },
      { random: 'Cook Island', picture: 'https://picsum.photos/id/944/900/500' },
      { random: 'Niue', picture: 'https://picsum.photos/id/1011/900/500' },
      { random: 'American Samoa', picture: 'https://picsum.photos/id/984/900/500' }
    ];
  }
}
