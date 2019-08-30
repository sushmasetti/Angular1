import { TestBed } from '@angular/core/testing';

import { BnNgIdleService } from './bn-ng-idle.service';

describe('BnNgIdleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BnNgIdleService = TestBed.get(BnNgIdleService);
    expect(service).toBeTruthy();
  });
});
