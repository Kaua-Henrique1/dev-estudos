import { CarrinhoCompra } from "./carrinhoCompra.js";
import { itemPedido } from "./itemPedido.js";
import { Produto } from "./produto.js";

let produtosOculos = new Produto("B123",84,"Oculos Escuro")
let produtosCamiseta = new Produto("A123",54,"Camiseta Basica")
let produtosBone = new Produto("C123",19,"Sandalia Branca")

let pedido1 = new itemPedido(produtosCamiseta,3);
let pedido2 = new itemPedido(produtosOculos,2);
let pedido3 = new itemPedido(produtosBone,1);

let carrinho = new CarrinhoCompra()
carrinho.adicionarItem(pedido1)
carrinho.adicionarItem(pedido2)
carrinho.adicionarItem(pedido3)

carrinho.aumentarQuantItem(3,"C123")
carrinho.removerItem("B123")

carrinho.imprimi();
