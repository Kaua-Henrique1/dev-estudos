package academy.devkaua.maratonajava.javacore.ZZDstreams.domain;

public class LightNovel     {
    private String name;
    private double price;
    private Category category;

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public LightNovel(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
