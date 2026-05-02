package academy.devkaua.maratonajava.leetCode.recursividade.test;

public class recursiva {
    public static void main(String[] args) {
//        int num = 100;
//        System.out.println(somatorio(num, 1));

//        System.out.println(multiplicacao(5, -5));

//        System.out.println(baseBinaria(59));
    }

    //    4. Implemente uma função recursiva que receba um número inteiro positivo n e calcule o somatório
    //    dos números de 1 a n.
    public static int somatorio(int num, int som) {
        if (num <= 0) {
            return 0;
        }
        int somaParcial;
        somaParcial = som + num;
        System.out.println("Valor: " + somaParcial + " = " + som + " + " + num);
        som += num;
        return somatorio(--num, som);
    }

    //    5. A multiplicação de dois números inteiros pode ser feita através de somas sucessivas. Proponha um
    //    algoritmo recursivo multiplicação(n1, n2) que calcule a multiplicação de dois inteiros.
    public static int multiplicacao(int num, int num2) {
        if (num2 == 0) {
            return 0;
        }
        if (num2 < 0) {
            return -multiplicacao(num, -num2);
        }
        return num + multiplicacao(num, --num2);
    }

    //    6. Implemente uma função recursiva para converter um número natural em base binária.
    public static String baseBinaria(int num) {
        if (num == 0) return "0";
        if (num == 1) return "1";
        String resto = String.valueOf(num % 2);

        return baseBinaria(num/2) + resto;
    }
//    7. Implemente uma função recursiva para calcular o MMC (mínimo múltiplo comum) entre dois
//    números.

//    8. Implemente uma função recursiva para dizer se uma palavra é palíndroma.

//    9. Pesquise como se pode desenvolver uma função de Fibonacci recursiva que seja eficiente e
//    implemente essa solução.

//    10. Implemente uma função recursiva buscaBinaria(vetor, inicio, fim, alvo) que encontre o índice de um
//    elemento em um vetor já ordenado. Se o elemento não existir, a função deve retornar -1. A lógica
//    consiste em verificar o elemento do meio: (i) Se for o alvo, terminamos. (ii) Se o alvo for menor,
//    buscamos apenas na metade esquerda. (iii) Se o alvo for maior, buscamos apenas na metade direita.
}
