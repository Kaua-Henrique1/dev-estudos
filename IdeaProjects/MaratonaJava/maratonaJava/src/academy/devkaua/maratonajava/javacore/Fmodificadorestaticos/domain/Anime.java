package academy.devkaua.maratonajava.javacore.Fmodificadorestaticos.domain;

public class Anime {
    private String nome;
    private static int[] epsodios;
    //                      ORDEM A SER EXECUTADA NO JAVA:
    // 0 - Bloco de inicializacao e executada quando a JVM carregar classe
    // 1 - Alocado espaco em memoria do pro objeto ( private String nome; )
    // 2 - Cada atributo de classe e criado e inicializado com valores default ou o quer que seja atribuido
    // 3 - Blocos de inicialização (automatico do java, ou voce atribui.
    // 4 - Construtores e executado.

    // O Bloco static (Bloco de inicializacao) e executada apenas uma vez por classe
    static {
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
