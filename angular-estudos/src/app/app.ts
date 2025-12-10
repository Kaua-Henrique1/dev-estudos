import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  respostasQuantidade = null;
  gabarito = '';
  gabaritoAluno = '';
  mensagemError = '';
  mensagemAcertos = '';

  cpf: number = 0;
  mensagemSaida: string = '';
  mensagem: string = '';

  verificarGabarito() {
    const listaGabarito: string[] = this.gabarito.split('');
    const listaGabaritoAluno: string[] = this.gabaritoAluno.split('');
    let contagemAcertos = 0

    if (this.respostasQuantidade === listaGabarito.length && this.respostasQuantidade === listaGabaritoAluno.length) {
      for (let index = 0; index < this.respostasQuantidade; index++) {
        const gabaritoVerificacao = listaGabarito[index];
        const alunoVerificacao = listaGabaritoAluno[index];
        if (gabaritoVerificacao === alunoVerificacao) {
          contagemAcertos ++
        }
      }
      this.mensagemAcertos = "Acertos: " + contagemAcertos
      this.mensagemError = "";

    } else {
      this.mensagemError = "O Gabarito e o Gabarito do Aluno devem ser igual as Questoes."
      this.mensagemAcertos = ""
    }
  }

  verificacaoCpf() {
    const numerosCpf: number[] = String(this.cpf).split('').map(d => Number(d));

    if (numerosCpf.length !== 9) {
      this.mensagem = 'Precisa informar 9 dígitos.';
      return;
    }
    let sequecia = 10;
    let Soma1 = 0;
    let digito = 0;
    for (let index = 0; index < numerosCpf.length; index++) {
      digito = numerosCpf[index];
      Soma1 += digito * sequecia;
      sequecia--;
    }
    let Resto = Soma1 % 11
    let D1: number;
    if (Resto === 0 || Resto === 1) {
      D1 = 0
    } else {
      D1 = 11 - Resto
    }

    numerosCpf[9] = D1
    let Soma2 = 0;
    let sequecia2 = 11;
    for (let index = 0; index < numerosCpf.length; index++) {
      digito = numerosCpf[index];
      Soma2 += digito * sequecia2
      sequecia2--
    }
    let Resto2 = Soma2 % 11
    let D2: number;
    if (Resto2 === 0 || Resto2 === 1) {
      D2 = 0
    } else {
      D2 = 11 - Resto2
    }
    this.mensagemSaida ="D1: " + D1 + ". D2: " + D2
  }

  protected readonly title = signal('angular-estudos');
}
