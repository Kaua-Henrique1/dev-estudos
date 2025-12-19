package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //Precisa primeiro criar uma lista.
        int[] numeros = {1, 2, 3, 4, 5, 6};
        calculadora.somaArray(numeros);

        //Pode chamar direto com numeros.
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8);
    }
}
