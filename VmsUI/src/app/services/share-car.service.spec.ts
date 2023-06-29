import { TestBed } from '@angular/core/testing';

import { ShareCarService } from './share-car.service';

describe('ShareCarService', () => {
  let service: ShareCarService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShareCarService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
