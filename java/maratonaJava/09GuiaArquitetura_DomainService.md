# Estrutura e Organização de Pastas
> A organização em pacotes lógicos para a manutenibilidade e escalabilidade do projeto.

- domain:
    - Contém as entidades centrais do negócio (Ex: Produto, Tomate, Cliente).
    - Define **O QUE É** do sistema (dados, estado e regras básicas).
    - Exemplo de código: **Classes Produto, Tomate, Taxavel.**

- service:
    - Contém as **regras de negócio** complexas e a lógica de coordenação.
    - Define o O QUE FAZ o sistema **(operações, transações).**
    - Exemplo de código: **Classe CalculadorImposto.**

--- 

# Acoplamento Fraco e Contratos (Interfaces)
> Uma boa prática é deixar o ter o menos possível de acomplamento 
- A Solução (Interface/Contrato):
    - O CalculadorImposto depende do Contrato (Interface Taxavel).
    - O método calcularImposto aceita um tipo genérico (Ex: Produto que implementa Taxavel).
              
    -           public abstract class Produto implements Taxavel{
                      protected String nome;
                      protected double valor;
                    
                      public Produto(String nome, double valor) {
                          this.nome = nome;
                          this.valor = valor;
                      }

    -           public interface Taxavel {
                    double calcularImposto();
                }
     
    -           public class CalculadorImposto {
                    public static void calcularaImposto(Produto produto) {...}
                }

![img.png](img.png)
