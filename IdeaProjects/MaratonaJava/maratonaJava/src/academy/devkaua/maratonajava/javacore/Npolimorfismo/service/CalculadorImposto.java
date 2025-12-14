package academy.devkaua.maratonajava.javacore.Npolimorfismo.service;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadorImposto {
    public static void calcularaImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador.");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularaImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate.");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }
}
