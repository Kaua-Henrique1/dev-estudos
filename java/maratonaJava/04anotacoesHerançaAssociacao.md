## **Herença**

- Conceito e Visibilidade

    - Não existe "extends" automático: Mesmo dentro do mesmo pacote, as classes apenas se "enxergam" (visibilidade default), mas não herdam comportamento sozinhas.

    - Para ser uma classe filha, é obrigatório usar a palavra-chave **extends**.

    - Se a classe Mãe estiver em outro pacote, além do extends, os atributos da Mãe precisam ser protected Filha acessar.
--- 
- Construtores e super()

Se a classe Mãe obriga a passar dados no construtor (ex: Nome), a classe Filha deve ter um construtor que receba esse dado e o repasse para a mãe via super.

    // Classe Filha
      public Aluno(String nome) {
          super(nome); // Inicializa o atributo da Mãe
      }

- Sobrescrita de Métodos (Override)

Usado quando queremos aproveitar a lógica da classe genérica (Mãe) e adicionar algo específico da Filha.

      public void imprimir() {
          super.imprimir(); // Faz o que a classe Pessoa já fazia
          System.out.println("Matrícula: " + this.matricula); // Adiciona o detalhe extra
      }
---
- Sequência de inicialização    
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filna
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
    // 4- Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaco em memoria pro objeto da subclasse
    // 7 - Cada atributo de subclasse e criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
        

## **Associação** (Relacionamento entre Classes)

Tipos de Relação (Conceito e Sintaxe com Arrays)

- 1 para 1 (Um para Um)

        Um objeto possui referência para apenas um outro objeto.
        Sintaxe: private Professor professor;
        Lógica: O seminário tem 1 professor responsável.

- 1 para Muitos (Um para Vários)

        Um objeto possui uma referência para vários objetos do outro tipo. Com Arrays, definimos um tamanho fixo ou passamos o array pronto.
        Sintaxe: private Aluno[] alunos;
        Lógica: O seminário tem uma lista de alunos.

- Muitos para Muitos (Vários para Vários)

        Funciona como o "1 para Muitos", mas nos dois lados.
        Sintaxe: O Seminario tem Aluno[] alunos e o Aluno teria Seminario[] seminarios.

- Cardinalidade (0 ou Muitos)

        0: A variável do array é null (não existe lista) ou o array está vazio (tamanho 0).
        Muitos: O array foi inicializado e tem objetos dentro.
--- 
    public class Seminario {

    private String titulo;
    private Local local; (1 para 1 - Pode ser 0 se não atribuído) 
    private Professor professor;
    private Aluno[] estudantes; (1 para Muitos (Associação com Alunos))
    
        // Construtor 1: Titulo e Local (1 para 1 com Local)
        public Seminario(String titulo, Local local) {
            this.titulo = titulo;
            this.local = local;
        }
    
        // Construtor 2: Completo (Já nasce com alunos e local)
        public Seminario(String titulo, Local local, Aluno[] estudantes) {
            this.titulo = titulo;
            this.local = local;
            this.estudantes = estudantes;
        }
    
        public void imprimi() {
            System.out.println("-------------------------------");
            System.out.println("TITULO: " + this.titulo);
            System.out.println("LOCAL: " + this.local.getEndereco()); 
            System.out.println("PROFESSOR: " + this.professor.getNome());
            System.out.println("ESPECIALIDADE: " + this.professor.getEspecialidade());

            System.out.println("ALUNOS INSCRITOS:");
            // TRATAMENTO DE ERRO: Verifica se o array existe E se tem gente dentro
            if (this.estudantes == null || this.estudantes.length == 0) { return; }
            
            for (Aluno aluno : this.estudantes) {
                if(aluno != null){
                    System.out.println(" - " + aluno.getNome());
                }
            }
            System.out.println("-------------------------------");
        }
    }