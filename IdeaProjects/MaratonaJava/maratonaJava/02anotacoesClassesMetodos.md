# Anotações da Maratona Java
## **Introdução classes**

- Conceito
  -  Preciso importar o package das funcoes, para poder trabalhar com as variaveis.
  - O nome da classe tem que ser igual a onde ela e criada e a onde e usada.
  -     Estudante estudante = new Estudante();
        //Variavel por reference.
  -     estudante.idade = 18;
        estudante.nome = Kaua;
        estudante.sexo = M;
        //Para acessar a variavel, precisa do '.'.

---

## **Coesão**

- Sempre ter bem definido a classe.
- Exemplo: Classe professor não deve está junto com a do Aluno.

---

## **Metodo**

- Se o seu metodo tem mais de 2 paramentros, e considerado uma boa pratica, reduzir em mais paramentros.
- ### Estrutura de um metodo:
  -     public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;

  -     Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

---

## **Parâmetros em Java**

### Tipos primitivos
- Os tipos primitivos são passados **por valor**, ou seja, quando um tipo primitivo é enviado para um método, é feita uma **cópia** do seu valor. Isso significa que qualquer alteração feita dentro do método não afeta a variável original fora dele.

- Exemplos de tipos primitivos: `int`, `double`, `char`, `boolean`.

---

### Objetos (tipos por referência)
Já os objetos são passados como **referência**. Isso quer dizer que a variável não guarda o objeto em si, mas sim uma **referência (um endereço na memória)** para esse objeto.

Quando um objeto é passado para um método, o método recebe essa referência e, portanto, pode **alterar diretamente o objeto original**. Dessa forma, as mudanças realizadas dentro do método refletem fora dele, pois ambos apontam para o mesmo objeto em memória.

Exemplos de objetos: `String`, arrays, classes criadas pelo programador.

Ter cuidado para mudar a variaveis do objeto depois que ja tenha passado por referencia. O melhor a se fazer e criar uma copiar e retornar essa copia como um novo objeto.

---

##  Resumindo
- **Tipos primitivos** → são passados por valor (cópia).
- **Objetos** → são passados por referência (o método manipula o mesmo objeto).

--- 
