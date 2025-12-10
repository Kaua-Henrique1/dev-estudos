package academy.devkaua.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arraayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase : arraayInt2){
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
