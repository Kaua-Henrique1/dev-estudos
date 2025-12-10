export class Produto {
    private _codigo: string;
    private _valor: number;
    private _descricao: string;

    constructor(codigo: string,valor: number,descricao: string) {
        this._codigo = codigo
        this._valor = valor
        this._descricao = descricao
    }

    
    public set codigo(v : string) {
        this._codigo = v;
    }
    
    public get codigo() : string {
        return this._codigo
    }
    
    public set valor(v : number) {
        this._valor = v;
    }
    
    public get valor() : number {
        return this._valor
    }

    public set descricao(v : string) {
        this._descricao = v;
    }
    
    public get descricao() : string {
        return this._descricao
    }
}