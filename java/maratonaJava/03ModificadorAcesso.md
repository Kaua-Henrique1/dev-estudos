# Modificadores de Comportamento e Private

---

## **Acomplamento**
- O que é acoplamento?
    - É o grau de dependência entre duas classes, módulos ou partes do sistema.
      - Se uma classe depende muito da outra → Alto acoplamento
      - Se uma classe depende pouco ou nada da outra → Baixo acoplamento
      - **Alto acomplamento é ruim.**


### Modificador de acesso private

-     public class FuncionarioExercise {
        private double media;
-     public double getMedia() {
        return media; }

  
  - Retirando o setMedia... Nao e possivel modificar a media, so se mudar na propria classe, assim deixando mais seguro.

## Modificadores de Comportamento

> Eles definem como o componente funciona.

- final: Significa "imutável" ou "último".
    - Em variáveis: Torna-as constantes (seu valor não muda após a primeira atribuição)
    - Em métodos: Impede que o método seja sobrescrito por subclasses.
    - Em classes: Impede que a classe seja herdada por outras.


- static: Indica que o membro pertence à classe, e não a uma instância (objeto) específica. Você pode usá-lo sem criar um new Objeto().


- abstract:
    - Em classes: Não pode ser instanciada diretamente (serve apenas como modelo).
    - Em métodos: Define apenas a assinatura (o nome e parâmetros), mas não a lógica, obrigando a subclasse a implementar.