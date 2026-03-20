import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentPai } from './parent-pai';

describe('ParentPai', () => {
  let component: ParentPai;
  let fixture: ComponentFixture<ParentPai>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ParentPai]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParentPai);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
