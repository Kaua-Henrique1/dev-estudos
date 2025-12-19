package academy.devkaua.maratonajava.javacore.Npolimorfismo.test;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.service.CalculadorImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Computador produto1 = new Computador("Pc super gamer",7000);
        Tomate produto2 = new Tomate("Americano",6);

        CalculadorImposto.calcularaImposto(produto1);
        System.out.println("-------------------------");;
        CalculadorImposto.calcularaImposto(produto2);
    }
}
