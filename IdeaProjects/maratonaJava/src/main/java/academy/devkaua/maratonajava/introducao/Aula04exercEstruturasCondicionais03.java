package academy.devkaua.maratonajava.introducao;

public class Aula04exercEstruturasCondicionais03 {
    public static void main(String[] args) {
        // Sintaxe de Operador ternário: (condicao) ? verdadeiro : false
        double salario = 6600;
        String mensagemDoar = "Voce pode doar!";
        String mensagemNaoPodeDoar = "Voce nao pode doar!";

        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoPodeDoar;

        System.out.println(resultado);
    }
}
