package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("kaua Henrique");
        conta.depositar(1000);
        System.out.println("---------");
        conta.sacar(200);
        conta.sacar(900);

        System.out.println("---------");
        System.out.println(conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
