-- 1. Criação do Banco (Execute separadamente se estiver usando um terminal PSQL)
-- CREATE DATABASE "dbEleicao_RN";

-- 2. Criação das Tabelas
CREATE TABLE TbOrientacao (
CoOrientacao SERIAL PRIMARY KEY,
NoOrientacao VARCHAR(20) NOT NULL
);

CREATE TABLE TbCargo (
CoCargo SERIAL PRIMARY KEY,
NoCargo VARCHAR(50) NOT NULL
);

CREATE TABLE TbPartido (
CoPartido SERIAL PRIMARY KEY,
SgPartido VARCHAR(20) NOT NULL,
NoPartido VARCHAR(100) NOT NULL,
CoOrientacao INT,
CONSTRAINT TbPartido_fk0 FOREIGN KEY (CoOrientacao) REFERENCES TbOrientacao(CoOrientacao)
);

CREATE TABLE TbCandidato (
NuCandidato SERIAL PRIMARY KEY,
NoCandidato VARCHAR(50) NOT NULL,
CoCargo INT NOT NULL,
CoPartido INT NOT NULL,
CONSTRAINT TbCandidato_fk0 FOREIGN KEY (CoCargo) REFERENCES TbCargo(CoCargo),
CONSTRAINT TbCandidato_fk1 FOREIGN KEY (CoPartido) REFERENCES TbPartido(CoPartido)
);

CREATE TABLE TbZona (
IdZona SERIAL PRIMARY KEY,
NoZona VARCHAR(50) NOT NULL
);

CREATE TABLE TbVotos (
IdVoto SERIAL PRIMARY KEY,
IdZona INT NOT NULL,
NuCandidato INT NOT NULL,
QtVotos INT NOT NULL,
CONSTRAINT TbVotos_fk0 FOREIGN KEY (IdZona) REFERENCES TbZona(IdZona),
CONSTRAINT TbVotos_fk1 FOREIGN KEY (NuCandidato) REFERENCES TbCandidato(NuCandidato)
);

---

-- 3. Inserção de Dados

-- Populando Cargos
INSERT INTO TbCargo (NoCargo)
VALUES ('Governador'), ('Senador'), ('Deputado federal'), ('Deputado estadual');

-- Populando Orientações
INSERT INTO TbOrientacao (NoOrientacao)
VALUES ('Esquerda'), ('Centro'), ('Centro-esquerda'), ('Direita'), ('Centro-direita');

-- Populando Partidos
INSERT INTO TbPartido (SgPartido, NoPartido, CoOrientacao)
VALUES
('MDB', 'MOVIMENTO DEMOCRÁTICO BRASILEIRO', 2),
('PDT', 'PARTIDO DEMOCRÁTICO TRABALHISTA', 3),
('PT', 'PARTIDO DOS TRABALHEATORES', 1),
('PCdoB', 'PARTIDO COMUNISTA DO BRASIL', 1),
('PSB', 'PARTIDO SOCIALISTA BRASILEIRO', 3),
('PSDB', 'PARTIDO DA SOCIAL DEMOCRACIA BRASILEIRA', 5),
('AGIR', 'AGIR', NULL),
('PMN', 'Partido da Mobilização Nacional', 2),
('CIDADANIA', 'CIDADANIA', 2),
('PV', 'PARTIDO VERDE', 2),
('AVANTE', 'AVANTE', 2),
('PP', 'PROGRESSISTAS', 5),
('PSTU', 'PARTIDO SOCIALISTA DOS TRABALHADORES UNIFICADO', 1),
('PCB', 'PARTIDO COMUNISTA BRASILEIRO', 1),
('PRTB', 'PARTIDO RENOVADOR TRABALHISTA BRASILEIRO', 2),
('DC', 'DEMOCRACIA CRISTÃ', 5),
('PCO', 'PARTIDO DA CAUSA OPERÁRIA', 1),
('PODE', 'PODEMOS', 2),
('REPUBLICANOS', 'REPUBLICANOS', 5),
('PSOL', 'PARTIDO SOCIALISMO E LIBERDADE', 1),
('PL', 'PARTIDO LIBERAL', 5),
('PSD', 'PARTIDO SOCIAL DEMOCRÁTICO', 2),
('SOLIDARIEDADE', 'SOLIDARIEDADE', 2),
('NOVO', 'PARTIDO NOVO', 5),
('REDE', 'REDE SUSTENTABILIDADE', 2),
('PMB', 'PARTIDO DA MULHER BRASILEIRA', 1),
('UP', 'UNIDADE POPULAR', 1),
('UNIÃO', 'UNIÃO BRASIL', NULL),
('PRD', 'PARTIDO RENOVAÇÃO DEMOCRÁTICA', NULL);

