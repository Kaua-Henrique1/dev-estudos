package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        calculadora.divideDoisNumeros02(5, 6);
    }
}
