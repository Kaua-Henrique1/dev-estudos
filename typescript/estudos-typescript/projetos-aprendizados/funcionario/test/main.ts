import { Escolaridade } from "../domain/escolaridadeEnum.js";
import { Funcionario } from "../domain/funcionario.js";

let funcionario = new Funcionario("Kaua",123,Escolaridade.CURSO_SUPERIOR)

funcionario.calculoRemuneracaoTotal(funcionario.escolaridade)

console.log(funcionario)