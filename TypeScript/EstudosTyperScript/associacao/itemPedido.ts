import { Produto } from "./produto.js";

export class itemPedido {
    private _produto: Produto;
    private _quantidade: number;

    constructor(produto: Produto, quantidade: number) {
        this._produto = produto
        this._quantidade = quantidade
    }
    
    subTotal(): number {
        return this.produto.valor * this.quantidade
    }
    adcionaQuantProduto(quantidade: number) {
        return this._quantidade += quantidade
    }
    diminuirQuantProduto(quantidade: number) {
        return this._quantidade -= quantidade
    }

    adcionaProduto(quantidade: number) {
        return this._quantidade += quantidade
    }
    removerProduto(quantidade: number) {
        return this._quantidade -= quantidade
    }

    public get produto(): Produto {
        return this._produto
    }
    public set produto(v: Produto) {
        this._produto = v;
    }

    public get quantidade(): number {
        return this._quantidade
    }
    public set quantidade(v: number) {
        this._quantidade = v;
    }

}