package academy.devkaua.maratonajava.javacore.Prapper.test;

import java.sql.SQLOutput;
import java.util.List;

public class WapperTest01 {
    public static void main(String[] args) {
        //Sempre que for possivel, usar o primitivo
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP ='P';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW ='W';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Integer test = Integer.parseInt("1"); // Transforma em um Integer

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.toLowerCase('A'));
    }
}
