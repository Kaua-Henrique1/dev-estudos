package academy.devkaua.maratonajava.javacore.Ygenerics.service;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcosDisponiveis() {
        System.out.println("Buscando Barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barcos: "+barco);
        System.out.println("Alugando barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcosAlugado(Barco barco) {
        System.out.println("------------");
        System.out.println("Devolvendo barco alugado: "+barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
