import { Component, input, Input } from '@angular/core';
import { NgClass } from "../../../../node_modules/@angular/common/common_module.d";

@Component({
  selector: 'app-parent-data',
  imports: [NgClass],
  templateUrl: './parent-data.html',
  styleUrl: './parent-data.css'
})
export class ParentData {
  @Input() name: string = '';

  @Input() userData!: {email: string; role: string};
}
