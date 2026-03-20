package academy.devkaua.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        touchNewFile();
    }
    private static void touchNewFile() {
        File file = new File("arquivo/teste.txt");
        try {
            // Se algum arquivo de erro, ele vai para o catch
            boolean isCriado = file.createNewFile();
        }catch (IOException e) {
            // OBS: Evite colocar Logica de programa no catch.
            // Aqui ele imprimi o erro IOException
            // Nunca deixe o catch vazio
            e.printStackTrace();
        }
    }
}
