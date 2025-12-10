package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor adcionado: " + valor + "\nSaldo :" + saldo);
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Tentavia de saque de " + valor + ". Saldo insuficiente." + "\nSaldo disponivel ao saque: " + saldo);
            return;
        }
        saldo -= valor;
        System.out.println("Saldo retirado com sucesso. " + "\nSaldo restante: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
