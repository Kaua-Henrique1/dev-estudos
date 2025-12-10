import { itemPedido } from "./itemPedido.js";
export class Pedido {
    private _itens: itemPedido[];
    private _valorTotal: number = 0;

    constructor() {
        this._itens = []
        this._valorTotal = 0
    }

    public get valorTotal(): number {
        return this._valorTotal
    }
    public set valorTotal(v: number) {
        this._valorTotal = v;
    }

    public get itens(): itemPedido[] {
        return this._itens
    }

    public set itens(v: itemPedido[]) {
        this._itens = v;
    }


}