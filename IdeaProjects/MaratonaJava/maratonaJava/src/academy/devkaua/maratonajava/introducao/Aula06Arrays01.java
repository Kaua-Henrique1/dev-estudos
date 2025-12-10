package academy.devkaua.maratonajava.introducao;

public class Aula06Arrays01 {
    public static void main(String[] args) {
        //Listas
        //Diferentes tipos de retorno dependedo do tipo da Arrays.
        // int, long, float e double: 0
        //boolean: false
        // String: null

        //Forma de declarar uma lista
        int[] idades1 = {1, 2, 3, 4, 5, 6};
        //Forma simplificada de manipular uma lista
        for (int i: idades1){
            System.out.println(i);
        }

        //Forma de declarar uma lista
        int[] idades =  new int[3];
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;
        //Forma tradicional de manipular uma lista
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
