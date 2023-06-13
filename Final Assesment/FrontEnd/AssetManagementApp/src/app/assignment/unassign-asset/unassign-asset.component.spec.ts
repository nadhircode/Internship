import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UnassignAssetComponent } from './unassign-asset.component';

describe('UnassignAssetComponent', () => {
  let component: UnassignAssetComponent;
  let fixture: ComponentFixture<UnassignAssetComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UnassignAssetComponent]
    });
    fixture = TestBed.createComponent(UnassignAssetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
