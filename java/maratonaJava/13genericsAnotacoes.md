# Por que usar?

- Segurança de Tipo (Type Safety): O compilador te avisa se você tentar colocar um Gato onde deveria estar um Cachorro.
- Elimina Casts: Você não precisa mais ficar escrevendo (String) lista.get(0). O Java já sabe que é uma String.
- Reutilização: Você escreve o código uma vez e ele serve para qualquer Objeto.

### OBSERVAÇÕES
Tipos Primitivos NÃO entram: Você nunca verá List<int>. O Generics só aceita
Objetos. Para números, use as Wrapper Classes (Integer, Double, Long).

---

## Classes Genéricas
```java
public class Caixa<T> {
    private T conteudo;
    
    public void setConteudo(T t) { this.conteudo = t; }
    public T getConteudo() { return conteudo; }
    // Uso: Caixa<String> caixaDeTexto = new Caixa<>();
}
```
- Dessa forma pode receber um objeto genérico quando instânciar.
- E quando instânciar novamente, pode colocar outro tipo, e aquela instância específica vai aceitar apenas aquele tipo.
```java
// Criando uma instância específica para Strings
Caixa<String> caixaDeTexto = new Caixa<>();
caixaDeTexto.setConteudo("Olá"); // OK
// caixaDeTexto.setConteudo(10); // ERRO DE COMPILAÇÃO! O Java não deixa.

// Criando OUTRA instância específica para Inteiros
Caixa<Integer> caixaDeNumero = new Caixa<>();
caixaDeNumero.setConteudo(10); // OK
// caixaDeNumero.setConteudo("Olá"); // ERRO DE COMPILAÇÃO!
```

---

## Métodos Genéricos
- Sintaxe: **acesso <T> retorno nome(T parametro)**

- Bounded Types (**Tipos Limitados**): Quando você quer restringir o que pode entrar.
  - <T extends Comparable<T>>: "Aceito qualquer coisa, desde que essa coisa saiba se comparar com outras (implemente Comparable)".
  - <T extends Number>: "Aceito qualquer coisa, desde que seja um número (Integer, Double, Float)".

```java
    private static <T> List<T> metodoGenerico(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

        return list;
    }
    // Assim você recebe apenas objetos que seja do tipo Comparable:
    private static <T extends Comparable<T>> List<T> metodoGenericoTipoComparable(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

        return list;
    }
```

## O que é o Wildcard?

- Ele serve para da flexibilidade, podendo acessar qualquer tipo 
- SINTAXE:
  - Unknown Wildcard (?): Qualquer tipo.
  - Upper Bounded Wildcard (? extends T): T ou qualquer subtipo de T.

## Tipos de Wildcards:

  #### Significado: Aceita List<Integer>, List<Double>, List<Number>, etc.
  ```java
  public double somarValores(List<? extends Number> lista) {
    double soma = 0.0;
    for (Number n : lista) {
        soma += n.doubleValue(); // Seguro ler como Number
    }
    return soma;
  }
  ```
---
  - Lower Bounded Wildcard (? super T): T ou qualquer supertipo de T.
  ```java
  // Assim o java sabe quais tipos as classes filhas vao ser... Para poder adicionar elas na list.
  private static void addAnimal(List<? super Animal> animals) {
      animals.add(new Cachorro());
      animals.add(new Gato());
  }
  
  Animal[] animals = {new Gato(), new Cachorro()};
  ConsultaAnimal(animals);
  ```
---
### Resumo de Wildcards em Java: `? extends T` vs `? super T`

| Característica | `? extends T` (Upper Bound) | `? super T` (Lower Bound) |
| :--- | :--- | :--- |
| **Foco** | **Leitura** (Get) | **Escrita** (Add) |
| **Hierarquia** | `T` e seus **filhos** | `T` e seus **pais** |
| **Exemplo** | `List<? extends Number>` | `List<? super Integer>` |
| **Pode ler?** | **Sim** (Retorna no mínimo um `T`) | **Sim** (Retorna apenas como `Object`) |
| **Pode escrever?** | **Não** (Apenas `null`) | **Sim** (Pode adicionar `T` ou filhos de `T`) |
| **Regra PECS** | **P**roducer **E**xtends | **C**onsumer **S**uper |