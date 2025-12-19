package academy.devkaua.maratonajava.introducao.Aula08Revisoes.Carro.test;

import academy.devkaua.maratonajava.introducao.Aula08Revisoes.Carro.domain.Carro;

public class testCarro {
    public static void main(String[] args) {
        Carro bmw = new Carro("vermelho", 4);

        bmw.setCor("Azul");
        bmw.setRodas(6);
        bmw.imprimir();
    }
}
