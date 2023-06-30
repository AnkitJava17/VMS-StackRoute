import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminRideShareComponent } from './admin-ride-share.component';

describe('AdminRideShareComponent', () => {
  let component: AdminRideShareComponent;
  let fixture: ComponentFixture<AdminRideShareComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdminRideShareComponent]
    });
    fixture = TestBed.createComponent(AdminRideShareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
