package academy.devkaua.maratonajava.javacore.ZZGcrud.test;

import academy.devkaua.maratonajava.javacore.ZZGcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            int op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void menu() {
        System.out.println("Type the number of your operation");
        System.out.println("1: Search for producer");
        System.out.println("2: Delete Producer");
        System.out.println("3: Save Producer");
        System.out.println("4: Update Producer");
        System.out.println("0: Exited");

    }
}
