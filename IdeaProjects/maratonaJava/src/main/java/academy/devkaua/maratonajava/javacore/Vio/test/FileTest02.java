package academy.devkaua.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("folder");
        boolean isDirCreated = dir.mkdir();
        System.out.println("Pasta Criada? "+isDirCreated);

        File fileDir = new File(dir, "ArquivoDentroDir.txt");
        boolean isCreated = fileDir.createNewFile();
        System.out.println("Arquivo Criado? "+isCreated);

        File renomeado = new File(dir, "ArquivoRenomeado.txt");
        boolean isRenamed = fileDir.renameTo(renomeado);
        System.out.println("Renomeou arquivo? "+isRenamed);

        File renomearDir = new File("folder2");
        boolean isRenamedDir = dir.renameTo(renomearDir);
        System.out.println("Renomeou arquivo? "+isRenamedDir);

    }
}
