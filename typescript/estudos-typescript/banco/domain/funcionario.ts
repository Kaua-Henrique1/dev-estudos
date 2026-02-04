import { Cliente } from "./cliente.js"
import { Conta } from "./conta.js"
import { Corrente } from "./correnteConta.js"
import { Poupanca } from "./poupancaConta.js"
import { TipoConta } from "./tipoConta.js"

export class Funcionario {
    _cliente: Cliente
    _contaCorrente: Corrente
    _contaPoupanca: Poupanca

    constructor(cliente?: Cliente, corrente?: Corrente, poupanca?: Poupanca) {
        this._cliente = cliente!
        this._contaCorrente = corrente!
        this._contaPoupanca = poupanca!
    }

    criarConta(cliente: Cliente, saldoInicial: number, escolhaConta: TipoConta) {

        if (escolhaConta == TipoConta.CORRENTE) {
            return new Corrente(cliente, saldoInicial)       
        }
        return new Poupanca(cliente, saldoInicial)       
    }

    autorizarEmprestimo(cliente: Cliente, valorEmpresto: number):boolean {
        const renda_bruta_30 = (cliente.renda_bruta * 0.3) 
        if (valorEmpresto <= renda_bruta_30) {
            return true
        }
        return false
    }

    realizarEmprestimo(contaDestino: Conta, valorEmpresto: number):boolean {
        let cliente = contaDestino.clienteTitular

        let isTrue = this.autorizarEmprestimo(cliente, valorEmpresto)  
        if (isTrue) {
            contaDestino.creditar(valorEmpresto)
            return true
        }
        return false
    }
    
    public set cliente(v : Cliente) {
        this._cliente = v;
    }
    public get cliente() : Cliente {
        return this._cliente
    }
    
    public set poupanca(v : Poupanca) {
        this._contaPoupanca = v;
    }
    public get poupanca() : Poupanca {
        return this._contaPoupanca
    }

    public set corrente(v : Corrente) {
        this._contaCorrente = v;
    }
    public get corrente() : Corrente {
        return this._contaCorrente
    }

    public set conta(v : Corrente) {
        this._contaCorrente = v;
    }
    public get conta() : Corrente {
        return this._contaCorrente
    }
}