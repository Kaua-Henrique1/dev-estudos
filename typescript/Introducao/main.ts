let notas = [10, 20, 30]

let media = 0
notas.forEach(n => {
    media += n
})
console.log('Media da turma = ' + media/notas.length)

enum Marca {
    VW, Toyota, BMW, Mercedes, Ford
}

enum Curso {
    TSI = 'Tecnologia em Sistemas para Internet',
    INFO = 'Tecnico Integrado em Informatica',
    MECA = 'Tecnico Integrado em Informatica'
}
// any: Qualquer tipo, pode ser por exemplo varias listas de diferentes tipos.
let carro: any[] = ['320i', 2023, 280000, Marca.VW]

let estudante = ['Kauã', 2006]

console.log(carro)
console.log(carro[0])