package academy.devkaua.maratonajava.introducao;

public class Aula05EstruturaRepeticao02 {
    public static void main(String[] args) {
        //Exercicio: for
        int count = 0;
        for (int i=0;i <= 1000000 ;i++){
            if (i%2 == 0) {
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println("a quantidade de numeros impa: "+ count);
    }
}
