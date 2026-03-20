package academy.devkaua.maratonajava.javacore.Ygenerics.service;

import academy.devkaua.maratonajava.javacore.Ygenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarrosDisponiveis() {
        System.out.println("Buscando Carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Alugando carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro alugado: "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
