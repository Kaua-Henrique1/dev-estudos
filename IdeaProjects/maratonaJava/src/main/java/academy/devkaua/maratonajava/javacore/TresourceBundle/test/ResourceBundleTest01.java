package academy.devkaua.maratonajava.javacore.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        // Ele procura pela chave no nome do arquivo nas linguas que deixar escrito.
        // Se ele nao achar, ele procura numa ordem em cadeia, se mesmo ele pecorrendo as linguas e nao achar...
        // ele retorna nada.
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("en","US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hi"));
    }
}
