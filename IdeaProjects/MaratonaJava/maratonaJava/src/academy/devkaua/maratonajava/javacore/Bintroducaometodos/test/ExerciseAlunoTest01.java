package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.AlunoExercise;

public class ExerciseAlunoTest01 {
    public static void main(String[] args) {
        AlunoExercise aluno = new AlunoExercise();
        aluno.nome = "Gigi";
        aluno.idade = 18;
        aluno.notas = new double[] {5.2,4.9,9};

        aluno.imprimirDados();
    }
}
