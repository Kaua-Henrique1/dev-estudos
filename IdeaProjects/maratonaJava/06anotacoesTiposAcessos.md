# Modificadores de Acesso
## Tipos de acesso:

### PRIVATE
- Apenas dentro da **própria classe** onde foi declarado.


### PROTECTED
- Ele permite acessar os metodos e atributos da **classe Pai**
- OBS: As classes que tiver no **mesmo package**, tambem tem acesso.

# Modificadores (outros):

### STATIC
- Pertencem a classe
- Não precisa criar um objeto para chamar ele, ele pode ser chamado direto pela classe
  - Exemplo: MinhaClasse.metodoEstatico();
- Criados quando a classe é carregada pelo Class Loader e existem até o programa terminar.

### ABSTRACT
- Classe: Ela é incompleta, deve ser herdada.
- Método: Ela é criada vazia, apenas para ser completa nas classes filhas.
  - Na classe filha (extends) ela usa a sobre escrita (OVERRIDE) para escrever a  lógica.  


### FINAL
- **Não** pode ser **alterada** e o valor da **variável é constante**.
- Classe **não** pode ser **estendida (herdada)**
- Método **não** pode ser **sobrescrito (override)** em classes filhas.
