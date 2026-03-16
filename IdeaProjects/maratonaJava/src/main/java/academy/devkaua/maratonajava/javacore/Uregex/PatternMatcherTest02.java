package academy.devkaua.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Todos os espacos em branco \f \t \n \r
        // \S = Todos os espacos que NAO ESTA em branco \f \t \n \r
        // \w = a-ZA-Z, Digitos, -
        // \W = Tudo que nao for incluso no /w
        String regex = "\\w";
        String texto = "##3rh bj4&5--5y 8@ofv";
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
