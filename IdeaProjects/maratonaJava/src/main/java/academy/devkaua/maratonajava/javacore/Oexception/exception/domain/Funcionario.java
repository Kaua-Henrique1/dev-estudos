package academy.devkaua.maratonajava.javacore.Oexception.exception.domain;


import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    // Posso fazer o tratamento com apenas uma excecao ou com outra class mais especifica ou de irmao.
    // OBS: Nao pode ser mais generica.
    @Override
    public void salvar() throws LoginInvalidoException{
        try {
            super.salvar();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
