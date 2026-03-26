package academy.devkaua.maratonajava.javacore.ZZFjbdc.test;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        //Producer producer = Producer.builder().name("Studio Medio").build();
        //ProducerService.save(producer);

        List<Producer> producers = ProducerService.findByName("Studio Pequeno");
        log.info("Producers found '{}'", producers);

    }
}