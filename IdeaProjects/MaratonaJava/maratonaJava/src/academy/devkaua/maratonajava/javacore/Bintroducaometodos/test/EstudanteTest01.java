package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01{
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprime = new ImpressoraEstudante();

        estudante01.idade = 18;
        estudante01.nome = "Kaua";
        estudante01.sexo = 'M';

        estudante02.idade = 28;
        estudante02.nome = "Yuri";
        estudante02.sexo = 'M';

        //O Imprime faz a referencia da mesma variavel de referencia do estudante01
        imprime.Imprime(estudante01);

        imprime.Imprime(estudante02);
    



    }
}
