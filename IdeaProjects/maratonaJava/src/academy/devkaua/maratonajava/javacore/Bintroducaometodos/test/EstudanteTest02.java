package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.idade = 18;
        estudante01.nome = "Kaua";
        estudante01.sexo = 'M';

        estudante02.idade = 28;
        estudante02.nome = "Yuri";
        estudante02.sexo = 'M';

        //Print o metodo que esta dentro do class Estudante
        estudante01.imprime();
        estudante02.imprime();

        System.out.println();
    }
}
