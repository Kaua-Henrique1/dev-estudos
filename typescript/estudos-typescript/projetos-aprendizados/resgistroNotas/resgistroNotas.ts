export enum SituacaoEstudante {
    CURSANDO = "Cursando",
    APROVADO = "Aprovado(a)",
    REPROVADO = "Reprovado(a)",
    PROVAFINAL = "Prova final",
    CANCELADO = "Cancelado",
    TRANCADO = "Trancado(a)",
}

export class registroNotas { 
    private _nomeEstudante: string;
    private _matriculaEstudante: number;
    private _situacaoEstudante: SituacaoEstudante = SituacaoEstudante.CURSANDO;
    private _notaBim1: number;
    private _notaBim2: number;
    private _mediaParcial: undefined | number = undefined;
    private _mediaFinal: undefined | number = undefined;
    private _notaAvaliacaoFinal: undefined | number; 

    constructor(nomeEstudante: string,
        matriculaEstudante: number,
        notaBim1: number,
        notaBim2: number) {
            this._nomeEstudante = nomeEstudante
            this._matriculaEstudante=matriculaEstudante
            this._notaBim1=notaBim1
            this._notaBim2=notaBim2
    }
    
    public calcularMedia()  {
        if (this._notaBim1 !=0 && this._notaBim2!=0){
            this._mediaParcial = ((this._notaBim1 * 2) + (this._notaBim2 * 3)) / 5

            if (this._mediaParcial >= 60 ) {
                this._situacaoEstudante = SituacaoEstudante.APROVADO
            } else if (this._mediaParcial >= 10) {
                this._situacaoEstudante = SituacaoEstudante.PROVAFINAL
            } else {
                this._situacaoEstudante = SituacaoEstudante.REPROVADO
            }
             
            return {media_parcial: this._mediaParcial, situacao: this.situacaoEstudante}

        }
        
       

    }

    public calcularMediaFinal(notaAvaliacaoFinal?: number) {
   
        if (this._situacaoEstudante !== SituacaoEstudante.PROVAFINAL || this._mediaParcial === undefined || notaAvaliacaoFinal === undefined ) return undefined; 
        
        this._mediaFinal = (notaAvaliacaoFinal + this._mediaParcial) / 2;

        if (this._mediaFinal >= 60) {
            this._situacaoEstudante = SituacaoEstudante.APROVADO;
        } else {
            this._situacaoEstudante = SituacaoEstudante.REPROVADO;
        }  
        this._notaAvaliacaoFinal = notaAvaliacaoFinal

        return {identificacao: "Aluno(a): ", media_final: this.mediaFinal, situacao: this.situacaoEstudante}
    }

    public get notaBim1(): number {
        return this._notaBim1;
    }
    public set notaBim1(value: number) {
        this._notaBim1 = value;
    }
    public get notaBim2(): number {
        return this._notaBim2;
    }
    public set notaBim2(value: number) {
        this._notaBim2 = value;
    }
    public get mediaParcial(): undefined | number {
        return this._mediaParcial;
    }
    public set mediaParcial(value: undefined | number) {
        this._mediaParcial = value;
    }
    public get mediaFinal(): undefined | number {
        return this._mediaFinal;
    }
    public set mediaFinal(value: undefined | number) {
        this._mediaFinal = value;
    }

    public get situacaoEstudante(): SituacaoEstudante {
        return this._situacaoEstudante;
    }
    public set situacaoEstudante(value: SituacaoEstudante) {
        this._situacaoEstudante = value;
    }
    public get nomeEstudante(): string {
        return this._nomeEstudante;
    }
    public set nomeEstudante(value: string) {
        this._nomeEstudante = value;
    }
    
    public get matriculaEstudante(): number {
        return this._matriculaEstudante;
    }
    public set matriculaEstudante(value: number) {
        this._matriculaEstudante = value;
    }
    public get notaAvaliacaoFinal(): undefined | number {
        return this._notaAvaliacaoFinal;
    }
    public set notaAvaliacaoFinal(value: undefined | number) {
        this._notaAvaliacaoFinal = value;
    }  
}