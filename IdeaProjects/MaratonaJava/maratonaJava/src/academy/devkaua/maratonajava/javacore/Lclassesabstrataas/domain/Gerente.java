package academy.devkaua.maratonajava.javacore.Lclassesabstrataas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void imprimi() {
        System.out.println("Imprimindo classe Gerente");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Gerente='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
