package academy.devkaua.maratonajava.introducao.Aula08Revisoes.Funcionario.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salario;
    private int media;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }
        for (int i : salario) {
            System.out.println("Salario: "+i);
        }
        System.out.println("Media: " + this.media);
    }

    public void mediaSalarial(){
        if (salario == null){
            return;
        }

        int somar = 0;
        for (int i = 0; i < salario.length; i++) {
            somar += salario[i];
        }
        this.media = somar / salario.length;
    }
}
