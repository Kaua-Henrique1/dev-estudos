import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { ParentData } from "./componets/parent-data/parent-data";
import { ParentPai } from "./componets/parent-pai/parent-pai";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule, ParentData, ParentPai],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  userName = "Kaua";
  userData =  {
      email: 'kaua2006@gmail.com',
      role: 'Admin'
    };

  protected readonly title = signal('angular-estudos');
}
