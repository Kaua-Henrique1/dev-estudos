package academy.devkaua.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devkaua.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class PessoaTestes01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        //Variavel por reference.
        estudante.idade = 18;
        estudante.nome = "Kaua";
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
        //Para acessar a variavel, precisa do '.'.

    }
}
