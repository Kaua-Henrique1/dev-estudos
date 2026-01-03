package academy.devkaua.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            FileWriter fw = new FileWriter(file, true);

            // Ela encapsula o metodo FileWriter.
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();

            bw.write("Dia 3 janeiro, mudando o mundo para sempre.");

            //Ela tem metodo para adicionar uma nova linha
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
