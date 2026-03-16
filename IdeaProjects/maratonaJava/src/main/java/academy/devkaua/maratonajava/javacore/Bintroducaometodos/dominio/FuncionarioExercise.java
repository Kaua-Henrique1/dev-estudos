package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioExercise {
    //Atributos ou variaves de referencias
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    //Metodo
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double sal : salarios) {
            System.out.print(sal + " ");
        }
    }

    //Metodo
    public void mediaSalariaResultado(double[] salarios) {
        // Isso e uma foreach:
        for (double salario : salarios) {
            //double salario: é uma variável temporária que vai receber cada elemento da coleção/array.
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial: " + media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}