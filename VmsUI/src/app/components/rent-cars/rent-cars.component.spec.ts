import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentCarsComponent } from './rent-cars.component';

describe('RentCarsComponent', () => {
  let component: RentCarsComponent;
  let fixture: ComponentFixture<RentCarsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RentCarsComponent]
    });
    fixture = TestBed.createComponent(RentCarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
