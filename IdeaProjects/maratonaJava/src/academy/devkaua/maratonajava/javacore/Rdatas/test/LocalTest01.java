package academy.devkaua.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale local = new Locale("it","IT");
        Locale localBr = new Locale("pt","BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, local);
        DateFormat dateF = DateFormat.getDateInstance(DateFormat.FULL, localBr);

        System.out.println("Italia: "+dateFormat.format(calendar.getTime()));
        System.out.println("Brasil: "+dateF.format(calendar.getTime()));

        System.out.println(localBr.getDisplayCountry(local));
    }
}
