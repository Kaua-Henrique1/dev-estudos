package academy.devkaua.maratonajava.javacore.Lclassesabstrataas.test;

import academy.devkaua.maratonajava.javacore.Lclassesabstrataas.domain.Desenvolvedor;
import academy.devkaua.maratonajava.javacore.Lclassesabstrataas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("kaua", 5000);
        Gerente gerente = new Gerente("Lucas", 4500);

        System.out.println(desenvolvedor);
        System.out.println(gerente);

        gerente.imprimi();
        desenvolvedor.imprimi();
    }
}
