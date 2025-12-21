package academy.devkaua.maratonajava.logicaAlgoritmoExerc;

import java.util.Random;

public class ExerciciosBasicos01 {
    public static void main(String[] args) {
    }
    // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public void Questao01(int A, int B, int C) {
        System.out.printf("Questao 1: ");
        int somar = A + B;
        if (somar < C) {
            System.out.println("A soma de A e B =" + somar + " e menor que C:" + C);
        } else {
            System.out.println("A soma de A e B =" + somar + " NAO e menor que C:" + C);
        }
    }
    // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public void Questao02(double numero) {
        System.out.printf("Questao 2: ");

        // Verificação de Par ou Ímpar
        if (numero % 2 == 0) {
            System.out.print(numero + "= PAR ");
        } else {
            System.out.print(numero + "= IMPAR ");
        }

        // Verificação de Positivo ou Negativo
        if (numero >= 0) {
            System.out.println("e POSITIVO.");
        } else {
            System.out.println("e NEGATIVO.");
        }
    }
    // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    // caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    // imprimir seu valor na tela.
    public void Questao03(double A3, double B3) {
        System.out.printf("Questao 3: ");
        double resultado = 0;

        if (A3 == B3) {
            resultado = A3 + B3;
            System.out.println(A3 + " + " + B3 + " = " + resultado);
        } else {
            resultado = A3 * B3;
            System.out.println(A3 + " X " + B3 + " = " + resultado);
        }
        // Atribuindo o resultado a uma variável C como pedido
        double C = resultado;
    }
    // 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public void imprimiAntecessorSucessor(double numeroInt) {
        double sucessor = numeroInt + 1;
        double antecesor = numeroInt - 1;
        System.out.println(numeroInt);
        System.out.println("Sucessor: "+sucessor);
        System.out.println("Antecesor: "+antecesor);
    }
    // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
}
