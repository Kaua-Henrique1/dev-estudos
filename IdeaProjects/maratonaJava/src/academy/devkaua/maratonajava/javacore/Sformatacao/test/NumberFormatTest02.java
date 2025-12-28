package academy.devkaua.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localBr = new Locale("pt", "BR");
        Locale localItalia = Locale.ITALIAN;
        Locale localChina = Locale.CHINA;

        NumberFormat[] num = new NumberFormat[4];
        num[0] = NumberFormat.getInstance();
        num[1] = NumberFormat.getCurrencyInstance(localBr);
        num[2] = NumberFormat.getCurrencyInstance(localItalia);
        num[3] = NumberFormat.getCurrencyInstance(localChina);

        double valor = 100_000.2103;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.format(valor));
        }
        String valor2 = "100035";
        try {
            System.out.println(num[0].parse(valor2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
