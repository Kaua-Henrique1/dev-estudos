package academy.devkaua.maratonajava.javacore.Uregex;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Kaua, Henrique, Almeida, 2006, true";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(", ");
        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: "+i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: "+b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
