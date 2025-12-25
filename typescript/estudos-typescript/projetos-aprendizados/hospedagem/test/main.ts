import { Hospede } from "../domain/hospedes.js";
import { Quarto } from "../domain/quarto.js";
import { Reserva } from "../domain/reserva.js";

let quarto1 = new Quarto(101,150)
let kaua = new Hospede("Kaua Henrique","912.123-4",8499845)
let lucas = new Hospede("Lucas ALmeida","912.123-5",8499875)
let marcos = new Hospede("Marcos Henrique","912.123-6",849122)
let giovanna = new Hospede("Giovanna","912.123-7",8499845)

let reserva = new Reserva(quarto1)

reserva.adicionarHospede(kaua)
reserva.adicionarHospede(lucas)
reserva.adicionarHospede(giovanna)

reserva.diaria = 3
reserva.calcularTotal()
console.log(reserva)

reserva.adicionarHospede(marcos)

