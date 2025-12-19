package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain;

public class Aluno {
    String nome;
    int idade;
    Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.seminario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
