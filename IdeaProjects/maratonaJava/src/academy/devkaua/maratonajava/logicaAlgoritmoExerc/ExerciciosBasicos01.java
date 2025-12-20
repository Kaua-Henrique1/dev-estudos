package academy.devkaua.maratonajava.logicaAlgoritmoExerc;

import java.util.Random;

public class ExerciciosBasicos01 {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        System.out.printf("Questao 1:");
        int A = 1;
        int B = 2;
        int C = 4;
        int somar = A + B;
        if (somar < C) {
            System.out.println("A soma de A e B =" + somar + " e menor que C:" + C);
        }
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        System.out.printf("Questao 2:");
        Random aleatorio = new Random();
        double numero = aleatorio.nextInt(100);

        if (numero % 2 == 0) {
            System.out.println(numero + "= PAR.");
        } else {System.out.println(numero + "= IMPAR.");}

        // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        // caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        // imprimir seu valor na tela.

        // 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    }
}
