// let notas = [51,22,55,73,23,87]
// let pos = 0 

// while (pos<notas.length) {
//     console.log(pos)
//     pos++
// }


const read = require('readline-sync')
const nomes = [
    "Ana", "João", "Mariana", "Lucas", "Beatriz", "Pedro",
    "Camila", "Rafael", "Larissa", "Gabriel", "Ana", "João",
    "Mariana", "Lucas", "Beatriz", "Pedro", "Camila", "Rafael", 
    "Larissa", "Gabriel", "Isabela", "Mateus", "Fernanda", "Gustavo", 
    "Amanda", "Bruno", "Juliana", "Thiago", "Natália", "Felipe", 
    "Clara", "Daniel", "Letícia", "André", "Sofia", "Vinícius", 
    "Yasmin", "Eduardo", "Heloísa", "Leonardo", "Luana", "Rodrigo",
    "Manuela", "Diego", "Vitória", "Caio", "Aline", "Samuel", "Bruna",
    "Henrique", "Nicole", "Alexandre", "Lorena", "Otávio",
    "Tatiane", "Murilo", "Cecília", "Ricardo", "Melissa", "Igor"
]

const buscado = read.question('Digite o nome de uma pessoa: ')

let achou = false
let pos = 0
while (pos < nomes.length && !achou) {
    if (nomes[pos].toLowerCase() == buscado.toLowerCase()) {
        achou = true
    }
    pos++
}

if (achou) {
    console.log('Pessoa encontrada')
} else {
    console.log('Pessoa não encontrado')
}

