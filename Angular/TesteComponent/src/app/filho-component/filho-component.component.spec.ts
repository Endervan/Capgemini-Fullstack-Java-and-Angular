import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FilhoComponentComponent } from './filho-component.component';

describe('FilhoComponentComponent', () => {
  let component: FilhoComponentComponent;
  let fixture: ComponentFixture<FilhoComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FilhoComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FilhoComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
