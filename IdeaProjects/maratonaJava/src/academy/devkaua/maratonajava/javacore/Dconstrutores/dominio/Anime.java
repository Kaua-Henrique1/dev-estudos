package academy.devkaua.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String studio;

    //Ele e executado antes de qualquer metodo que tem na classe.
    public Anime(String nome, String tipo, int epsodios, String genero) {
        //This(); so pode ser usado dentro de outro construtor.
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem parametro.");
    }

    public Anime(String nome, String tipo, int epsodios, String genero, String studio) {
        //This(); precisa ser obrigatoriamente ser a primeira linha executada.
        this(nome, tipo, epsodios, genero);
        this.studio = studio;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

}

