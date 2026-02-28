package academy.devkaua.maratonajava.javacore.ZZCoptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int ep;

    public Manga(Integer id, String title, int ep) {
        this.id = id;
        this.title = title;
        this.ep = ep;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ep=" + ep +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getEp() {
        return ep;
    }
}
