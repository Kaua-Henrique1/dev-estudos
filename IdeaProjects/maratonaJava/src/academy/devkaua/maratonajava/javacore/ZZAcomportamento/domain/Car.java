package academy.devkaua.maratonajava.javacore.ZZAcomportamento.domain;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
