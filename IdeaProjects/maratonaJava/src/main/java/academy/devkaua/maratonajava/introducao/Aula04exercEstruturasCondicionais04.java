package academy.devkaua.maratonajava.introducao;

public class Aula04exercEstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 45000;
        double primeiraPorcentagemTaxa = 0.097;
        double segundaPorcentagemTaxa = 0.3735;
        double terceiraPorcentagemTaxa = 0.495;
        double taxaParaPagamento;

        if (salario <= 34712){
            taxaParaPagamento = salario * primeiraPorcentagemTaxa;
        }else if (salario > 34712 && salario <= 68507){
            taxaParaPagamento = salario * segundaPorcentagemTaxa;
        }else {
            taxaParaPagamento = salario * terceiraPorcentagemTaxa;
        }
        System.out.println(taxaParaPagamento);

    }
}
