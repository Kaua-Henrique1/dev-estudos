import { Hospede } from "./hospedes.js"
import { Quarto } from "./quarto.js"

export class Reserva {
    private _hospedes: Hospede[]
    private _quarto: Quarto
    private _diario: number
    private _total: number

    constructor(hospedes: Hospede[], quarto: Quarto, diario: number, total: number) {
        this._hospedes = hospedes
        this._quarto = quarto
        this._diario = diario
        this._total = total
    }

    public set hospedes(v: Hospede[]) {
        this._hospedes = v;
    } 
    public get hospedes() : Hospede[] {
        return this._hospedes
    }
    


}