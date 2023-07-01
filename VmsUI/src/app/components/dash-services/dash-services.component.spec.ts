import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashServicesComponent } from './dash-services.component';

describe('DashServicesComponent', () => {
  let component: DashServicesComponent;
  let fixture: ComponentFixture<DashServicesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DashServicesComponent]
    });
    fixture = TestBed.createComponent(DashServicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
