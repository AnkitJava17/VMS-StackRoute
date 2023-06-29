import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RideShareComponent } from './ride-share.component';

describe('RideShareComponent', () => {
  let component: RideShareComponent;
  let fixture: ComponentFixture<RideShareComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RideShareComponent]
    });
    fixture = TestBed.createComponent(RideShareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
