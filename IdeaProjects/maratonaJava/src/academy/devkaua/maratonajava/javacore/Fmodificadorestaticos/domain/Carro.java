package academy.devkaua.maratonajava.javacore.Fmodificadorestaticos.domain;

public class Carro {
    //Variavel por referencia
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("============================");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidade Maxima " + this.velocidadeMaxima);
        System.out.println("velocidade Limite " + Carro.velocidadeLimite);
    }

    // Sempre usar variaveis estaticas nele. E nao Variavel por referencia.
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    // O que nao pode ter no metodo static? Nao ter o 'this.'

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
