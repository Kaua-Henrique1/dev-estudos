package academy.devkaua.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devkaua.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
import academy.devkaua.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class CarroTestes01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.cor = "Vermelho";
        carro.marca = "Ferrari";
        carro.rodas = 4;
        //Atributos
        carro2.cor = "Amarelo";
        carro2.marca = "Porsche";
        carro2.rodas = 4;

        System.out.println("Carro 2:"+ carro2.marca +carro2.cor +carro2.rodas);
        System.out.println("Carro 1:"+ carro.marca +carro.cor +carro.rodas);

        System.out.println();
        //Referência de objetos
        carro = carro2;

        System.out.println("Carro 2:"+ carro2.marca +carro2.cor +carro2.rodas);
        System.out.println("Carro 1:"+ carro.marca +carro.cor +carro.rodas);
    }
}