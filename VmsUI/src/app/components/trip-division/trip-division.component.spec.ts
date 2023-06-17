import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TripDivisionComponent } from './trip-division.component';

describe('TripDivisionComponent', () => {
  let component: TripDivisionComponent;
  let fixture: ComponentFixture<TripDivisionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TripDivisionComponent]
    });
    fixture = TestBed.createComponent(TripDivisionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
