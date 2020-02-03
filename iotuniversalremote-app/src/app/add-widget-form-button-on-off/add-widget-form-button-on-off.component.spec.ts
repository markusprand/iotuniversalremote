import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddWidgetFormButtonOnOffComponent } from './add-widget-form-button-on-off.component';

describe('AddWidgetFormButtonOnOffComponent', () => {
  let component: AddWidgetFormButtonOnOffComponent;
  let fixture: ComponentFixture<AddWidgetFormButtonOnOffComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddWidgetFormButtonOnOffComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddWidgetFormButtonOnOffComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
