package academy.devkaua.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Erro ArithmeticException");
        } catch (RuntimeException e) {
            // A classe mais generica SEMPRE fica por ultimo.
            System.out.println("Erro RuntimeException");
        }


        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Da para juntar exceções e deixar o código mais legível.
            // OBS: Não pode usar uma class mais genérica junto com uma mais especifica.
            System.out.println("Erro ArrayIndexOutOfBoundsException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Erro RuntimeException");
        }
    }
}
