package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain;

public enum Especielidade {
    MATEMATICA("Matematica"),
    FISICA("Fisica"),
    QUIMICA("Quimica");

    private String descricao;

    Especielidade(String descricao) {
        this.descricao = descricao;
    }
}
