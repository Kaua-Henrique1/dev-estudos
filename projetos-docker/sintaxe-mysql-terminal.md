# Principais comandos:

## Criação de Banco e Tabela
- **CREATE DATABASE academico2;**
    - Cria o DB com o nome 'academico2'

- **USE academico2;**
    - Aqui você entra no Banco de Dados que criou para poder editar ele.

- **CREATE TABLE aluno(
    nome VARCHAR(100), 
    data_nascimento DATE, 
    matricula INT
    );**
    - Aqui voce cria a Tabela com os atributos e tipos. 
    
---
# Visualização da tabela
- Significa que foi realizado com sucesso o comando.

        Query OK, 0 rows affected (0.10 sec)

- SHOW DATABASES;

        +--------------------+
        | Database           |
        +--------------------+
        | academico2         |
        | aula_db            |
        | clinica            |
        | information_schema |
        | mysql              |
        | performance_schema |
        | sys                |
        +--------------------+


- SHOW TABLES;

        +----------------------+
        | Tables_in_academico2 |
        +----------------------+
        | aluno                |
        +----------------------+
        1 row in set (0.01 sec)

- DESC aluno;

        +-----------------+--------------+------+-----+---------+-------+
        | Field           | Type         | Null | Key | Default | Extra |
        +-----------------+--------------+------+-----+---------+-------+
        | nome            | varchar(100) | YES  |     | NULL    |       |
        | data_nascimento | date         | YES  |     | NULL    |       |
        | matricula       | int          | YES  |     | NULL    |       |
        +-----------------+--------------+------+-----+---------+-------+

---
# Comando PARA editar/excluir
- Deleta a Tabela:
    - **DROP TABLE nome_da_tabela;**

- Mudar informações da tabela
    - Adciona atributo na Tabela.
        - ALTER TABLE nome_da_tabela **ADD** nome_da_coluna TIPO_DE_DADO;

    - Apenas muda o tipo
        - ALTER TABLE nome_da_tabela **MODIFY** nome_da_coluna NOVO_TIPO_DE_DADO;
        
    - Muda nome e/ou tipo   
        - ALTER TABLE nome_da_tabela **CHANGE** nome_antigo nome_novo NOVO_TIPO_DE_DADO;

    - Remover um Atributo
        - ALTER TABLE nome_da_tabela **DROP** nome_da_coluna;
---
# Regras aplicadas para TABELAS ou COLUNAS:

- UNIQUE:
    - Impede que insira dados **duplicados**.
- NOT NULL:
    - **NÃO** aceita valores nulos.

- WHERE:
    - Ele diz a condição para realizar comando.
    - Ele serve para especificar de forma horizontal o campo que vai ser modificado. 

- CHECK:
    - Define uma **regra**.
- IN:
    - **Reduzir a repetição** de operadores OR.

            IN ('Natal', 'Parnamirim', 'Macaíba');
---
### Exmplo de CHECK e IN:

    ALTER TABLE TURMA ADD CONSTRAINT periodo_checagem CHECK (periodo IN (1, 2));

- CONSTRAINT: Boa prática  para nomeiar a função que está criando.
- CHECK: Definir a regra.
- IN: Dizendo que os dados de 'periodo' pode está entre 1 e 2.

---

# Ações Referenciais:

- ON DELETE CASCADE
    - registro da tabela pai é **excluído**, todos os
registros **filhos relacionados também serão excluídos
automaticamente.**

- ON UPDATE CASCADE
    - PK da tabela pai é **alterada**, o valor da FK nas tabelas **filhas é
atualizado automaticamente.**

- ON DELETE SET NULL
    - Ao **excluir** um registro da tabela pai, o campo FK todos os
registros **filhos** relacionados serão **atualizados para NULL**.

- ON UPDATE SET NULL
    - PK da tabela pai é **alterada**, o valor da FK nas tabelas **filhas é
atualizado para NULL**.


            CONSTRAINT FK_Agendamento_Paciente
                    FOREIGN KEY (paciente_id_fk)
                    REFERENCES PACIENTE(id_paciente)
                    /* aqui entram as regras referenciais */
                    ON DELETE CASCADE
                    ON UPDATE CASCADE


---

# Data Manipulation Language

## INSERT: 
- Insere registros na tabela.

        INSERT INTO turma (nome, periodo) VALUES (‘Redes’, 1), (‘Mecatrônica’, 1);

- OBS: 
    - Campo **AUTO_INCREMENT** não precisa ser passado no INSERT
    - Campos com restrição **NOT NULL** devem obrigatoriamente ser passados no INSERT
    - Campos com restrição **UNIQUE** não permitem valores duplicados

## SELECT

- Ele retorna as informações do compo(s) que mencionou.

        SELECT campo1, campo2, ... FROM tabela

- '*' Ele retorna tudo da tabela 'turma'.

        SELECT * FROM turma;

## UPDATE 
- Ele atualiza o valor
 do atributo nome para 'Info' a onde atende a condição.

        UPDATE turma SET nome=‘Info’ WHERE turma_id=1;

## DELETE
- Ele apaga o registro
- WHERE (CUIDADO): Sempre use ele para especificar examentete a onde vai apagar.

        DELETE FROM tabela WHERE CONDIÇÃO

--- 

# CLÁUSULAS

> As Cláusulas são partes de um comando (modificadores) SQL que
> refinam a operação do comando principal.

## SELECT DISTINCT
- retorna apenas valores distintos (Valores não repetidos)

        SELECT DISTINCT campo1, campo2, ... FROM tabela;

- '*' Ele retorna tudo da tabela 'turma'.

        SELECT * FROM turma;


## WHERE

## ORDER BY
- define a ordenação com que os registros serão retornados, crescente ou decrescente;
>ACS: ordenação crescente

>DESC: ordenação decrescente

## LIMIT e OFFSET
- especifica a quantidade de registros a ser retornada pela consulta.
> Útil para tabelas com milhares de registros

> O retorno de um grande número de registros pode impactar na performance
do sistema

        SELECT campo1, campo2, ... FROM tabela WHERE condição
        ORDER BY campo1, campo2, ... ASC | DESC LIMIT numero_maximo_de_linhas OFFSET numero_de_linhas_a_pular;

## AND, OR e NOT
-        SELECT campo1, campo2, ... FROM tabela WHERE condição1 {Operador} condição2;

-        SELECT campo1, campo2, ...
        FROM tabela
        WHERE NOT (condição1);

