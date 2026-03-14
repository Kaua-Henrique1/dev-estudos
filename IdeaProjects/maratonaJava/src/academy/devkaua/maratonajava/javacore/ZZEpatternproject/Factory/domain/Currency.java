package academy.devkaua.maratonajava.javacore.ZZEpatternproject.Factory.domain;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class Dolar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}