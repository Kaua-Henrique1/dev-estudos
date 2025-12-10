package academy.devkaua.maratonajava.introducao;

public class Aula04exercEstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 2;
        switch (dia){
            case 1:
                System.out.println("Fim de semana! HOJE E SABADO");
                break;
            case 2:
                System.out.println("Dia util! Hoje e segunda.");
                break;
            case 3:
                System.out.println("Dia util! Hoje e terca.");
                break;
            case 4:
                System.out.println("Dia util! Hoje e quarta.");
                break;
            case 5:
                System.out.println("Dia util! Hoje e quinta.");
                break;
            case 6:
                System.out.println("Dia util! Hoje e sexta.");
                break;
            case 7:
                System.out.println("Fim de semana! HOJE E SABADO");
                break;
            default:
                System.out.println("Opcao invalida");

        }
    }
}
