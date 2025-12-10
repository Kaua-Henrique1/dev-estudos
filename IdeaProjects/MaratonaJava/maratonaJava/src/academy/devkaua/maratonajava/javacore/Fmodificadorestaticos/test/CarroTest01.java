package academy.devkaua.maratonajava.javacore.Fmodificadorestaticos.test;

import academy.devkaua.maratonajava.javacore.Fmodificadorestaticos.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(200);

        Carro carro = new Carro("BMW", 300);
        Carro carro2 = new Carro("Mercedes", 280);
        Carro carro3 = new Carro("Audi", 279);

        carro.imprimir();
        carro2.imprimir();
        carro3.imprimir();

    }
}
