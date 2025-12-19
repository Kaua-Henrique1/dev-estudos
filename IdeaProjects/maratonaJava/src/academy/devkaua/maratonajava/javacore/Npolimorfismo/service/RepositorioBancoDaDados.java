package academy.devkaua.maratonajava.javacore.Npolimorfismo.service;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDaDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados.");
    }
}
