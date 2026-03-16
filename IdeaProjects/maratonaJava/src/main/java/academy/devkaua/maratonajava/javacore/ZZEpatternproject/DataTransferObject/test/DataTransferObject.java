package academy.devkaua.maratonajava.javacore.ZZEpatternproject.DataTransferObject.test;

import academy.devkaua.maratonajava.javacore.ZZEpatternproject.DataTransferObject.domain.Person;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.DataTransferObject.domain.ReportDto;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.Country;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.Currency;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.CurrencyFactory;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.singleton.domain.Aircraft;

public class DataTransferObject {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);

        Person person = Person.PersonBuilder
                .builder()
                .firstName("Kaua")
                .lastName("Henrique")
                .build();

        ReportDto build = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(build);
    }
}
