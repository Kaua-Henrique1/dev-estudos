package academy.devkaua.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DateRemove {
    @Override
    public void loid() {
        System.out.println("Implementando dados do Banco de Dados");
    }

    @Override
    public void Remove() {
        System.out.println("Deletando dados de um arquivos.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando dados do Banco de Dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
