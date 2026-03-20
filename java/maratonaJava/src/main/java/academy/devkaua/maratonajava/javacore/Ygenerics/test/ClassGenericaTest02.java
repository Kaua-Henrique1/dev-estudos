package academy.devkaua.maratonajava.javacore.Ygenerics.test;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Barco;
import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Carro;
import academy.devkaua.maratonajava.javacore.Ygenerics.service.BarcoRentavelService;
import academy.devkaua.maratonajava.javacore.Ygenerics.service.CarroRentavelService;

public class ClassGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcosDisponiveis();

        System.out.println("Barco sendo usado.");

        barcoRentavelService.retornarBarcosAlugado(barco);
    }
 }
