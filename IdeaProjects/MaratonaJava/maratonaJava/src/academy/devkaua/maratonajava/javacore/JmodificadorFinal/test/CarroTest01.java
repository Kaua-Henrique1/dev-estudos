package academy.devkaua.maratonajava.javacore.JmodificadorFinal.test;

import academy.devkaua.maratonajava.javacore.JmodificadorFinal.domain.Carro;
import academy.devkaua.maratonajava.javacore.JmodificadorFinal.domain.Comprador;
import academy.devkaua.maratonajava.javacore.JmodificadorFinal.domain.Ferarri;

import javax.xml.stream.FactoryConfigurationError;
import java.sql.SQLOutput;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferarri ferarri = new Ferarri();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kaua");
        System.out.println(carro.COMPRADOR);

        ferarri.setNome("F40");
        ferarri.imprimi();
    }
}