-- Populando Candidatos
INSERT INTO TbCandidato (NoCandidato, CoCargo, CoPartido)
VALUES
('Antônio Bento', 1, 15), ('Capitão Styvenson', 1, 18), ('Clorisa Linhares', 1, 26),
('Danniel Morais', 1, 20), ('Fábio Dantas', 1, 23), ('Fátima Bezerra', 1, 3),
('Nazareno Neris', 1, 8), ('Rodrigo Vieira', 1, 16), ('Rosália Fernandes', 1, 13),
('Carlos Eduardo', 2, 2), ('Dário Barbosa', 2, 13), ('Freitas Jr.', 2, 20),
('Geraldo Pinho', 2, 18), ('Marcelo Guerreiro', 2, 15), ('Pastor Silvestre', 2, 8),
('Rafael Motta', 2, 5), ('Rogério Marinho', 2, 21), ('Shirlei Medeiros', 2, 16),
('Natália Bonavides', 3, 3), ('João Maia', 3, 21), ('Benes Leocádio', 3, 28),
('Robinson Faria', 3, 21), ('Mineiro', 3, 3), ('Paulinho Freire', 3, 28),
('General Girão', 3, 21), ('Sargento Gonçalves', 3, 21), ('Ezequiel Ferreira', 4, 6),
('Coronel Azevedo', 4, 21), ('Kleber Rodrigues', 4, 6), ('Adjuto Dias', 4, 1),
('Isolda Dantas', 4, 3), ('Bernardo Amorim', 4, 6), ('Divaneide', 4, 3),
('Francisco do PT', 4, 3), ('George Soares', 4, 10), ('José Dias', 4, 6),
('Dr. Keginaldo Jacome', 4, 6), ('Tomba Farias', 4, 6), ('Cristiane Dantas', 4, 23),
('Nelter Queiroz', 4, 6), ('Galeno Torquato', 4, 6), ('Eudiane Macedo', 4, 10),
('Ubaldo Fernandes', 4, 6), ('Luiz Eduardo', 4, 23), ('Terezinha Maia', 4, 21),
('Hermano Morais', 4, 10), ('Ivanilson Oliveira', 4, 28), ('Taveira Jr', 4, 28),
('Neilton', 4, 21);

-- Populando Zonas
INSERT INTO TbZona(NoZona)
VALUES ('Região Oeste Potiguar'), ('Central Potiguar'), ('Agreste Potiguar'), ('Leste Potiguar');

-- Inserindo Votos Aleatórios (Ajustado para sintaxe Postgres)
INSERT INTO TbVotos (IdZona, NuCandidato, QtVotos)
SELECT z.id, c.NuCandidato, floor(random() * (100000 - 100 + 1) + 100)::int
FROM TbCandidato c
         CROSS JOIN (SELECT generate_series(1,4) as id) z;

-- Inserções Finais
INSERT INTO TbCandidato (NoCandidato, CoCargo, CoPartido)
VALUES ('Fábio Procópio', 1, 15), ('Marcelo Damasceno', 2, 21);