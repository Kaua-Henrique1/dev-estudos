import { Cliente } from "./cliente.js";
import { Conta } from "./conta.js";

export class Poupanca extends Conta {

    constructor(clienteTitular: Cliente,saldo: number) {
        super(clienteTitular, saldo)
    }
}
