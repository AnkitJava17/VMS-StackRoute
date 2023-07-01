import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TdcardsComponent } from './tdcards.component';

describe('TdcardsComponent', () => {
  let component: TdcardsComponent;
  let fixture: ComponentFixture<TdcardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TdcardsComponent]
    });
    fixture = TestBed.createComponent(TdcardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
