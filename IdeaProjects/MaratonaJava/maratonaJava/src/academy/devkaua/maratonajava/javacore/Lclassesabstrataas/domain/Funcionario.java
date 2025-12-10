package academy.devkaua.maratonajava.javacore.Lclassesabstrataas.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    @Override
    public void imprimi() {
        System.out.println("Imprimindo ......");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularSalario();
    }

    public abstract void calcularSalario();

}
