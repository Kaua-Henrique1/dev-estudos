package academy.devkaua.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
    }
    // Sobrecarga de metodos
    public void init(String nome, String tipo, int epsodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }
    // Aqui adciona mais um parametro, sem da erro de compilacao
    public void init(String nome, String tipo, int epsodios, String genero) {
        this.init(nome, tipo, epsodios);
        this.genero = genero;
    }
    // Qando isso e util? Quando por exemplo esta no fim do expediente, e precisa entregar, mas nao vai ter muito
    // tempara para ajeitar a compilacao, ai transcreve para adcionar o parametro.

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return this.epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
}
