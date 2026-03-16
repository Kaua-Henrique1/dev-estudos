package academy.devkaua.maratonajava.javacore.Xcolecoes.domain;

public class Smartphone {
    private String marca;
    private String serialNumber;

    public Smartphone(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;

        // Aqui ele verifica se o obj é um telefone, onde ele pega o "DNA" da class this.getClass() (Smartphone) e compara se é diferente do "DNA" do obj.
        if (this.getClass() != obj.getClass() ) return false;
        // Aqui como temos certeza, falo para o java confia que o objeto e Smartphone e pego o valor do objeto.
        Smartphone smartphone = (Smartphone) obj;

        // Faço a comparação para ver se o objeto é o mesmo objeto (Aqui tem a regra de negócio onde verificamos apenas o
        // serialNumber para saber se duas instância representa mesmo objeto
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // Ler ternário: (condition) '?' (Se for verdadeiro faça) ':' (se nao faça);
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    // Se usar dois atributos para a verificação no equals, devem ser os mesmo atributos no hashcode.ã

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
