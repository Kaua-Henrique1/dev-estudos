package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioExercise;

public class ExerciseFuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioExercise funcionario = new FuncionarioExercise();
        funcionario.setIdade(18);
        funcionario.setNome("Kaua");
        funcionario.setSalarios(new double[]{1522, 2000, 922});

        //Chamada dos metodos
        funcionario.imprimir();
        System.out.println("Media: "+ funcionario.getMedia());
    }
}
