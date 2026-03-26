-- Acima da Média: Liste todos os produtos (nome e preço) cujo preço de venda é maior que a média de preço de todos
-- os produtos cadastrados.

select nome_produto, preco_venda
  from tb_produto tp
 where tp.preco_venda > (select avg(tp.preco_venda)
						   from tb_produto tp);

-- Filtro Inteligente: Encontre todos os produtos que pertencem à categoria 'Periféricos' usando uma subconsulta
-- para descobrir o ID da categoria (sem usar JOIN).

select tp.nome_produto, tp.preco_venda, tp.id_categoria
  from tb_produto tp
 where tp.id_categoria = (select tc.id_categoria
                            from tb_categoria tc
                           where tc.nome_categoria = 'Periféricos');

--
-- Vendas de Peso: Liste todas as vendas cujo valor_total_venda seja maior do que a média do
-- valor total de todas as vendas registradas.

select *
  from tb_venda tv
 where tv.valor_total_venda >  (select AVG(tv.valor_total_venda) as media_total
                                  from tb_venda tv )

-- O Esquecido: Quais produtos (id e nome) nunca foram vendidos? (Use NOT IN com uma
-- subconsulta na tabela de itens).

select tp.id_produto, tp.nome_produto
  from tb_produto tp
 where tp.id_produto not in (select tvi.id_produto
	                           from tb_venda_item tvi
	                        )

-- Painel de Comparação: Crie uma query que mostre o nome do produto, o preço dele e, em
-- uma terceira coluna gerada por subconsulta no SELECT, mostre a média de preço da categoria a qual ele pertence.

SELECT tp.nome_produto, tp.preco_venda, (SELECT AVG(tp2.preco_venda)
                                          FROM tb_produto tp2
                                          WHERE tp2.id_categoria = tp.id_categoria) AS media_da_categoria
  from tb_produto tp


