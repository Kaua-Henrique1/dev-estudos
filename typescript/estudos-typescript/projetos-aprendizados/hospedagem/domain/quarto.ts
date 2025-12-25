export class Quarto {
    private _numero: number
    private _valor: number

    constructor(numero: number,valor: number) {
        this._numero = numero
        this._valor = valor
    }

    
    public get numero() : number {
        return this._numero
    }
    public set numero(v : number) {
        this._numero = v;
    }

    public get valor() : number {
        return this._valor
    }
    public set valor(v : number) {
        this._valor = v;
    }    
    
}