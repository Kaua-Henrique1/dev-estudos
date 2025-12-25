import { registroNotas } from "./resgistroNotas.js";

export enum turno {
    turnoMat = 'Matutino',
    turnoVes = 'Vespertino',
    turnoNot = 'Noturno'
} 
export class diario {
    private _disciplina: string;
    private _docente: string;
    private _curso: string;
    private _idTurma: string;
    private _QuantidadeAulas: number;
    private _turno: turno;
    private _registroNotas: registroNotas[];
    
    constructor(disciplina: string,
        docente: string,
        curso: string,
        idTurma: string,
        QuantidadeAulas: number,
        turno: turno
        ){
        this._disciplina= disciplina
        this._docente=docente
        this._idTurma=idTurma
        this._curso=curso
        this._QuantidadeAulas=QuantidadeAulas
        this._turno=turno
        this._registroNotas = [];
    }

    public get disciplina(): string {
        return this._disciplina;
    }
    public set disciplina(value: string) {
        this._disciplina = value;
    }
    public get docente(): string {
        return this._docente;
    }
    public set docente(value: string) {
        this._docente = value;
    }
    public get curso(): string {
        return this._curso;
    }
    public set curso(value: string) {
        this._curso = value;
    }
    public get idTurma(): string {
        return this._idTurma;
    }
    public set idTurma(value: string) {
        this._idTurma = value;
    }
    public get QuantidadeAulas(): number {
        return this._QuantidadeAulas;
    }
    public set QuantidadeAulas(value: number) {
        this._QuantidadeAulas = value;
    }
    public get turno(): turno {
        return this._turno;
    }
    public set turno(value: turno) {
        this._turno = value;
    }
    public get registroNotas(): registroNotas[] {
        return this._registroNotas;
    }
    public set registroNotas(value: registroNotas[]) {
        this._registroNotas = value;
    } 

    
    public adicionarEstudante(novoRegistro: registroNotas) {
        this._registroNotas.push(novoRegistro);
    }
}

