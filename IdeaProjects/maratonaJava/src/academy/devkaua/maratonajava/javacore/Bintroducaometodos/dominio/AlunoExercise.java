package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class AlunoExercise {
    public String nome;
    public int idade;
    public double[] notas;

    public void imprimirDados() {
        System.out.println(nome);
        System.out.println(idade);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        calcularMedia();
    }

    public void calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media /= 3;

        if (media >= 7) {
            System.out.println("Parabens, aprovado!\nSua media: " + media);
        } else if (media < 7 && media >= 5) {
            System.out.println("Ficou de recuperacao.\nSua media: " + media);
        } else {
            System.out.println("Ficou reprovado!\nSua media: " + media);
        }
    }
}
