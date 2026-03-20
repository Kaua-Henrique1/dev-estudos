package academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {

        switch (country) {
            case USA:
                return new Dolar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No curreny found for this country");
        }
    }
}
