import { Escolaridade } from "./escolaridadeEnum.js";

export class Funcionario {
    private _nome: string;
    private _matricula: number;
    private _escolaridade: Escolaridade;
    private _renumeracaoBase: number;
    private _renumeracaototal: number | null;

    constructor(nome: string, matricula: number, escolariade: Escolaridade) {
        this._nome = nome
        this._matricula = matricula
        this._escolaridade = escolariade
        this._renumeracaoBase = 3000
        this._renumeracaototal = null
    }

    calculoRemuneracaoTotal(funcionario: Escolaridade) {
        switch (funcionario) {
            case Escolaridade.ENSINO_BASICO:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.05)
                break;

            case Escolaridade.ENSINO_MEDIO:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.1)
                break;

            case Escolaridade.CURSO_SUPERIOR:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.2)
                break;

            case Escolaridade.ESPECIALIZACAO:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.25)
                break;

            case Escolaridade.MESTRADO:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.35)
                break;
                
            default:
                this.renumeracaototal = this.renumeracaoBase + (this.renumeracaoBase*0.45)
                break;
        }
    }

    public set nome(v: string) {
        this._nome = v;
    }
    public get nome(): string {
        return this._nome
    }

    public set matricula(v: number) {
        this._matricula = v;
    }
    public get matricula(): number {
        return this._matricula
    }

    public set escolaridade(v: Escolaridade) {
        this._escolaridade = v;
    }
    public get escolaridade(): Escolaridade {
        return this._escolaridade
    }

    public set renumeracaototal(v: number) {
        this._renumeracaototal = v;
    }
    public get renumeracaototal(): number | null {
        return this._renumeracaototal
    }

    public set renumeracaoBase(v: number) {
        this._renumeracaoBase = v;
    }
    public get renumeracaoBase(): number {
        return this._renumeracaoBase
    }
}