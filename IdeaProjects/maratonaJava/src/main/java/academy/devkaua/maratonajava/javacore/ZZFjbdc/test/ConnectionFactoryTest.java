package academy.devkaua.maratonajava.javacore.ZZFjbdc.test;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("Lucas").build();
        ProducerRepository.save(producer);
    }
}