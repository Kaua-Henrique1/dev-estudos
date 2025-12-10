package academy.devkaua.maratonajava.javacore.Minterfaces.test;

import academy.devkaua.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devkaua.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devkaua.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DateLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.loid();
        fileLoader.loid();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        databaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
