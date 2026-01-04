package academy.devkaua.maratonajava.logicaAlgoritmoExerc;

import java.util.Random;

public class ExerciciosBasicos01 {
    public static void main(String[] args) {
        System.out.println(Questao05(12930.20));
        System.out.println(Questao07(true, false));
        System.out.println(Questao08(30,10,20));
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
    public void Questao04(double numeroInt) {
        double sucessor = numeroInt + 1;
        double antecesor = numeroInt - 1;
        System.out.println(numeroInt);
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecesor: " + antecesor);
    }

    // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    public static double Questao05(double salarioUsario) {
        double salarioMinimo = 1293.20;
        return salarioUsario / salarioMinimo;
    }

    // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static double Questao06(double valor) {
        return valor * 0.05;
    }

    // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static String Questao07(boolean valor1, boolean valor2) {
        if (valor1 && valor2) {
            String ambasTrue = "VERDADEIRO";
            return ambasTrue;
        } else if (!valor1 && !valor2) {
            String ambasFalse = "FALSO";
            return ambasFalse;
        } else {
            return "Valores Diferentes: Valor1: " + valor1 + " Valor2: " + valor2;
        }
    }
    // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static String Questao08(int valor1,int  valor2,int  valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                String valorOrdenados = ("Maior: "+valor1 + " Medio: "+ valor2 + " Pequeno: "+ valor3 );
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: "+valor1 + " Medio: "+ valor3 + " Pequeno: "+ valor2 );
                return valorOrdenados;
            }
        } else if (valor2 > valor1 && valor2 > valor3){
            if (valor1 > valor3) {
                String valorOrdenados = ("Maior: "+valor2 + " Medio: "+ valor1 + " Pequeno: "+ valor3 );
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: "+valor2 + " Medio: "+ valor3 + " Pequeno: "+ valor1 );
                return valorOrdenados;
            }
        } else {
            if (valor2 > valor1) {
                String valorOrdenados = ("Maior: "+valor3 + " Medio: "+ valor2 + " Pequeno: "+ valor1 );
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: "+valor3 + " Medio: "+ valor1 + " Pequeno: "+ valor2 );
                return valorOrdenados;
            }
        }
    }
}
