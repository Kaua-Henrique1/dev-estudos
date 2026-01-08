/* 1. Criar banco de dados (se não existir) */
CREATE DATABASE IF NOT EXISTS dbAdoacaoPet
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

/* 2. Selecionar banco de dados
   (Opcional: pode ser omitido se o banco estiver ativo no DBeaver)
   Nos casos em que o script é executado fora do DBeaver, como por exemplo no terminal MySQL,
   é necessário selecionar o banco explicitamente.
*/
USE dbAdoacaoPet;

/* 1. Desativa verificação de chaves para permitir apagar as tabelas em qualquer ordem */
SET FOREIGN_KEY_CHECKS = 0;

/* 2. Limpeza (Drops) */
DROP TABLE IF EXISTS Pessoa_Adotador;
DROP TABLE IF EXISTS Endereco_Pet_Encontrado;
DROP TABLE IF EXISTS Sexo;
DROP TABLE IF EXISTS Tipo;
DROP TABLE IF EXISTS Porte;
DROP TABLE IF EXISTS Pets;
DROP TABLE IF EXISTS Endereco_Pessoa;
DROP TABLE IF EXISTS Telefone;
DROP TABLE IF EXISTS Cadastro_Adotar_Pet;

/* 3. Reativa a verificação de segurança */
SET FOREIGN_KEY_CHECKS = 1;

/* 4. Criação das Tabelas */

CREATE TABLE Endereco_Pet_Encontrado (
    id_endereco_pet INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Sexo (
    id_sexo INT AUTO_INCREMENT PRIMARY KEY,
    sexo_animal ENUM('Macho', 'Femea') NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Tipo (
    id_tipo INT AUTO_INCREMENT PRIMARY KEY,
    tipo_animal ENUM('Cachorro', 'Gato') NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Porte (
    id_porte INT AUTO_INCREMENT PRIMARY KEY,
    porte_animal ENUM('Pequeno', 'Medio', 'Grande') NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Endereco_Pessoa (
    id_endereco_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Pessoa_Adotador (
    id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    id_endereco_pessoa INT NOT NULL,
    CONSTRAINT FK_Endereco_Pessoa
        FOREIGN KEY (id_endereco_pessoa)
        REFERENCES Endereco_Pessoa (id_endereco_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Telefone (
    id_telefone INT AUTO_INCREMENT PRIMARY KEY,
    telefone VARCHAR(15) NOT NULL,
    id_pessoa INT NOT NULL,
    CONSTRAINT FK_Telefone_Pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa_Adotador (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Pets (
    id_pet INT AUTO_INCREMENT PRIMARY KEY,
    nome  VARCHAR(50) NOT NULL,
    descricao  VARCHAR(150) NOT NULL,
    peso  DECIMAL(5,2) NOT NULL,
    data_nascimento DATE NOT NULL,
    id_sexo INT NOT NULL,
    id_tipo INT NOT NULL,
    id_endereco_pet INT NOT NULL,
    id_porte INT NOT NULL,
    CONSTRAINT FK_sexo
        FOREIGN KEY (id_sexo)
        REFERENCES Sexo (id_sexo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_tipo
        FOREIGN KEY (id_tipo)
        REFERENCES Tipo (id_tipo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_Endereco_Pet_Encontrado
        FOREIGN KEY (id_endereco_pet)
        REFERENCES Endereco_Pet_Encontrado (id_endereco_pet)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_Porte
        FOREIGN KEY (id_porte)
        REFERENCES Porte (id_porte)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE Cadastro_Adotar_Pet (
    id_adocao INT AUTO_INCREMENT PRIMARY KEY,
    data_adocao DATE NOT NULL,
    id_pessoa INT NOT NULL,
    id_pet INT NOT NULL,
    CONSTRAINT FK_Cadastro_Pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa_Adotador (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_Cadastro_Pets
        FOREIGN KEY (id_pet)
        REFERENCES Pets (id_pet)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

/* 5. Inserção de Dados */

INSERT INTO Endereco_Pessoa (rua, bairro, cidade, numero) VALUES
('Rua das Flores', 'Jardim Botânico', 'Curitiba', '100'),
('Av. Paulista', 'Bela Vista', 'São Paulo', '1578'),
('Rua da Praia', 'Boa Viagem', 'Recife', '45B');

INSERT INTO Pessoa_Adotador (cpf, nome, email, id_endereco_pessoa) VALUES
('11122233344', 'Lucas Carrilho', 'lucas@dev.com', 1),
('22233344455', 'Ana Silva', 'ana.silva@gmail.com', 2),
('33344455566', 'Carlos Souza', 'carlos@outlook.com', 3);

INSERT INTO Telefone (telefone, id_pessoa) VALUES
('11999998888', 1),
('19988887777', 2),
('21977776666', 3);

INSERT INTO Sexo (sexo_animal) VALUES
('Macho'), ('Femea');

INSERT INTO Tipo (tipo_animal) VALUES 
('Cachorro'), ('Gato');

INSERT INTO Porte (porte_animal) VALUES 
('Pequeno'), ('Medio'), ('Grande');

INSERT INTO Endereco_Pet_Encontrado (rua, bairro, cidade, numero) VALUES
('Parque Ibirapuera', 'Vila Mariana', 'São Paulo', 'S/N'),
('Rodovia Anhanguera', 'Km 12', 'Osasco', 'S/N'),
('Praia Grande', 'Canto do Forte', 'Praia Grande', '100');

INSERT INTO Pets (nome, descricao, peso, data_nascimento, id_sexo, id_tipo, id_porte, id_endereco_pet) VALUES
('Rex', 'Cachorro dócil encontrado na rua', 12.50, '2020-01-01', 1, 1, 2, 1),
('Mia', 'Gatinha arisca', 3.00, '2022-05-10', 2, 2, 1, 2),
('Thor', 'Cão de guarda bravo', 25.00, '2019-12-25', 1, 1, 3, 3);

INSERT INTO Cadastro_Adotar_Pet (data_adocao, id_pessoa, id_pet) VALUES
('2023-10-01', 1, 1),
('2023-11-15', 2, 2);