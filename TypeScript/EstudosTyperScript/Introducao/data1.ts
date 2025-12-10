// let hoje = new Date()
// console.log(hoje.getMonth()+1)
// console.log(hoje.getDay()+1)

let d = new Date();
let time = d.getHours();

console.log(`Hoje é dia
${d.getDate()}/${d.getMonth()}/${d.getFullYear()}`);

if (time < 12) {
console.log("Bom dia!");
} else if (time >= 12 && time < 18) {
console.log("Boa tarde!");
} else {
console.log("Boa noite!");
}