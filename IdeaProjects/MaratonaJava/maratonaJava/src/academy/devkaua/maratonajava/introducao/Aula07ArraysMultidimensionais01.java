package academy.devkaua.maratonajava.introducao;

public class Aula07ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Forma para declarar uma Matriz
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println(":--------------------------------------:");
        //Foreach:
        for (int[] arrBase:dias){
            for (int i: arrBase){
                System.out.println(i);
            }
        }
        //Resumo da diferença:
        //No for tradicional, você manipula índices (dias[i][j]).
        //No foreach, você manipula diretamente os valores (primeiro recebe uma linha, depois os números da linha).

    }
}
