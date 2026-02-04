import { Cliente } from "./cliente.js"
import { Conta } from "./conta.js"


export class Corrente extends Conta {
    private taxa = 0.01

    constructor(cliente_titular: Cliente, saldo: number) {
        super(cliente_titular, saldo)
    }


    override debitar(valor: number): boolean {
        let saldo_atual = this.consultarSaldo()

        const valor_taxado = valor + (valor * this.taxa)
        if (saldo_atual < valor_taxado) {
            return false
        }
        this.saldo -= valor_taxado
        return true
    }
}
