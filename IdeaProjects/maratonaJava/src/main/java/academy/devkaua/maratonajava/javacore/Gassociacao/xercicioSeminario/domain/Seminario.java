package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] estudante;
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] estudante) {
        this.titulo = titulo;
        this.local = local;
        this.estudante = estudante;
    }

    public void imprimi() {
        System.out.println("-------------");
        System.out.println("Seminario: ");
        System.out.println(this.titulo);
        System.out.println(this.local);
        System.out.println("-------------");
        System.out.println("Professor: "+this.professor.getNome());
        System.out.println("Especielidade: "+this.professor.getEspecielidade());
        System.out.println("-------------");

        if (estudante == null) return;
        System.out.println("-------------");
        System.out.println("Aluno(s): ");
        for ( Aluno aluno: this.estudante) {
            System.out.println(aluno.getNome());
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Aluno[] estudante) {
        this.estudante = estudante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
