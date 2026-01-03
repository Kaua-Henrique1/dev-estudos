package academy.devkaua.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            boolean exists = file.exists();
            if (exists) {

                System.out.println("deleted: "+ file.delete());
                System.out.println("getPath: "+ file.getPath());
                System.out.println("getAbsolutePath: "+ file.getAbsolutePath());
                System.out.println("isDirectory: "+ file.isDirectory());
                System.out.println("isFile: "+ file.isFile());
                System.out.println("Data de modificacao: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
