import { Component, signal,computed } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  estoque = signal(0);
  precoUni = signal(15) 
  
  
  valorTotal = computed(()=>{
    return this.estoque() * this.precoUni()
  });

  aumentarEstoque() {
    this.estoque.update(e => e + 1)
  }
  diminuirEstoque() {
    this.estoque.update(e => {
      if (e > 0) {
        return e - 1
      }
      return e;
    });
  }
  



  protected readonly title = signal('exercicio-signals');
}
