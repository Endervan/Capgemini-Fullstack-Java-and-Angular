import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaiComponentComponent } from './pai-component.component';

describe('PaiComponentComponent', () => {
  let component: PaiComponentComponent;
  let fixture: ComponentFixture<PaiComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaiComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaiComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
