package academy.devkaua.maratonajava.javacore.Hherenca.domain;

public class Pessoa {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filna
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
    // 4- Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    //6 - Alocado espaco em memoria pro objeto da subclasse
    //7- Cada atributo de subclasse e criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    protected String cpf;
    protected String nome;
    protected Endereco endereco;

    public Pessoa (String nome) {
        this.nome = nome;
    }

    public void imprimi() {
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
