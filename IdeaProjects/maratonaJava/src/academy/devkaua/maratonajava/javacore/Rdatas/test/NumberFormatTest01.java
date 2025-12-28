package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        Locale localBr = new Locale("pt", "BR");
        Locale localItalia = Locale.ITALIAN;
        Locale localChina = Locale.CHINA;

        NumberFormat[] num = new NumberFormat[4];
        num[0] = NumberFormat.getInstance();
        num[1] = NumberFormat.getInstance(localBr);
        num[2] = NumberFormat.getInstance(localItalia);
        num[3] = NumberFormat.getInstance(localChina);

        double valor = 100_000.2103;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
