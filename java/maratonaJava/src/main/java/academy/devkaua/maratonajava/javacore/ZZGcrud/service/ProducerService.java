package academy.devkaua.maratonajava.javacore.ZZGcrud.service;


import academy.devkaua.maratonajava.javacore.ZZGcrud.domain.Producer;
import academy.devkaua.maratonajava.javacore.ZZGcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }

    }

    private static void findByName() {
        System.out.println("Type the name empty to all");
        String name = SCANNER.nextLine();

        ProducerRepository.findName(name)
                .forEach(p -> System.out.printf(" %d | %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type one of the IDs below to delete");
        findByName();

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findId(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found "+producerFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = (name.isEmpty() ? producerFromDb.getName() : name);

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepository.update(producerToUpdate);
    }
}
