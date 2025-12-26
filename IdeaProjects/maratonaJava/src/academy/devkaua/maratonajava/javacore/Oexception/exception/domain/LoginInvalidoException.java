package academy.devkaua.maratonajava.javacore.Oexception.exception.domain;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}
