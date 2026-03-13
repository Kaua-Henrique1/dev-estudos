package academy.devkaua.maratonajava.javacore.ZZEpatternproject.test;

import academy.devkaua.maratonajava.javacore.ZZEpatternproject.domain.Country;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.domain.Currency;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);

        System.out.println(currency.getSymbol());
    }
}
