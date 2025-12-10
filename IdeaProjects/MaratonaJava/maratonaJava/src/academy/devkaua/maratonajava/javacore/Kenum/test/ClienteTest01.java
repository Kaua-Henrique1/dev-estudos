package academy.devkaua.maratonajava.javacore.Kenum.test;

import academy.devkaua.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devkaua.maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devkaua.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Kaua", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
