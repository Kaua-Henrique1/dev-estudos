# Docker & MySQL

Projetos voltados para conteinerização e gerenciamento de bancos de dados.

### O que estou aprendendo:
* **Docker Compose:** Orquestração de containers através do arquivo `docker-compose.yaml`.
* **MySQL via Terminal:** Gerenciamento, criação de tabelas e consultas diretamente pela linha de comando.
* **Sintaxe SQL:** Prática de comandos MySQL documentados em `sintaxe-mysql-terminal.md`.

### Estrutura:
* `/projeto-mysql`: Arquivos de configuração e scripts SQL.
* `docker-compose.yaml`: Configuração do serviço do banco de dados.

### **Acessar o terminal do MySQL no container:**
Execute o comando abaixo para entrar no prompt do MySQL:

        sudo docker exec -it turma-db mysql -u root -p
