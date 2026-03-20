package academy.devkaua.maratonajava.javacore.ZZEpatternproject.DataTransferObject.domain;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.userName = this.userName;
            person.lastName = this.lastName;
            person.email = this.email;
            person.firstName = this.firstName;
            return person;
        }

    }
    public String getFirstName() {
        return firstName;
    }
}
