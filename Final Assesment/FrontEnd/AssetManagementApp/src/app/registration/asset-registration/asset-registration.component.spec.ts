import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssetRegistrationComponent } from './asset-registration.component';

describe('AssetRegistrationComponent', () => {
  let component: AssetRegistrationComponent;
  let fixture: ComponentFixture<AssetRegistrationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AssetRegistrationComponent]
    });
    fixture = TestBed.createComponent(AssetRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
