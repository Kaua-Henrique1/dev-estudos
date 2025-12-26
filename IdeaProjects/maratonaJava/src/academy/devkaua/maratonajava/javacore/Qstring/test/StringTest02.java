package academy.devkaua.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Kaua";
        String numeros = "01234";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length()); //Retorna o tamanho
        System.out.println(nome.replace("a", "o"));
        System.out.println(numeros.substring(1)); // Comeca do indice 1 e vai ate o final

    }
}
