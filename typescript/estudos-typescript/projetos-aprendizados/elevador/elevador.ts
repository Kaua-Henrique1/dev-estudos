class Elevador {
    private _andar: number = 0
    private _capacidadePessoas: number = 0 
    private _isPortaAberta: boolean
    public _CAPACIDADE_TOTAL: number
    public _ANDARES_TOTAL: number
    public _ANDAR_ATUAL: number

    constructor(andar: number, capacidadePessoas: number, CAPACIDADE_TOTAL: number, ANDARES_TOTAL: number, ANDAR_ATUAL: number) {
        this._andar = andar
        this._capacidadePessoas = capacidadePessoas
        this._CAPACIDADE_TOTAL = CAPACIDADE_TOTAL
        this._ANDARES_TOTAL = ANDARES_TOTAL
        this._ANDAR_ATUAL = ANDAR_ATUAL
        this._isPortaAberta = false
    }
    
    inicializar() {
        this._CAPACIDADE_TOTAL = 12
        this._ANDARES_TOTAL = 10
        this._ANDAR_ATUAL = 1
    }
    entrar(entrarPessoas: number) {
        if(this.capacidadePessoas > this._CAPACIDADE_TOTAL || this.isPortaAberta == false ) {
            return console.log("Elevador não se move! (SOBRECARGA DE PESSOAS ou PORTA FECHADA)")
        }
        this.capacidadePessoas += entrarPessoas
        this.isPortaAberta = false
    }
    sair(sairPessoas: number) {
        if(this.capacidadePessoas < 1 || this.isPortaAberta == false) {
            return console.log("Elevador não se move! (SOBRECARGA DE PESSOAS ou PORTA FECHADA)")
        }
        this.capacidadePessoas -= sairPessoas
    }
    subir() {
        if(this._ANDAR_ATUAL != this._ANDARES_TOTAL) {
            this._ANDAR_ATUAL ++
            return console.log("ANDAR_ATUAL: "+this._ANDAR_ATUAL)
        } else {
            return console.log("Andar limite (IMPOSSIVEL SUBIR)")
        }
    }
    descer() {
        if (this._ANDAR_ATUAL > 1) {
            this._ANDAR_ATUAL --
            return console.log("ANDAR_ATUAL: "+this._ANDAR_ATUAL)
        } else {
            return console.log("Andar limite (IMPOSSIVEL DESCER)")
        }
    }



    
    public get andar() : number {
        return this._andar
    }
    public set andar(v : number) {
        this._andar = v;
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
    
    public get ANDAR_ATUAL() : number {
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