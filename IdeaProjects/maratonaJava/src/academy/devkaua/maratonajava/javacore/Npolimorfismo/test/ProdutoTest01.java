package academy.devkaua.maratonajava.javacore.Npolimorfismo.test;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.service.CalculadorImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC gamer", 4500);
        Tomate tomate = new Tomate("Tomate vermelho", 11);

        CalculadorImposto.calcularaImposto(computador);
        System.out.println("-------------------------");
        CalculadorImposto.calcularaImposto(tomate);
    }
}
