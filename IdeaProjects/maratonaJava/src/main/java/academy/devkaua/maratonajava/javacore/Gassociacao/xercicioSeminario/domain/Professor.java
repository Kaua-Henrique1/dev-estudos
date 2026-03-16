package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain;

public class Professor {
    private String nome;
    private Especielidade especielidade;
    private Seminario[] seminario;

    public Professor(String nome, Especielidade especielidade) {
        this.nome = nome;
        this.especielidade = especielidade;
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.especielidade);

        for (Seminario seminarios: this.seminario) {
            System.out.println(seminarios.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especielidade getEspecielidade() {
        return especielidade;
    }

    public void setEspecielidade(Especielidade especielidade) {
        this.especielidade = especielidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
