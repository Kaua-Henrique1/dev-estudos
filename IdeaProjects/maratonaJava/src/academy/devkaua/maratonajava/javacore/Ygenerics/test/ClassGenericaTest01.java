package academy.devkaua.maratonajava.javacore.Ygenerics.test;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Carro;
import academy.devkaua.maratonajava.javacore.Ygenerics.service.CarroRentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarrosDisponiveis();

        System.out.println("Carro sendo usado.");

        carroRentavelService.retornarCarroAlugado(carro);
    }



 }
