package academy.devkaua.maratonajava.introducao;

public class Aula03exercOperadoresLogicos {
    public static void main(String[] args) {
        //&& (AND) || (OR)
        float salario1 = 2600;
        boolean isDentroDaLei = salario1 >= 1500 && salario1 <= 4500;

        System.out.println("isDentroDaLei " + isDentroDaLei);

        double valorContaCorrente = 8500;
        double valorContaPoupanca = 800;
        float Play5 = 5000;

        boolean isPossivelComprarPlay5 = valorContaCorrente >= Play5 || valorContaPoupanca >= Play5;
        System.out.println("play5 " +isPossivelComprarPlay5);

        // =  +=  -=  *=  /=  %=

        // ++ --
        int contador = 0;

        contador++;
        System.out.println(contador);
    }
}
