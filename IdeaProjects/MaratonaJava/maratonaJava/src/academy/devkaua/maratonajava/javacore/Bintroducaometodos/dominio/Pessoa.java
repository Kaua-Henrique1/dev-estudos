package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Toda vez que colocar o 'set', precisa de parametro, declarar o mesmo tipo da variavel e nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Toda vez que colocar o 'get', nao precisa de parametro.
    //Permite ler o valor fora da classe...
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
