package academy.devkaua.maratonajava.introducao;

public class Aula05EstruturaRepeticao01 {
    public static void main(String[] args) {
         //while
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }

        //DO WHILE
        count = 0;
        do {
            System.out.println("Dentro do DO-WHILE"+ ++count);
        } while (count < 15);
            System.out.println(++count);

        //FOR
        for (int i=0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
