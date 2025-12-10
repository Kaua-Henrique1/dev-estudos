# Principais comandos:

### Criação de Banco e Tabela
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
    

### Visualização da tabela
- Significa que foi realizado com sucesso o comando.

        Query OK, 0 rows affected (0.10 sec)


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


### Comando apra editar/excluir
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