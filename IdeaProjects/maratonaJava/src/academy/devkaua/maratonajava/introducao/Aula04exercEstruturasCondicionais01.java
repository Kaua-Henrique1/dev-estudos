package academy.devkaua.maratonajava.introducao;

public class Aula04exercEstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isMaiorIdade = idade >= 18;
        if (isMaiorIdade){
            System.out.println("Maior de idade, meus parabens!");
        }else {
            System.out.println("Voce ainda e de menor.");
        }

        if (isMaiorIdade == false){
            System.out.println("Voce ainda e de menor.");
        }
    //         if (!isMaiorIdade == false){
    //            System.out.println("Voce ainda e de menor.");
    //        }
    //      Poderia ter usado o ' ! ' como negacao no IF.

    }
}
