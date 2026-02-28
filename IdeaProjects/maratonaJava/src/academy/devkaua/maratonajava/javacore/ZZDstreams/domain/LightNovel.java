package academy.devkaua.maratonajava.javacore.ZZDstreams.domain;

public class LightNovel {
    private String name;
    private double price;

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
