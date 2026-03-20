package academy.devkaua.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("Dia 3 janeiro, mudando o mundo para sempre.");
            fw.flush();
            // Ele garante que jogue toda a string dentro do file e depois ja feixe o metodo e afins.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
