package academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.test;

import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.Country;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.Currency;
import academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);

        System.out.println(currency.getSymbol());
    }
}
