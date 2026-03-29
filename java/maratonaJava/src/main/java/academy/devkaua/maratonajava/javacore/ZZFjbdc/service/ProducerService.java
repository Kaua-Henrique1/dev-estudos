package academy.devkaua.maratonajava.javacore.ZZFjbdc.service;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers) {
        ProducerRepository.saveTrasaction(producers);
    }


    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findName(name);
    }

    public static List<Producer> findNamePreparedStatement(String name) {
        return ProducerRepository.findNamePreparedStatement(name);
    }

    public static void showProducerMetadata() {
        ProducerRepository.showProducerMetadata();
    }


    private static void requireValidId(Integer id) {
        if (id == null || id <= 0 ) {
            throw new IllegalArgumentException("Invalid value for ID");
        }
    }
}
