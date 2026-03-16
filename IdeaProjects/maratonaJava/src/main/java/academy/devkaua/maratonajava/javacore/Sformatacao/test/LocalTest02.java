package academy.devkaua.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOCountries();
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }
        System.out.println( );
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }


    }
}
