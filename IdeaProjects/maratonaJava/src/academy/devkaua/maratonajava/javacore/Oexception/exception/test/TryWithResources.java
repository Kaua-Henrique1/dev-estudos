package academy.devkaua.maratonajava.javacore.Oexception.exception.test;

import academy.devkaua.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devkaua.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }
    // Dessa forma e mais legivel e o proprio Java fecha o leitor.
    public static void lerArquivo() {
        try (Leitor2 leitor2 = new Leitor2();
            Leitor1 leitor1 = new Leitor1()) {

        } catch (IOException e) {

        }
    }
    // Forma desorganizada.
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
