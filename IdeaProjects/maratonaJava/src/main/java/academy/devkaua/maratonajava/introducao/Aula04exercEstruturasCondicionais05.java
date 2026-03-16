package academy.devkaua.maratonajava.introducao;

public class Aula04exercEstruturasCondicionais05 {
    public static void main(String[] args) {
        //Switch case
        // char, int, byte, short, enum, String
        int dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
            //default: Para se nenhum case bater... Recebe essa mensagem.
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

    }
}
