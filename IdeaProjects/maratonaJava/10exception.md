# Exception:

> Error RuntimeException:
> Basicamente é uma class que tem várias outras classes filhas (class de erro)

- Se você tem algum erro de RuntimeException... Provalvelmente o seu código deve ser melhorado.

## Tratamento de Exceções:


### Unckecked
> Definição: São as exceções que herdam de RuntimeException.

- Regra: O compilador não obriga você a tratá-las (com try-catch ou throws).
    - Causa: Normalmente são erros do programador (divisão por zero, acessar índice inexistente em um array).

          public static void main(String[] args) {
          divisao(1,0);
          System.out.println("Codigo finalizado");
          }
          private static int divisao(int a, int b) {
          // exceção unchecked
          if (b == 0){
          throw new IllegalArgumentException("Não pode ser 0");
          }
          return a/b;
          }
- Tipo de Exceção: **IllegalArgumentException** é uma subclasse de **RuntimeException**.
- Não precisou colocar throws IllegalArgumentException na assinatura do método.
### checked
> Definição: São exceções que herdam diretamente de Exception (mas não de RuntimeException).

- Regra: O compilador obriga você a tratar a exceção ou declarar que o método pode lançá-la usando a palavra-chave throws.
  - Causa: Geralmente ligadas a fatores externos fora do controle total do programador (ex: arquivo não encontrado, falha na conexão com o banco de dados).
  
        public static void main(String[] args) {
            touchNewFile();
        }
        private static void touchNewFile() {
            File file = new File("arquivo/teste.txt");
            try {
                // Se algum arquivo de erro, ele vai para o catch
                boolean isCriado = file.createNewFile();
            }catch (IOException e) {
            // Nunca deixe o catch vazio
            e.printStackTrace();
            }
        }

- Tipo de Exceção: IOException é uma Checked Exception.
- Assinatura: Você é obrigado a declarar throws IOException porque o método createNewFile() avisa ao compilador que ele pode falhar.
- **Bloco try-catch**: Você tenta criar o arquivo. Se der erro, o catch captura, imprime o erro **(printStackTrace)**
- **throw e** para relançar a exceção.
    - Significa que quem chamou esse método também terá que lidar com o erro.