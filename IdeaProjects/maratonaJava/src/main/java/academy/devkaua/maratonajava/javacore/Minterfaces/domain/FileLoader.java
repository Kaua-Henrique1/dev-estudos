package academy.devkaua.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void loid() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Verificando dados do arquivo");
    }

}
