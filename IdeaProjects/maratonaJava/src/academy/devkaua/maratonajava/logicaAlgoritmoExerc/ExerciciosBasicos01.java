package academy.devkaua.maratonajava.logicaAlgoritmoExerc;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosBasicos01 {
    public static void main(String[] args) {
        Questao15(2006, 9, 20);
    }

    // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void Questao01(int A, int B, int C) {
        System.out.printf("Questao 1: ");
        int somar = A + B;
        if (somar < C) {
            System.out.println("A soma de A e B =" + somar + " e menor que C:" + C);
        } else {
            System.out.println("A soma de A e B =" + somar + " NAO e menor que C:" + C);
        }
    }

    // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void Questao02(double numero) {
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
    public static void Questao03(double A3, double B3) {
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
    public static void Questao04(double numeroInt) {
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
    public static String Questao08(int valor1, int valor2, int valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                String valorOrdenados = ("Maior: " + valor1 + " Medio: " + valor2 + " Pequeno: " + valor3);
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: " + valor1 + " Medio: " + valor3 + " Pequeno: " + valor2);
                return valorOrdenados;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            if (valor1 > valor3) {
                String valorOrdenados = ("Maior: " + valor2 + " Medio: " + valor1 + " Pequeno: " + valor3);
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: " + valor2 + " Medio: " + valor3 + " Pequeno: " + valor1);
                return valorOrdenados;
            }
        } else {
            if (valor2 > valor1) {
                String valorOrdenados = ("Maior: " + valor3 + " Medio: " + valor2 + " Pequeno: " + valor1);
                return valorOrdenados;
            } else {
                String valorOrdenados = ("Maior: " + valor3 + " Medio: " + valor1 + " Pequeno: " + valor2);
                return valorOrdenados;
            }
        }
    }

    /* 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
    de acordo com a tabela abaixo:
    Fórmula do IMC = peso / (altura) ²

    Tabela Condições IMC
    Abaixo de 18,5   | Abaixo do peso
    Entre 18,6 e 24,9 | Peso ideal (parabéns)
    Entre 25,0 e 29,9 | Levemente acima do peso
    Entre 30,0 e 34,9 | Obesidade grau I
    Entre 35,0 e 39,9 | Obesidade grau II (severa)
    Maior ou igual a 40 | Obesidade grau III (mórbida) */
    public static void Questao09(double peso, double altura) {
        if (altura > 10) {
            altura /= 100;
        }
        double imc = peso / (altura * altura);
        String mensagem;
        if (imc < 18.5) {
            mensagem = "Abaixo do peso";
            System.out.println(mensagem);
        } else if (imc >= 18.5 && imc < 25) {
            mensagem = "Peso ideal (parabéns)";
            System.out.println(mensagem);
        } else if (imc >= 25 && imc < 30) {
            mensagem = "Levemente acima do peso";
            System.out.println(mensagem);
        } else if (imc >= 30 && imc < 35) {
            mensagem = "Obesidade grau I";
            System.out.println(mensagem);
        } else if (imc >= 35 && imc < 40) {
            mensagem = "Obesidade grau II (severa)";
            System.out.println(mensagem);
        } else {
            mensagem = "Obesidade grau III (mórbida)";
            System.out.println(mensagem);
        }
    }

    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void Questao10(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }

    // 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    //      se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
    public static void Questao11(String nomeAluno, double nota1, double nota2, double nota3, double nota4) {
        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
        double mediaEscolar = 7;
        if (mediaAluno > mediaEscolar) {
            System.out.println("Aluno(a): " + nomeAluno + " Situação: APROVADO");
        } else {
            System.out.println("Aluno(a): " + nomeAluno + " Situação: REPROVADO");
        }
    }

    /*  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
     pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
     Tabela de Código de Condições de Pagamento

     1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
     2 - À Vista no cartão de crédito, recebe 10% de desconto
     3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
     4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */
    public static void Questao12(double valorProduto) {
        Scanner leitor = new Scanner(System.in);

        int tipoPagamento = 0;
        while (tipoPagamento < 1 || tipoPagamento > 4) {
            System.out.println();
            System.out.println("Digite 1 para: À Vista em Dinheiro ou Pix");
            System.out.println("Digite 2 para: À Vista no cartão de crédito");
            System.out.println("Digite 3 para: Parcelado no cartão em duas vezes");
            System.out.println("Digite 4 para: Parcelado no cartão em três vezes ou mais");
            System.out.println();
            System.out.print("Digite sua opção: ");
            tipoPagamento = leitor.nextInt();
            leitor.nextLine();
            double produtoDescontado = 1;

            switch (tipoPagamento) {
                case 1:
                    produtoDescontado = valorProduto - (valorProduto * 0.15);
                    System.out.println("Seu produto recebeu desconto de 15%.");
                    break;
                case 2:
                    produtoDescontado = valorProduto - (valorProduto * 0.1);
                    System.out.println("Seu produto recebeu desconto de 10%.");
                    break;
                case 3:
                    System.out.println("Preço normal do produto.");
                    produtoDescontado = valorProduto;
                    break;
                case 4:
                    produtoDescontado = valorProduto + (valorProduto * 0.1);
                    System.out.println("Seu produto recebeu uma taxa de 10%.");
                    break;
                default:
                    System.out.println("Digite um número entre 1 a 4.");
                    break;
            }
            System.out.println("Valor do produto: " + produtoDescontado);
        }
    }

    // 13 - Faça algoritmo que leia o nome e a idade e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void Questao13(String nome, int idade) {
        if (idade > 18) {
            System.out.println(nome + " é maior de idade. Sua idade é " + idade);
        } else {
            System.out.println(nome + "é menor de idade. Sua idade é " + idade);
        }
    }

    // 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void Questao14(int valorA, int valorB) {
        int valorAntigoB = valorB;
        valorB = valorA;
        valorA = valorAntigoB;

        System.out.println("Valor A atualizado: " + valorA);
        System.out.println("Valor B atualizado: " + valorB);
    }

    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
    //     consideração o ano com 365 dias e o mês com 30 dias.
    //     (Ex: 5 anos, 2 meses e 15 dias de vida)
    public static void Questao15(int ano, int mes, int dia) {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();

        int anos = anoAtual - ano;
        int meses = mesAtual - mes;
        int dias = diaAtual - dia;

        if (dias < 0) {
            dias += 30;
            meses -= 1;
        }

        if (meses < 0) {
            meses += 12;
            anos -= 1;
        }
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida.");
    }


    // 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
    //      equilátero, isósceles ou escaleno.
    public static void Questao16(int valor1, int valor2, int valor3) {
        if (valor1 >= (valor2 + valor3) || valor2 >= (valor1 + valor3) || valor3 >= (valor2 + valor1)) {
            System.out.println("Triângulo invalido.");
            return;
        }

        if (valor1 == valor2 && valor1 == valor3) {
            System.out.println("Seu triângulo é equilátero!");
        } else if (valor1 != valor2 && valor2 != valor3 && valor1 != valor3) {
            System.out.println("Seu triângulo é escaleno!");
        } else {
            System.out.println("Seu triângulo é isósceles!");
        }
    }

    // 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
    //      Fórmula: C = (5 * ( F-32) / 9)
    public static void Questao17(double temperaturaF) {
        double celsius = (5 * (temperaturaF - 32) / 9);

        System.out.println("Temperatura em Celsius:" + celsius);
        System.out.println("Temperatura em Fahrenheit:" + temperaturaF);
    }

    // 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima
    //      na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
    public static void Questao18() {
        double francisco = 1.5;
        double sara = 1.1;
        int contadorAno = 0;
        while (sara < francisco) {
            sara += 0.03;
            francisco += 0.02;
            contadorAno++;
        }
        System.out.println("Será necessários " + contadorAno + " anos, para que Francisco seja menor que Sara.");
    }

    // 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    public static void Questao19() {
        for (int i = 1; i < 11; i++) {
            for (int tabuada = 1; tabuada < 11; tabuada++) {
                int resultado = tabuada * i;
                System.out.println(tabuada + " X " + i + " = " + resultado);
            }
            System.out.println("------------------");
        }
    }

    // 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void Questao20(int valor) {
        for (int i = 0; i < 11; i++) {
            int resultado = valor * i;
            System.out.println(valor + " X " + i + " = " + resultado);
        }
    }

    // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void Questao21() {
        Random random = new Random();
        int numeroGerado = random.nextInt(101);
        System.out.println(numeroGerado);
    }

    // 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void Questao22(int A, int B) {
        int resultado = A / B;
        int resto = A % B;

        System.out.println("O quociente: " + resultado);
        System.out.println("O resto da divisão inteira entre eles: " + resto);
    }

    // 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula,
    //      número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
    public static void Questao23(double valorHora, int numAulas) {
        final double ISENCAO_INSS = 3000;
        double salarioProfessor = valorHora * numAulas;

        if (salarioProfessor > ISENCAO_INSS) {
            salarioProfessor -= (salarioProfessor * 0.15);
        }
        System.out.println("Salário líquido do professor: " + salarioProfessor + "$");
    }

    /*
      24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer
           ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
           Fórmula: distância = tempo x velocidade.
               litros usados = distância / 12. */
    public static void Questao24(double tempoViagemEmHoras, double velocidadeMedia) {
        final double KM_POR_LITRO = 12;
        double distancia = tempoViagemEmHoras * velocidadeMedia;
        double litrosUsados = distancia / KM_POR_LITRO;

        System.out.println("Litros gasto na viagem: " + litrosUsados + "L");
        System.out.println("Distância pecorrida: " + distancia + " km");
    }
}
