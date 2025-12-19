package academy.devkaua.maratonajava.javacore.Gassociacao.test;

import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devkaua.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Kaua");
        Professor professor2 = new Professor("Yuri");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("IFRN", professores);

        escola.imprimi();
    }
}
