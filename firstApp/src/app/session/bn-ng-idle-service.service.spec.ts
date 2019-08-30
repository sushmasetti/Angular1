import { TestBed } from '@angular/core/testing';

import { BnNgIdleServiceService } from './bn-ng-idle-service.service';

describe('BnNgIdleServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BnNgIdleServiceService = TestBed.get(BnNgIdleServiceService);
    expect(service).toBeTruthy();
  });
});
