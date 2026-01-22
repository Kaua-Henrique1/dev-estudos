DROP DATABASE IF EXISTS dbAdoacaoPet;
/* Criar banco de dados (se não existir) */
CREATE DATABASE IF NOT EXISTS dbAdoacaoPet
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE dbAdoacaoPet;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS TELEFONE;
DROP TABLE IF EXISTS PESSOA_ADOTADOR;
DROP TABLE IF EXISTS PETS;
DROP TABLE IF EXISTS ENDERECO_PET_ENCONTRADO;
DROP TABLE IF EXISTS CATALAGO_VACINA;
DROP TABLE IF EXISTS TIPO_ESPECIE;
DROP TABLE IF EXISTS VACINA_PET;
DROP TABLE IF EXISTS ENDERECO_PESSOA;
DROP TABLE IF EXISTS ADOCAO;


/* Criação das Tabelas */

CREATE TABLE ENDERECO_PET_ENCONTRADO (
    id_endereco_pet INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10)
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE CATALAGO_VACINA (
    id_catalago_vacina INT AUTO_INCREMENT PRIMARY KEY,
    nome_vacina VARCHAR(50) NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE TIPO_ESPECIE (
    id_tipo_especie INT AUTO_INCREMENT PRIMARY KEY,
    tipo_animal ENUM('Cachorro', 'Gato') NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE VACINA_PET (
    id_vacina_pet INT AUTO_INCREMENT PRIMARY KEY,
    id_catalago_vacina INT NOT NULL,
    CONSTRAINT FK_CATALAGO_VACINA_CATALAGO
        FOREIGN KEY (id_catalago_vacina)
        REFERENCES CATALAGO_VACINA (id_catalago_vacina)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE ENDERECO_PESSOA (
    id_endereco_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE PESSOA_ADOTADOR (
    id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    id_endereco_pessoa INT NOT NULL,
    CONSTRAINT FK_ENDERECO_PESSOA
        FOREIGN KEY (id_endereco_pessoa)
        REFERENCES ENDERECO_PESSOA (id_endereco_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE TELEFONE (
    id_telefone INT AUTO_INCREMENT PRIMARY KEY,
    telefone VARCHAR(15) NOT NULL,
    id_pessoa INT NOT NULL,
    CONSTRAINT FK_telefone_pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES PESSOA_ADOTADOR (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE PETS (
    id_pet INT AUTO_INCREMENT PRIMARY KEY,
    nome  VARCHAR(50) NOT NULL,
    descricao  VARCHAR(150) NOT NULL,
    peso  DECIMAL(5,2) NOT NULL,
    data_nascimento DATE NOT NULL,
    porte ENUM('Pequeno', 'Medio', 'Grande') NOT NULL,
    sexo ENUM('Macho', 'Femea') NOT NULL,
    id_tipo_especie INT NOT NULL,
    id_endereco_pet INT NOT NULL,
    id_vacina_pet INT NOT NULL,
    CONSTRAINT FK_tipo_especie
        FOREIGN KEY (id_tipo_especie)
        REFERENCES TIPO_ESPECIE (id_tipo_especie)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_Endereco_Pet_Encontrado
        FOREIGN KEY (id_endereco_pet)
        REFERENCES ENDERECO_PET_ENCONTRADO (id_endereco_pet)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_VACINA_PET
        FOREIGN KEY (id_vacina_pet)
        REFERENCES VACINA_PET (id_vacina_pet)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

CREATE TABLE ADOCAO (
    id_adocao INT AUTO_INCREMENT PRIMARY KEY,
    data_adocao DATE NOT NULL,
    id_pessoa INT NOT NULL,
    id_pet INT NOT NULL,
    CONSTRAINT FK_Cadastro_Pessoa
        FOREIGN KEY (id_pessoa)
        REFERENCES PESSOA_ADOTADOR (id_pessoa)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT FK_Cadastro_PETS
        FOREIGN KEY (id_pet)
        REFERENCES PETS (id_pet)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB CHARACTER SET utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;

/* Inserção de Dados */

INSERT INTO ENDERECO_PESSOA (rua, bairro, cidade, numero) VALUES
('Rua Vasco da Gama', 'Passagem de Areia', 'Parnamirim', '100'),
('Rua Manoel Fernandes Neto', 'Nova Esperança', 'Parnamirim', '15'),
('Rua Miguel Rocha', 'Candelária', 'Natal', '11'),
('Av. Xavier da Silveira', 'Nova Descoberta', 'Natal', '204'),
('Rua Aeroporto de Congonhas', 'Emaús', 'Parnamirim', '33'),
('Rua Praia de Genipabu', 'Ponta Negra', 'Natal', '500'),
('Av. Castor Vieira Régis', 'Cohabinal', 'Parnamirim', '12 A'),
('Av. Hermes da Fonseca', 'Tirol', 'Natal', '880'),
('Rua Cruzeiro do Sul', 'Santos Reis', 'Parnamirim', '42'),
('Rua Walter Duarte Pereira', 'Capim Macio', 'Natal', '101');

INSERT INTO PESSOA_ADOTADOR (cpf, nome, email, id_endereco_pessoa) VALUES
('12343543453', 'Lucas Carrilho', 'lucas@gmail.com', 1),
('23425423121', 'Kauã', 'kaua.h@gmail.com', 2),
('21354367789', 'Marcos', 'marcos@outlook.com', 3),
('98765432100', 'Ana Clara Silva', 'ana.clara@gmail.com', 4),
('56473829102', 'Bruno Souza', 'bruno.souza@uol.com.br', 5),
('10293847561', 'Carla Dias', 'carla.dias@hotmail.com', 6),
('34512378909', 'Diego Ferreira', 'diego.fer@gmail.com', 7),
('76543219877', 'Fernanda Lima', 'nanda.lima@yahoo.com', 8),
('11223344556', 'Gabriel Santos', 'gabriel.santos@bol.com.br', 9),
('99887766554', 'Helena Costa', 'helena.costa@gmail.com', 10);

INSERT INTO TELEFONE (telefone, id_pessoa) VALUES
('84957834938', 1),
('84998456321', 2),
('84923700875', 3),
('84988771122', 4),
('84991234455', 5),
('84987654321', 6),
('84996541234', 7),
('84988990011', 8),
('84994321987', 9),
('84991112233', 10);

INSERT INTO CATALAGO_VACINA (nome_vacina, id_catalago_vacina) VALUES
('Polivalente', 1),
('Polivalente e Antirrábica', 2),
('Giárdia', 3);

INSERT INTO TIPO_ESPECIE (tipo_animal) VALUES 
('Cachorro'), ('Gato');

INSERT INTO VACINA_PET (id_vacina_pet, id_catalago_vacina) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 1),
(5, 2), 
(6, 1), 
(7, 3), 
(8, 2), 
(9, 1), 
(10, 2);

INSERT INTO ENDERECO_PET_ENCONTRADO (rua, bairro, cidade, numero) VALUES
('Rua Tenente Medeiros', 'Centro', 'Parnamirim', '45'),
('Av. Engenheiro Roberto Freire', 'Ponta Negra', 'Natal', NULL),
('Av. Maria Lacerda Montenegro', 'Nova Parnamirim', 'Parnamirim', NULL),
('Av. 1', 'Alecrim', 'Natal', NULL),
('Rua Cândido Martins', 'Rosa dos Ventos', 'Parnamirim', '80'),
('Av. Salgado Filho', 'Lagoa Nova', 'Natal', NULL),
('Av. Ayrton Senna', 'Cidade Verde', 'Parnamirim', NULL),
('Rua Trairi', 'Petrópolis', 'Natal', '20'),
('Rua das Pombas', 'Vale do Sol', 'Parnamirim', NULL),
('Av. João Medeiros Filho', 'Redinha', 'Natal', NULL);

INSERT INTO PETS (nome, descricao, peso, data_nascimento, porte, sexo, id_tipo_especie, id_vacina_pet, id_endereco_pet) VALUES
('Lerce', 'Cachorrinha dócil encontrado na rua', 12.50, '2020-01-01', 'Pequeno', 'Femea', 1, 2, 1),
('Carlita', 'Gatinha arisca', 3.00, '2022-05-10', 'Pequeno', 'Femea', 2, 1, 2),
('Thor', 'Cão de guarda bravo', 25.00, '2019-12-25', 'Grande', 'Macho', 1, 3, 3),
('Rex', 'Vira-lata caramelo muito brincalhão', 15.00, '2021-03-15', 'Medio', 'Macho', 1, 4, 4),
('Mia', 'Gata siamesa encontrada miando muito', 2.50, '2023-01-20', 'Pequeno', 'Femea', 2, 5, 5),
('Bob', 'Cachorro idoso e calmo', 20.00, '2018-06-10', 'Medio', 'Macho', 1, 6, 6),
('Luna', 'Gatinha preta muito carinhosa', 3.20, '2022-11-05', 'Pequeno', 'Femea', 2, 7, 7),
('Max', 'Pastor Alemão filhote perdido', 10.00, '2023-08-01', 'Grande', 'Macho', 1, 8, 8),
('Nina', 'Cadela SRD encontrada machucada', 8.00, '2022-02-14', 'Medio', 'Femea', 1, 9, 9),
('Tobi', 'Gato rajado muito esperto', 4.00, '2021-09-30', 'Pequeno', 'Macho', 2, 10, 10);

INSERT INTO ADOCAO (data_adocao, id_pessoa, id_pet) VALUES
('2023-10-01', 1, 1),
('2023-11-15', 2, 2),
('2023-12-05', 4, 4),
('2024-01-10', 5, 5),
('2024-01-20', 8, 8);