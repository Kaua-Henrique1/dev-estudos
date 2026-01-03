package academy.devkaua.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        // Dessa forma o Java se encarrega de fechar assim que terminar e afins
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i= fr.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
