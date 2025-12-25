import { Hospede } from "./hospedes.js"
import { Quarto } from "./quarto.js"

export class Reserva {
    private _hospedes: Hospede[]
    private _quarto: Quarto
    private _diaria: number
    private _total: number

    constructor(quarto: Quarto) {
        this._hospedes = []
        this._quarto = quarto
        this._diaria = 0
        this._total = 0
    }

    adicionarHospede(hospede: Hospede): boolean {
        if (this.hospedes.length >= 3) {
            console.log("Limite de hospedes maximo (3)")
            return false
        }
        this.hospedes.push(hospede)
        return true
    }
    calcularTotal(): number {
        this.total = this.diaria * this.quarto.valor 
        return this.total
    }


    public set hospedes(v: Hospede[]) {
        this._hospedes = v;
    }
    public get hospedes(): Hospede[] {
        return this._hospedes
    }

    public set quarto(v: Quarto) {
        this._quarto = v;
    }
    public get quarto(): Quarto {
        return this._quarto
    }

    public set diaria(v: number) {
        this._diaria = v;
    }
    public get diaria(): number {
        return this._diaria
    }

    public set total(v: number) {
        this._total = v;
    }
    public get total(): number {
        return this._total
    }


}