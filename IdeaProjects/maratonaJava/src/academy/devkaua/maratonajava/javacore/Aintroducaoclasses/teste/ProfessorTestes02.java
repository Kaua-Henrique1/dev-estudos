package academy.devkaua.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devkaua.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTestes02 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Igor";
        professor.sexo = 'M';
        professor.idade = 46;

        System.out.println("Professor: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }
}
