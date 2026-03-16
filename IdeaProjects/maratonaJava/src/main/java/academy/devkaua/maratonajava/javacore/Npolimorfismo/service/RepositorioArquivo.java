package academy.devkaua.maratonajava.javacore.Npolimorfismo.service;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Aquivo.");
    }
}
