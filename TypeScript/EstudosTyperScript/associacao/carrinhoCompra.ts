import { itemPedido } from "./itemPedido.js";
export class CarrinhoCompra {
    private _item: itemPedido[]
    private _valorTotal: number

    constructor() {
        this._item = []
        this._valorTotal = 0
    }

    public set item(v: itemPedido[]) {
        this._item = v;
    }
    public get item(): itemPedido[] {
        return this._item
    }

    public set valorTotal(v: number) {
        this._valorTotal = v;
    }

    public get valorTotal(): number {
        return this._valorTotal
    }

    imprimi() {
        console.log("========== CUPOM FISCAL ==========");

        for (const i of this._item) {
            console.log("-"+i.produto.descricao+ "\n Quantidade: "+i.quantidade+"\n Unidade: R$"+i.produto.valor+ "\n Total: "+i.subTotal())
        }

        console.log("----------------------------------");
        console.log("TOTAL BRUTO: R$"+ this.totalCompra());
        
        if (this.totalCompra() > 300) {
             console.log("DESCONTO (10%): -R$"+this.totalCompra() * 0.1);
             console.log("TOTAL A PAGAR: R$"+this.finalizarCompra());
        } else {
             console.log("TOTAL A PAGAR: R$"+this.finalizarCompra());
        }
        console.log("==================================");
    }

    adicionarItem(item: itemPedido) {
        this._item.push(item)
        this.totalCompra()
    }
    aumentarQuantItem(quantidade: number, codigoProduto: string) {
        for (const item of this._item) {
            if (codigoProduto === item.produto.codigo) {
                item.adcionaQuantProduto(quantidade);
                this.totalCompra()
                return;
            }
        }
    }
    diminuirQuantItem(quantidade: number, codigoProduto: string) {
        for (const item of this._item) {
            if (codigoProduto === item.produto.codigo) {
                item.diminuirQuantProduto(quantidade);
                this.totalCompra()
                return;
            }
        }
    }
    removerItem(codigoProduto: string) {
        for (const item of this._item)
            if (codigoProduto === item.produto.codigo) {
                const index = this._item.indexOf(item)
                this._item.splice(index, 1)
                this.totalCompra()
                return;
            }
    }
    cumpom() {
        const desconto = 0.1
        if (this.totalCompra() > 300) {
            return this.valorTotal - (this.valorTotal * desconto);
        } else {
            return this.valorTotal
        }
    }
    totalCompra(): number {
        let total = 0;
        for (const item of this._item) {
            total += item.subTotal();
        }
        this.valorTotal = total;
        return total;
    }
    finalizarCompra() {
        let valorFinal = this.cumpom()
        return valorFinal;
    }
}
