import { registroNotas } from "./resgistroNotas";
import { diario } from "./diario";
import { turno } from "./diario";
import { SituacaoEstudante } from "./resgistroNotas";


let kaua = new registroNotas("Kauã H",20251148060019,60,50)
let lucas = new registroNotas("Lucas",20251148060000,76,80)
let marcos = new registroNotas("Marcos",20251180609,10,70)
let giovanna = new registroNotas("Giovanna",2040619,80,90)
let carlito = new registroNotas("Carlito",2486465420019,10,30)

let aluno = new diario("POO","KAUA","TSI","B123",100,turno.turnoVes)


console.log(kaua.calcularMedia())
console.log(kaua.calcularMediaFinal(5))

console.log(lucas.calcularMedia())
console.log(lucas.calcularMediaFinal(50))

console.log(marcos.calcularMedia())
console.log(marcos.calcularMediaFinal(80))

console.log(giovanna.calcularMedia())
console.log(giovanna.calcularMediaFinal())

console.log(carlito.calcularMedia())
console.log(carlito.calcularMediaFinal(50))

aluno.adicionarEstudante(kaua);
aluno.adicionarEstudante(lucas);
aluno.adicionarEstudante(marcos);
aluno.adicionarEstudante(giovanna);
aluno.adicionarEstudante(carlito);



aluno.registroNotas.forEach(estudante => {
    console.log('- ' + estudante.nomeEstudante + ': MediaParcial ' + estudante.mediaParcial + ', MediaFinal ' + estudante.mediaFinal + ', Situação: ' + estudante.situacaoEstudante);});