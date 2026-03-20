package academy.devkaua.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.06;
    private String DataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto de Tomate.");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}
