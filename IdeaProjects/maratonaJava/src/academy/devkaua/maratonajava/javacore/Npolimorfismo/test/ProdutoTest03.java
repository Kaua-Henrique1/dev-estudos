package academy.devkaua.maratonajava.javacore.Npolimorfismo.test;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.service.CalculadorImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Pc super gamer",7000);
        Tomate tomate = new Tomate("Americano",6);

        tomate.setDataValidade("12/30/2025");

        CalculadorImposto.calcularaImposto(computador);
        CalculadorImposto.calcularaImposto(tomate);
    }
}
