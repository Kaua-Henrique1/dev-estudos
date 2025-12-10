package academy.devkaua.maratonajava.introducao.Aula08Revisoes.Funcionario.test;

import academy.devkaua.maratonajava.introducao.Aula08Revisoes.Funcionario.domain.Funcionario;

public class testFuncionario {
    public static void main(String[] args) {
        Funcionario kaua = new Funcionario("Kaua", 19);
        int salario[] = {1500,2000,3800};
        kaua.setSalario(salario);
        kaua.mediaSalarial();
        kaua.imprimir();
    }
}
