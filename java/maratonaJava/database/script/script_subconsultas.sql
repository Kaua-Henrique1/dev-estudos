CREATE TABLE tb_categoria (
id_categoria SERIAL PRIMARY KEY,
nome_categoria VARCHAR(50) NOT NULL
);

CREATE TABLE tb_produto (
id_produto SERIAL PRIMARY KEY,
nome_produto VARCHAR(100) NOT NULL,
preco_venda DECIMAL(10,2) NOT NULL,
id_categoria INT,
CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

CREATE TABLE tb_venda (
id_venda SERIAL PRIMARY KEY,
data_venda TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
valor_total_venda DECIMAL(10,2) NOT NULL
);

CREATE TABLE tb_venda_item (
id_venda_item SERIAL PRIMARY KEY,
id_venda INT,
id_produto INT,
qtde_vendida INT NOT NULL,
valor_unitario DECIMAL(10,2) NOT NULL,
valor_total_item DECIMAL(10,2) NOT NULL,
CONSTRAINT fk_venda FOREIGN KEY (id_venda) REFERENCES tb_venda(id_venda),
CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES tb_produto(id_produto)
);
INSERT INTO tb_categoria (nome_categoria) VALUES
('Hardware'), ('Periféricos'), ('Software'), ('Escritório');

INSERT INTO tb_produto (nome_produto, preco_venda, id_categoria) VALUES
('SSD 480GB', 250.00, 1),
('Memória RAM 16GB', 400.00, 1),
('Mouse Wireless', 120.00, 2),
('Licença Windows 11', 800.00, 3),
('Monitor 27', 1200.00, 2),
('Teclado Mecânico', 350.00, 2),
('Cadeira Gamer', 1500.00, 4);

INSERT INTO tb_venda (id_venda, data_venda, valor_total_venda) VALUES
(1, '2026-02-01 08:30:00', 250.00),
(2, '2026-02-02 10:15:00', 800.00),
(3, '2026-02-05 14:00:00', 400.00),
(4, '2026-02-10 09:45:00', 1200.00),
(5, '2026-02-12 16:20:00', 250.00),
(6, '2026-02-15 11:30:00', 470.00),
(7, '2026-02-18 13:10:00', 1450.00),
(8, '2026-02-20 17:00:00', 120.00),
(9, '2026-02-22 08:00:00', 900.00),
(10, '2026-02-25 15:45:00', 240.00),
(11, '2026-03-01 10:00:00', 800.00),
(12, '2026-03-02 11:00:00', 1200.00),
(13, '2026-03-05 14:30:00', 350.00),
(14, '2026-03-08 09:20:00', 1050.00),
(15, '2026-03-10 16:00:00', 250.00);

INSERT INTO tb_venda_item (id_venda, id_produto, qtde_vendida, valor_unitario, valor_total_item) VALUES
(1, 1, 1, 250.00, 250.00),
(2, 4, 1, 800.00, 800.00),
(3, 2, 1, 400.00, 400.00),
(4, 5, 1, 1200.00, 1200.00),
(5, 1, 1, 250.00, 250.00),
(6, 6, 1, 350.00, 350.00),
(6, 3, 1, 120.00, 120.00),
(7, 1, 1, 250.00, 250.00),
(7, 5, 1, 1200.00, 1200.00),
(8, 3, 1, 120.00, 120.00),
(9, 1, 2, 250.00, 500.00),
(9, 2, 1, 400.00, 400.00),
(10, 3, 2, 120.00, 240.00),
(11, 4, 1, 800.00, 800.00),
(12, 5, 1, 1200.00, 1200.00),
(13, 6, 1, 350.00, 350.00),
(14, 2, 2, 400.00, 800.00),
(14, 1, 1, 250.00, 250.00),
(15, 1, 1, 250.00, 250.00);
SELECT setval('tb_venda_id_venda_seq', (SELECT MAX(id_venda) FROM tb_venda));