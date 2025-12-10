package academy.devkaua.maratonajava.introducao.Aula08Revisoes.Carro.domain;

public class Carro {
    private  String cor;
    private int rodas;

    public Carro(String cor, int rodas) {
        this.cor = cor;
        this.rodas = rodas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public int getRodas() {
        return rodas;
    }

    public void imprimir() {
        System.out.println(this.cor);
        System.out.println(this.rodas);
    }
}


