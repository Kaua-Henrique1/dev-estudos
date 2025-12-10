package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.test;

import academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain.*;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Seminario seminario1 = new Seminario("Fundamentos java", Local.SETOR1);
        Seminario seminario2 = new Seminario("Fundamentos python", Local.SETOR2);
        Seminario seminario3 = new Seminario("Fundamentos typescript", Local.SETOR3);

        Aluno aluno1 = new Aluno("Kaua", 19);
        Aluno aluno2 = new Aluno("Lucas", 23);

        Professor professor = new Professor("DevDojo", Especielidade.FISICA);
        Professor professor2 = new Professor("Igor", Especielidade.QUIMICA);

        seminario1.setProfessor(professor);
        seminario2.setProfessor(professor);
        seminario3.setProfessor(professor2);

        Aluno[] alunosSeminario1 = {aluno1, aluno2};
        seminario1.setEstudante(alunosSeminario1);

        Aluno[] alunosSeminario2 = {aluno1};
        seminario2.setEstudante(alunosSeminario2);

        System.out.println("--- seminario1 ---");
        seminario1.imprimi();

        System.out.println("--- seminario2 ---");
        seminario2.imprimi();

        System.out.println("--- seminario3 ---");
        seminario3.imprimi();

    }
}
