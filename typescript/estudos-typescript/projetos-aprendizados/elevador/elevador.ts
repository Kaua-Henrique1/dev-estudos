class Elevador {
    private _andar: number = 0
    private _capacidadePessoas: number = 0 
    private _estadoAtualPorta: boolean
    public CAPACIDADE_TOTAL = 12
    // AJEITAR CAPACIDAE 

    constructor(andar: number, capacidadePessoas: number, estadoAtualPorta: estadoAtualPorta) {
        this._andar = andar
        this._capacidadePessoas = capacidadePessoas
        this._estadoAtualPorta = estadoAtualPorta
    }
    
    inicializar() {
        const CAPACIDADE_TOTAL = 12
        const ANDARES_TOTAL = 10
        if (this.capacidadePessoas > CAPACIDADE_TOTAL || this.andar > ANDARES_TOTAL) {
            return false
        }
        console.log("Ok")
        return true
    }
    entrar(entrarPessoas: number) {
        if(this.capacidadePessoas > this.CAPACIDADE_TOTAL || this.estadoAtualPorta ) {
            return console.log("Elevador não se move! (SOBRECARGA DE PESSOAS ou PORTA FECHADA)")
        }
        this.capacidadePessoas += entrarPessoas
    }
    sair(sairPessoas: number) {
        if(this.capacidadePessoas < 1 || this.estadoAtualPorta ) {
            return console.log("Elevador não se move! (SOBRECARGA DE PESSOAS ou PORTA FECHADA)")
        }
        this.capacidadePessoas -= sairPessoas
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
    
    public get estadoAtualPorta() : boolean {
        return this._estadoAtualPorta
    }
    public set estadoAtualPorta(v : boolean) {
        this._estadoAtualPorta = v;
    }
}