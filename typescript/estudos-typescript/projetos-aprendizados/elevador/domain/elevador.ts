export class Elevador {
    private _capacidadePessoas: number
    private _isPortaAberta: boolean
    public _CAPACIDADE_TOTAL: number 
    public _ANDARES_TOTAL: number
    public _ANDAR_ATUAL: number

    constructor() {
        this._capacidadePessoas = 0
        this._CAPACIDADE_TOTAL = 0
        this._ANDARES_TOTAL = 0
        this._ANDAR_ATUAL = 0
        this._isPortaAberta = false
    }

    inicializar(capacidade: number, andar_maximo: number) {
        this._CAPACIDADE_TOTAL = capacidade
        this._ANDARES_TOTAL = andar_maximo
        this._ANDAR_ATUAL = 0
    }
    entrar(entrarPessoas: number) {
        this.isPortaAberta = true
        if(entrarPessoas + this.capacidadePessoas > this._CAPACIDADE_TOTAL) {
            return console.log("Elevador não se move! (SOBRECARGA DE PESSOAS)")
        }
        this.capacidadePessoas += entrarPessoas
        this.isPortaAberta = false
        return console.log("Pessoas dentro do elavador. Total agora: "+this.capacidadePessoas)
    }
    sair(sairPessoas: number) {
        this.isPortaAberta = true
        if(this.capacidadePessoas - sairPessoas < 0) {
            return console.log("Elevador não se move! (INSUFICIENTE PARA SAIR)")
        }
        this.capacidadePessoas -= sairPessoas
        this.isPortaAberta = false
        return console.log("Pessoas fora do elavador. Total agora: "+this.capacidadePessoas)
    }
    subir() {
        if(this.ANDAR_ATUAL != this.ANDARES_TOTAL && this.isPortaAberta == false ) {
            this.ANDAR_ATUAL ++
            return console.log("ANDAR_ATUAL: "+this.ANDAR_ATUAL)
        } else {
            return console.log("Andar limite (IMPOSSIVEL SUBIR ou PORTA FECHADA))")
        }
    }
    descer() {
        if (this.ANDAR_ATUAL > 0 && this.isPortaAberta == false ) {
            this.ANDAR_ATUAL --
            return console.log("ANDAR_ATUAL: "+this.ANDAR_ATUAL)
        } else {
            return console.log("Andar limite (IMPOSSIVEL DESCER ou PORTA FECHADA))")
        }
    }

    public get capacidadePessoas() : number {
        return this._capacidadePessoas
    }
    public set capacidadePessoas(v : number) {
        this._capacidadePessoas = v;
    }
    
    public get CAPACIDADE_TOTAL() : number {
        return this._CAPACIDADE_TOTAL
    }
    public set CAPACIDADE_TOTAL(v : number) {
        this._CAPACIDADE_TOTAL = v;
    }
    
    public get ANDAR_ATUAL() : number{
        return this._ANDAR_ATUAL
    }
    public set ANDAR_ATUAL(v : number) {
        this._ANDAR_ATUAL = v;
    }    

    public get ANDARES_TOTAL() : number {
        return this._ANDARES_TOTAL
    }
    public set ANDARES_TOTAL(v : number) {
        this._ANDARES_TOTAL = v;
    }    

    public get isPortaAberta() : boolean {
        return this._isPortaAberta
    }
    public set isPortaAberta(v : boolean) {
        this._isPortaAberta = v;
    }       
} 