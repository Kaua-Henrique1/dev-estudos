package academy.devkaua.maratonajava.javacore.ZZFjbdc.test;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Pequeno").build();
        ProducerRepository.save(producer);
    }
}