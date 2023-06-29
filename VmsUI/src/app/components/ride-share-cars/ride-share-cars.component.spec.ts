import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RideShareCarsComponent } from './ride-share-cars.component';

describe('RideShareCarsComponent', () => {
  let component: RideShareCarsComponent;
  let fixture: ComponentFixture<RideShareCarsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RideShareCarsComponent]
    });
    fixture = TestBed.createComponent(RideShareCarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
