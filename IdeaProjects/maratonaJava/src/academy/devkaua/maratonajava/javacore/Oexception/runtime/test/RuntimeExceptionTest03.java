package academy.devkaua.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }
    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo o Arquivo");
            return "Conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally SEMPRE E EXECUTADO.
            System.out.println("Fechando o recurso do SO de Arquivo");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo o Arquivo");
        } finally {
            // finally SEMPRE E EXECUTADO.
            System.out.println("Fechando o recurso do SO de Arquivo");
        }
    }
}
