export class Hospede {
    private _nome : string
    private _cpf : string
    private _telefone : number

    constructor(nome : string,cpf : string,telefone : number) {
        this._nome = nome
        this._cpf = cpf
        this._telefone = telefone
    }

    
    public get nome() : string {
        return this._nome
    }
    public set nome (v : string) {
        this._nome = v;
    }

    public get cpf() : string {
        return this._cpf
    }
    public set cpf (v : string) {
        this._cpf = v;
    }   
    
    public get telefone() : number {
        return this._telefone
    }
    public set telefone (v : number) {
        this._telefone = v;
    } 

}