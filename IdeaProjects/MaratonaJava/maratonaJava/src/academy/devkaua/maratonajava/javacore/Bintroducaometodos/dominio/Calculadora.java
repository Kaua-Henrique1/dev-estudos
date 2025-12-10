package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;
//Class
public class Calculadora {

    //Metedo
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    //Metedo com parametro
    //Metodo void nao exige retorno.
    public void multiplicacaoDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void divideDoisNumeros02(double num1, double num2){
        if (num2 == 0){
            System.out.println("Nao pode ser divido por zero.");
            return;
            //return: Esse return so pode ser usado no metodo void
            // Ele funciona que nem um , para nao continua o processo da linha de baixo.
        }
        System.out.println(num1 / num2);
    }

    public void somaArray(int [] numero) {
        int somar = 0;
        for (int num : numero ) {
            somar += num;
        }
        System.out.println(somar);
    }

    //Outra forma de representar a mesma coisa que esta acima.
    //So muda na chamada.
    public void somaVarArgs(int... numeros) {
        int somar = 0;
        for (int num : numeros ) {
            somar += num;
        }
        System.out.println(somar);
    }
}
