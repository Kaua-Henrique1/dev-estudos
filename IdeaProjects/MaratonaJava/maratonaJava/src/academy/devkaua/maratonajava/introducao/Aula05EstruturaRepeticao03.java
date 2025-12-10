package academy.devkaua.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula05EstruturaRepeticao03 {
    public static void main(String[] args) {
        double valorCarro= 50000;

        for (int i = 1; i <= valorCarro; i ++) {
            double valorParcela= valorCarro / i;
            if (valorParcela < 1000 ){
                break;
            }
            System.out.println("Quantidade de Parcela: "+ i +". Valor Parcela: "+ valorParcela);
        }
    }
}
