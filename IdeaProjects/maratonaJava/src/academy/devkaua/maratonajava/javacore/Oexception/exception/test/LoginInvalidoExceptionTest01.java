package academy.devkaua.maratonajava.javacore.Oexception.exception.test;

import academy.devkaua.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String user = "kaua";
        String passwd = "123";
        System.out.println("Usuario: ");
        String userDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = scanner.nextLine();

        if (!user.equals(userDigitado) || !passwd.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Usuario ou Senha Invalido");
        }

        System.out.println("Login Concluido.");
    }
}
