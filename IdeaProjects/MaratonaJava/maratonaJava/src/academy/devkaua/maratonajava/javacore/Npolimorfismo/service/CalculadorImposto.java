package academy.devkaua.maratonajava.javacore.Npolimorfismo.service;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadorImposto {
    public static void calcularaImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            // Tem como pegar o valor por meio de um objeto depois usar o Get, ou atribuindo a uma variavel.
            // Tomate tomate = (Tomate) produto;
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade: " + dataValidade);
        }
        System.out.println("------------------------");
    }
}
