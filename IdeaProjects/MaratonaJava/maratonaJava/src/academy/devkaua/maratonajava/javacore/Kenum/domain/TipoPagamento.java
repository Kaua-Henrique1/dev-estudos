package academy.devkaua.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1 ;
        }
    }, DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.03;
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
    }
}
