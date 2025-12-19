package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //Essa forma nao e tao coesa.
    // Dentro dessa classe existe as variaveis por referencia e um metodo.
    public void imprime(){
        System.out.println("--------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}