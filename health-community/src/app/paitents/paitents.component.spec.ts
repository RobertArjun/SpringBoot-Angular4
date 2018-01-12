import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaitentsComponent } from './paitents.component';

describe('PaitentsComponent', () => {
  let component: PaitentsComponent;
  let fixture: ComponentFixture<PaitentsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaitentsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaitentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
