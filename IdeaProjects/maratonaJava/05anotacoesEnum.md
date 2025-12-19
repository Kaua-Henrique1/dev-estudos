# Enum 

### Como usar Enum? (Exemplos)

- Dias da semana, status de pedido, tipos de cliente, categorias, etc.

### Sintaxe Básica: 
- Define os tipos que vai ter o seu Enum

        public enum TipoCliente {
            PESSOA_FISICA(1, "PESSOA_FISICA"),
            PESSOA_JURIDICA(2, "PESSOA_JURIDICA");

- Declare os tipos dos valorees que quer passar.

            private int valor;
            private String nomeRelatorio;
    
- Faz o Constructor. 

            TipoCliente(int valor, String nomeRelatorio) {
                this.valor = valor;
                this.nomeRelatorio = nomeRelatorio;
            }

- Gets para pegar os valores em outras classes

            public int getValor() {
                return valor;
            }
        
            public String getNomeRelatorio() {
                return nomeRelatorio;
            }
        }

### Sintaxe com a Sobre Escrita
- Importancia do @Override: 
  - Sem o @Override, se você errar o nome, o Java cria um método novo sem querer, 
  e seu código não funciona como esperado (e não dá erro, o que é pior para achar o bug).
  
  - Para que serve?
  
    Avisa ao compilador: "Ei, minha intenção aqui é sobrescrever um método que já existe na classe Pai (ou Interface)."

          public enum TipoPagamento {
              CREDITO {
                  @Override
                  public double calcularDesconto(double valor) {return valor * 0.1 ;}
              }, DEBITO {
                  @Override
                  public double calcularDesconto(double valor) {return valor * 0.03;}
              };
  

- Essa parte final e para se criar um novo tipo de pagamento (ex: DINHEIRO) e esquecer ou
escolher não colocar o @Override nele, o Java vai executar esse método e retornar 0.

                 public double calcularDesconto(double valor) {
                     return 0;
                 }
             }