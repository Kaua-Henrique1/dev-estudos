package academy.devkaua.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);

        System.out.println("Codigo finalizado");
    }
    private static int divisao(int a, int b) {
        // exceção unchecked
        if (b == 0){
            throw new IllegalArgumentException("Não pode ser 0");
        }
        return a/b;
    }
}
