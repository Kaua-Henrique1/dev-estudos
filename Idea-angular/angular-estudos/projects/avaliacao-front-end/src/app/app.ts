import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule, FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  gasolina= 5.99;
  adtivada= 6.21;
  etanol= 4.56;
  disel= 5.40;
  litros: number | null = null;
  valorLitro: number | null = null;
  dataAbastecimento: Date = new Date();
  tiposCombustivel: string[] = ['Gasolina', 'Etanol', 'Diesel', 'Adtivada'];
  tipoSelecionado: string = this.tiposCombustivel[0]
  totalAbastecimento: number = 0;
  resumo: boolean = false;

  calculadoraGasolina() {
    if (this.tipoSelecionado === 'Gasolina') {
      this.valorLitro = this.gasolina
    } else if(this.tipoSelecionado === 'Etanol') {
      this.valorLitro = this.etanol
    } else if(this.tipoSelecionado === 'Diesel') {
      this.valorLitro = this.disel
    } else {
      this.valorLitro = this.adtivada
    } 
    
    if (this.litros && this.valorLitro) {
      this.resumo = true
      this.totalAbastecimento = this.valorLitro * this.litros;
    }
  }

  protected readonly title = signal('Posto de Gasolina');
}
