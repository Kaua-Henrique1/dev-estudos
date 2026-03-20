package academy.devkaua.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    // 1- Objeto = nome, epsodios.
    // 2- Os valores dos objetos.
    // 3- Blocos de inicialização = {    }
    private String nome;
    private int[] epsodios;
    //                      ORDEM A SER EXECUTADA NO JAVA:
    // 1 - Alocado espaco em memoria do pro objeto
    // 2 - Cada atributo de classe e criado e inicializado com valores default ou o quer que seja atribuido
    // 3 - Blocos de inicialização (automatico do java, ou voce atribui.
    // 4 - Construtores e executado.

    // Porque usar o bloco de inicializador? Pois os construtores impede que os valores da Arrys sejam criadas...
    // Usando os 'Blocos de inicialização', faz que ela seja executada antes dos Construtores.
    {
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.epsodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
