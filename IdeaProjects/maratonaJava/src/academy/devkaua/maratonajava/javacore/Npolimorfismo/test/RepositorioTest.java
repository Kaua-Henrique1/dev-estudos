package academy.devkaua.maratonajava.javacore.Npolimorfismo.test;

import academy.devkaua.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devkaua.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDaDados;

public class RepositorioTest {
    public static void main(String[] args) {

        // Vantagem de deixar a o tipo mais genérico (Repositorio), é que
        // simplifica a manutenção e os testes, pois a troca da instância
        // (Ex: Arquivo para Banco de Dados) é a única alteração necessária
        // no código, aproveitando o Polimorfismo para executar a ação correta.

        // O código é desacoplado e só depende do contrato (Interface Repositorio)
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
