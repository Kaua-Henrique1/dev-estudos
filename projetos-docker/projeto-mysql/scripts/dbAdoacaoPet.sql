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

CREATE TABLE Pessoa_Adotador (
    id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    CONSTRAINT FK_Endereco_Pessoa
        FOREIGN KEY (id_endereco_pessoa)
        REFERENCES Endereco_Pessoa (id_endereco_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Telefone (
    id_telefone INT AUTO_INCREMENT PRIMARY KEY,
    telefone VARCHAR(15) NOT NULL,
    CONSTRAINT FK_pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa_Adotador (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB
CHARACTER SET utf8mb4


CREATE TABLE Endereco_Pessoa (
    id_endereco_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Cadastro_Adotar_Pet (
    id_adocao INT AUTO_INCREMENT PRIMARY KEY,
    data_adoacao DATE NOT NULL,
    CONSTRAINT FK_pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa_Adotador (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
    CONSTRAINT FK_pets
        FOREIGN KEY (id_pets)
        REFERENCES Pets (id_pets)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Pets (
    id_pet INT AUTO_INCREMENT PRIMARY KEY,
    nome  VARCHAR(50) NOT NULL,
    descricao  VARCHAR(150) NOT NULL,
    peso  DECIMAL(5,2) NOT NULL,
    data_nascimento DATE NOT NULL,
    CONSTRAINT FK_sexo
        FOREIGN KEY (id_sexo)
        REFERENCES Sexo (id_sexo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
    CONSTRAINT FK_tipo
        FOREIGN KEY (id_tipo)
        REFERENCES Tipo (id_tipo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
    CONSTRAINT FK_Endereco_Pet_Encontrado
        FOREIGN KEY (id_endereco_pessoa)
        REFERENCES Endereco_Pet_Encontrado (id_endereco_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
    CONSTRAINT FK_Porte
        FOREIGN KEY (id_porte)
        REFERENCES Porte (id_porte)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Endereco_Pet_Encontrado (
    id_endereco_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Sexo (
    id_sexo INT AUTO_INCREMENT PRIMARY KEY,
    sexo_animal ENUM NOT NULL,
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Tipo (
    id_tipo INT AUTO_INCREMENT PRIMARY KEY,
    tipo_animal ENUM NOT NULL,
) ENGINE=InnoDB
CHARACTER SET utf8mb4

CREATE TABLE Porte (
    id_porte INT AUTO_INCREMENT PRIMARY KEY,
    tipo_animal ENUM NOT NULL,
) ENGINE=InnoDB
CHARACTER SET utf8mb4