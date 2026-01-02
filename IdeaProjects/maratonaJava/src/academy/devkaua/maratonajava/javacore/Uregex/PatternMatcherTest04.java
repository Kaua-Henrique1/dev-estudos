package academy.devkaua.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Todos os espacos em branco \f \t \n \r
        // \S = Todos os espacos que NAO ESTA em branco \f \t \n \r
        // \w = a-zA-Z, Digitos, -
        // \W = Tudo que nao for incluso no /w
        // $ = Fim de linha
        // | = Ou

        // []
        // [a-zA-C]
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n, m} De n ate m
        // () Tipo uma condicional ex: (a/b)

        String regex = "0[xX]([0-9a-f-A-F])+(\\s+|$)";
        // Comece do 0 e x ou X.  0 a 9, a ate f, A a F. Adicionando Espaco Branco ou Fim de linha.
        String texto = "12 0x 0X 0xFFaBC 0X10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  "+ texto);
        System.out.println("Indice: 0123456");
        System.out.println("Regex: "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
