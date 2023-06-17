import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleRentalComponent } from './vehicle-rental.component';

describe('VehicleRentalComponent', () => {
  let component: VehicleRentalComponent;
  let fixture: ComponentFixture<VehicleRentalComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VehicleRentalComponent]
    });
    fixture = TestBed.createComponent(VehicleRentalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
