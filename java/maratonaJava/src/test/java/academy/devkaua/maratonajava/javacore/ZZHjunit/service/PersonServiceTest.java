package academy.devkaua.maratonajava.javacore.ZZHjunit.service;

import academy.devkaua.maratonajava.javacore.ZZHjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonServiceTest {
    private Person adult;
    private Person isNotAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        adult = new Person(19);
        isNotAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    public void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        // E como eu falasse que a eu garato que essa condicao e falsa.
        Assertions.assertFalse(personService.isAdult(isNotAdult));
    }

    @Test
    public void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    public void isAdult_ThrowException_WhendPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null));
    }

    @Test
    public void filterRemovingNotAdult_ReturnListWithAdultOnly_WhendListOfPersonWithAdultIsPassed() {
        Person person = new Person(17);
        Person person1 = new Person(18);
        Person person2 = new Person(19);
        List<Person> personList = List.of(person, person1, person2);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}